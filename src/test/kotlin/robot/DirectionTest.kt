package robot

import org.junit.Assert
import org.junit.Test

class DirectionTest {
    @Test
    fun testRotatedDirectionLeft() {
        Assert.assertEquals(rotatedDirection(Direction.NORTH, 1), Direction.WEST)
    }

    @Test
    fun testRotatedDirectionRight() {
        Assert.assertEquals(rotatedDirection(Direction.NORTH, -1), Direction.EAST)
    }

    @Test
    fun testRotatedDirectionLoop() {
        Assert.assertEquals(rotatedDirection(Direction.NORTH, 4), Direction.NORTH)
    }
}
