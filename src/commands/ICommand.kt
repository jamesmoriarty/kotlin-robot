package robot

interface ICommand {
    fun exec(robot: Robot?): Robot?
}
