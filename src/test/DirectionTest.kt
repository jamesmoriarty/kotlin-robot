package test

import org.junit.Assert
import org.junit.Test
import robot.Direction

class DirectionTest {
    @Test
    fun testRotatedDirectionLeft() {
        Assert.assertEquals(Direction.NORTH.rotate(1), Direction.WEST)
    }

    @Test
    fun testRotatedDirectionRight() {
        Assert.assertEquals(Direction.NORTH.rotate(-1), Direction.EAST)
    }

    @Test
    fun testRotatedDirectionLoop() {
        Assert.assertEquals(Direction.NORTH.rotate(4), Direction.NORTH)
    }
}
