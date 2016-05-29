package robot.commands

import robot.Direction
import robot.Robot
import robot.isOnBoard

class PlaceCommand(var direction: Direction, val x: Int, val y: Int) : ICommand {
    override fun exec(robot: Robot?): Robot? {
        val newRobot = Robot(direction, x, y)

        if (isOnBoard(newRobot)) {
            return newRobot
        } else {
            return robot
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other?.javaClass != javaClass) return false

        other as PlaceCommand

        if (x != other.x) return false
        if (y != other.y) return false
        if (direction != other.direction) return false

        return true
    }

    // Read about contract between hashcode and equals
    // And i think rewrite it to `data class`
    // Because data classes already have implemented hashCode/equals methods
    override fun hashCode(): Int {
        var result = direction.hashCode()
        result = 31 * result + x
        result = 31 * result + y
        return result
    }
}


// Example of data-class:
data class DataPlaceCommand(var direction: Direction, val x: Int, val y: Int) : ICommand {
    override fun exec(robot: Robot?): Robot? {
        val newRobot = Robot(direction, x, y)

        if (isOnBoard(newRobot)) {
            return newRobot
        } else {
            return robot
        }
    }
}