package robot

import java.util.*

enum class Direction {
    NORTH, EAST, SOUTH, WEST;

    fun rotate(step: Int): Direction {
        val index   = Direction.values().indexOf(this)
        val compass = Direction.values().asList()

        Collections.rotate(compass, step)

        return compass.get(index)
    }
}


