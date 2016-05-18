import robot.Factory
import robot.Robot
import robot.commands.ICommand

fun main(args: Array<String>) {
    var robot: Robot? = null

    while(true) {
        var tokens             = readLine()!!.toLowerCase().split("(,| )+".toRegex())
        var command : ICommand = Factory(tokens.toTypedArray())

        robot = command.exec(robot)
    }
}
