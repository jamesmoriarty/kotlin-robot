
import robot.Board
import robot.ICommand
import robot.NullCommand
import robot.Robot

fun factory(args: Array<String>): ICommand {
    try {
        var className          = args.first().capitalize()
        var commandClass       = Class.forName("robot.$className").kotlin
        var command : ICommand = commandClass.constructors.first().call(args) as ICommand

        return command
    }
    catch (e: IllegalArgumentException) {
        println("wrong args: ${args.toString()}")
        return NullCommand(*args)
    }
    catch (e: ArrayIndexOutOfBoundsException) {
        println("wrong number of args: ${args.toString()}")
        return NullCommand(*args)
    }
    catch (e: ClassNotFoundException) {
        println("command not found args: ${args.toString()}")
        return NullCommand(*args)
    }
}

fun main(args: Array<String>) {
    var board         = Board()
    var robot: Robot? = null

    while(true) {
        print("> ")

        var tokens             = readLine()!!.toLowerCase().split("(,| )+".toRegex())
        var command : ICommand = factory(tokens.toTypedArray())

        robot = command.exec(robot)
    }
}
