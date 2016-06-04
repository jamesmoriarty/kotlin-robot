package test

import org.junit.Assert
import org.junit.Test
import robot.Direction

class DirectionTest {
    @Test
    fun rotateDirectionLeft() {
        Assert.assertEquals(Direction.NORTH.rotate(1), Direction.WEST)
    }

    @Test
    fun rotateDirectionRight() {
        Assert.assertEquals(Direction.NORTH.rotate(-1), Direction.EAST)
    }

    @Test
    fun rotateDirectionLoop() {
        Assert.assertEquals(Direction.NORTH.rotate(4), Direction.NORTH)
    }
}
