import robot.Robot
import robot.commands.CommandFactory
import robot.commands.ICommand
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    var robot: Robot? = null

    while (true) {
        print("> ")

        // var -> val - Intellij Idea inspection
        val input = readLine() ?: exitProcess(1)
        val tokens = input.toLowerCase().split("(,| )+".toRegex()).toTypedArray()
        val command: ICommand = CommandFactory(tokens)

        robot = command.exec(robot)
    }
}
