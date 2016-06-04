package test.commands

import org.junit.Assert
import org.junit.Test
import robot.Direction
import robot.commands.PlaceCommand
import robot.Robot

class PlaceCommandTest {
    @Test
    fun execFail() {
        Assert.assertEquals(PlaceCommand("PLACE","WEST", "-1", "-1").exec(null), null)
    }

    @Test
    fun execSuccess() {
        Assert.assertEquals(PlaceCommand("PLACE","WEST", "1", "1").exec(null), Robot(Direction.WEST, 1, 1))
    }
}
