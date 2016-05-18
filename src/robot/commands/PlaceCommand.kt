package robot.commands

import robot.Robot
import robot.Direction
import robot.isOnBoard

class PlaceCommand(vararg args: String) : ICommand {
    var direction: Direction = Direction.valueOf(args[1].toUpperCase())
    var x: Int               = args[2].toInt()
    var y: Int               = args[3].toInt()

    override fun exec(robot: Robot?): Robot? {
        var newRobot = Robot(direction, x, y)

        if (isOnBoard(newRobot)) {
            return newRobot
        } else {
            return robot
        }
    }
}
