import robot.Robot
import robot.commands.CommandFactory
import robot.commands.ICommand
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    var robot: Robot? = null

    while (true) {
        print("> ")

        var input = readLine() ?: exitProcess(1)
        var tokens = input.toLowerCase().split("(,| )+".toRegex()).toTypedArray()
        var command: ICommand = CommandFactory(tokens)

        robot = command.exec(robot)
    }
}
