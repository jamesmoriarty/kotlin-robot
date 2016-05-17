package robot

class PlaceCommand(vararg args: String) : ICommand {
    private var direction: Direction = Direction.valueOf(args[1].toUpperCase())
    private var x: Int               = args[2].toInt()
    private var y: Int               = args[3].toInt()

    override fun exec(robot: Robot?): Robot? {
        var newRobot = Robot(direction, x, y)

        if (isOnBoard(newRobot)) {
            return newRobot
        } else {
            return robot
        }
    }
}
