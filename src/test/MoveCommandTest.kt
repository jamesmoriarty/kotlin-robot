package test

import org.junit.Assert
import org.junit.Test
import robot.Direction
import robot.Robot
import robot.commands.MoveCommand

class MoveCommandTest {
    @Test
    fun testExecNull() {
        Assert.assertEquals(MoveCommand("Move").exec(null), null)
    }

    @Test
    fun testExecFail() {
        var robot = Robot(Direction.NORTH, 1, 4)
        Assert.assertEquals(MoveCommand("Move").exec(robot), Robot(Direction.NORTH, 1, 4))
    }

    @Test
    fun testExecSuccess() {
        var robot = Robot(Direction.NORTH, 1, 1)
        Assert.assertEquals(MoveCommand("Move").exec(robot), Robot(Direction.NORTH, 1, 2))
    }
}