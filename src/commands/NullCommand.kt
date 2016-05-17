package robot

class NullCommand(vararg args: String) : ICommand {
    override fun exec(robot: Robot?): Robot? = robot
}