import robot.Robot
import robot.commands.CommandFactory
import robot.commands.ICommand

fun main(args: Array<String>) {
    var robot: Robot? = null

    while(true) {
        print("> ")

        var tokens             = readLine()!!.toLowerCase().split("(,| )+".toRegex()).toTypedArray()
        var command : ICommand = CommandFactory(tokens)

        robot = command.exec(robot)
    }
}
