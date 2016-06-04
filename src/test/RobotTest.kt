package test

import org.junit.Assert
import org.junit.Test
import robot.Board
import robot.Direction
import robot.Robot

class RobotTest {

    @Test
    fun testIsOnBoardTop() {
        Assert.assertFalse(Robot(Direction.NORTH, 0, 1, Board(1, 1)).isOnBoard())
    }

    @Test
    fun testIsOnBoardRight() {
        Assert.assertFalse(Robot(Direction.NORTH, 1, 0, Board(1, 1)).isOnBoard())
    }

    @Test
    fun testIsOnBoardBottom() {
        Assert.assertFalse(Robot(Direction.NORTH, 0, -1, Board(1, 1)).isOnBoard())
    }

    @Test
    fun testIsOnBoardLeft() {
        Assert.assertFalse(Robot(Direction.NORTH, -1, 0, Board(1, 1)).isOnBoard())
    }

    @Test
    fun testIsOnBoard() {
        Assert.assertTrue(Robot(Direction.NORTH, 0, 0, Board(1, 1)).isOnBoard())
    }
}