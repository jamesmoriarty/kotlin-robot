package robot.commands

import robot.Robot

class NullCommand(val error: String) : ICommand {
    override fun exec(robot: Robot?): Robot? {
        println("INVALID COMMAND: $error")

      return robot
    }
}
