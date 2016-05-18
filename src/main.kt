
import robot.Robot
import robot.commands.CommandFactory
import robot.commands.ICommand

fun main(args: Array<String>) {
    var robot: Robot? = null

    while(true) {
        var tokens             = readLine()!!.toLowerCase().split("(,| )+".toRegex())
        var command : ICommand = CommandFactory(tokens.toTypedArray())

        robot = command.exec(robot)
    }
}
