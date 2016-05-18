package test

import org.junit.Assert
import org.junit.Test
import robot.Board
import robot.Direction
import robot.Robot
import robot.isOnBoard

class RobotTest {

    @Test
    fun testIsOnBoardTop() {
        Assert.assertFalse(isOnBoard(Robot(Direction.NORTH, 0, 1, Board(1, 1))))
    }

    @Test
    fun testIsOnBoardRight() {
        Assert.assertFalse(isOnBoard(Robot(Direction.NORTH, 1, 0, Board(1, 1))))
    }

    @Test
    fun testIsOnBoardBottom() {
        Assert.assertFalse(isOnBoard(Robot(Direction.NORTH, 0, -1, Board(1, 1))))
    }

    @Test
    fun testIsOnBoardLeft() {
        Assert.assertFalse(isOnBoard(Robot(Direction.NORTH, -1, 0, Board(1, 1))))
    }

    @Test
    fun testIsOnBoard() {
        Assert.assertTrue(isOnBoard(Robot(Direction.NORTH, 0, 0, Board(1, 1))))
    }
}