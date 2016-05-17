package robot

class ReportCommand(vararg args: String) : ICommand {
    override fun exec(robot: Robot?): Robot? {
      println(robot)

      return robot
    }

}