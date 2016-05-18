package test

import org.junit.Assert
import org.junit.Test
import robot.Direction
import robot.commands.PlaceCommand
import robot.Robot

class PlaceCommandTest {
    @Test
    fun testExecFail() {
        Assert.assertEquals(PlaceCommand("PLACE","WEST", "-1", "-1").exec(null), null)
    }

    @Test
    fun testExecSuccess() {
        Assert.assertEquals(PlaceCommand("PLACE","WEST", "1", "1").exec(null), Robot(Direction.WEST, 1, 1))
    }
}