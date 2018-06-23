package org.rexcellentgames.rengine.assets

import com.badlogic.gdx.assets.AssetManager
import org.rexcellentgames.rengine.assets.mod.ModManager

object Assets {
	lateinit var manager: AssetManager
	private var done = false

	fun init() {
		manager = AssetManager()

		Audio.loadAssets()
		Graphics.targetAssets()
		ModManager.targetAssets()
	}

	fun updateLoading(): Boolean {
		if (done) {
			return true
		}

		if (manager.update()) {
			done = true
			onLoadingFinish()

			return true
		}

		return false
	}

	fun finishLoading() {
		manager.finishLoading()
		onLoadingFinish()
	}

	fun onLoadingFinish() {
		Audio.loadAssets()
		Graphics.loadAssets()
		ModManager.loadAssets()
	}

	fun destroy() {
		manager.dispose()
	}
}