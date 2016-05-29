package robot.commands

import robot.Robot

class NullCommand(vararg args: String) : ICommand {
    override fun exec(robot: Robot?): Robot? {
      println("INVALID COMMAND")

      return robot
    }
}
