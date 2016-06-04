package test

import org.junit.Assert
import org.junit.Test
import robot.Board
import robot.Direction
import robot.Robot

class RobotTest {
    @Test
    fun isOnBoardTop() {
        Assert.assertFalse(Robot(Direction.NORTH, 0, 1, Board(1, 1)).isOnBoard())
    }

    @Test
    fun isOnBoardRight() {
        Assert.assertFalse(Robot(Direction.NORTH, 1, 0, Board(1, 1)).isOnBoard())
    }

    @Test
    fun isOnBoardBottom() {
        Assert.assertFalse(Robot(Direction.NORTH, 0, -1, Board(1, 1)).isOnBoard())
    }

    @Test
    fun isOnBoardLeft() {
        Assert.assertFalse(Robot(Direction.NORTH, -1, 0, Board(1, 1)).isOnBoard())
    }

    @Test
    fun isOnBoard() {
        Assert.assertTrue(Robot(Direction.NORTH, 0, 0, Board(1, 1)).isOnBoard())
    }
}
