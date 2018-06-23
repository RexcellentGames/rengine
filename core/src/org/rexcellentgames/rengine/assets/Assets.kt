package org.rexcellentgames.rengine.assets

import com.badlogic.gdx.assets.AssetManager

object Assets {
	lateinit var manager: AssetManager
	private var done = false

	fun init() {
		manager = AssetManager()

		Audio.loadAssets()
		Graphics.targetAssets()
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
	}

	fun destroy() {
		manager.dispose()
	}
}