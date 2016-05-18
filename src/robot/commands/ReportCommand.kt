package robot.commands

import robot.Robot

class ReportCommand(vararg args: String) : ICommand {
    override fun exec(robot: Robot?): Robot? {
        robot?.let { println("${robot.direction} ${robot.x} ${robot.y}") }

      return robot
    }

}