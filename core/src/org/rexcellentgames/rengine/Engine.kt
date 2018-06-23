package org.rexcellentgames.rengine

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import org.rexcellentgames.rengine.assets.Assets
import org.rexcellentgames.rengine.game.Game

open class Engine(app: Game) : ApplicationAdapter() {
	companion object {
		lateinit var game: Game
		var speed = 1f
	}

	private val instance: Game = app

	override fun create() {
		Assets.init()

		game = instance
		game.init()
	}

	override fun render() {
		val dt = Gdx.graphics.deltaTime

		game.update(dt * speed)
		game.render()
	}

	override fun dispose() {
		game.destroy()

		Assets.destroy()
	}
}
