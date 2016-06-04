import robot.Robot
import robot.commands.Command

fun main(args: Array<String>) {
    var robot: Robot? = null

    while(true) {
        print("> ")

        val input             = readLine() ?: break
        val args              = input.toLowerCase().split("(,| )+".toRegex()).toTypedArray()
        val command : Command = Command.factory(args)

        robot = command.exec(robot)
    }
}
