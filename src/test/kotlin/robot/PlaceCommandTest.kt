package robot

import org.junit.Assert
import org.junit.Test
import robot.commands.PlaceCommand

class PlaceCommandTest {
    @Test
    fun testExecFail() {
        Assert.assertEquals(PlaceCommand(Direction.WEST, -1, -1).exec(null), null)
    }

    @Test
    fun testExecSuccess() {
        Assert.assertEquals(PlaceCommand(Direction.WEST, 1, 1).exec(null), Robot(Direction.WEST, 1, 1))
    }
}