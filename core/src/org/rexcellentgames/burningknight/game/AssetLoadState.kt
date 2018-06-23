package org.rexcellentgames.burningknight.game

import org.rexcellentgames.rengine.Engine
import org.rexcellentgames.rengine.assets.Assets
import org.rexcellentgames.rengine.game.State

class AssetLoadState : State() {
	companion object {
		const val startToMenu = true
	}

	override fun update(dt: Float) {
		super.update(dt)

		if (startToMenu) {
			if (Assets.updateLoading()) {
				Engine.game.state = InGameState()
			}
		} else {
			Assets.finishLoading()
			Engine.game.state = InGameState()
		}
	}
}