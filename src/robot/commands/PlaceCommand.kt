package robot.commands

import robot.Direction
import robot.Robot

class PlaceCommand(vararg args: String) : Command {
    val direction: Direction = Direction.valueOf(args[1].toUpperCase())
    val x: Int               = args[2].toInt()
    val y: Int               = args[3].toInt()

    override fun exec(robot: Robot?): Robot? {
        val newRobot = Robot(direction, x, y)

        if (newRobot.isOnBoard()) {
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
