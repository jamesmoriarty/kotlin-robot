package robot.commands

import robot.Robot

class ReportCommand(vararg args: String) : ICommand {
    override fun exec(robot: Robot?): Robot? {
      println(robot)

      return robot
    }

}