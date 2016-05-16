package robot

class Report(vararg args: String) : ICommand {
    override fun exec(robot: Robot?): Robot{
      println(robot)

      return robot as Robot
    }

}