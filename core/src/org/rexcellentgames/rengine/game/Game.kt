package org.rexcellentgames.rengine.game

open class Game(state: State) {
    var state: State = state
        set(value) {
            state.destroy()
            field = value
            state.init()
        }

    fun init() {
        state.init()
    }

    fun destroy() {
        state.destroy()
    }

    fun update(dt: Float) {
        state.update(dt)
    }

    fun render() {
        state.render()
    }
}