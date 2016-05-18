package robot.commands

import robot.Direction
import robot.Robot
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

    override fun equals(other: Any?): Boolean{
        if (this === other) return true
        if (other?.javaClass != javaClass) return false

        other as PlaceCommand

        if (x         != other.x)         return false
        if (y         != other.y)         return false
        if (direction != other.direction) return false

        return true
    }
}
