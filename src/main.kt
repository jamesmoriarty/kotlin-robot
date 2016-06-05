import robot.Robot
import robot.commands.Command

fun main(args: Array<String>) {
    generateSequence { readLine() }.fold<String, Robot?>(null, { robot, input ->
        val arguments        = input.toLowerCase().split("(,| )+".toRegex()).toTypedArray()
        val command: Command = Command.factory(arguments)

        command.exec(robot)
    })
}
