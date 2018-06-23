package org.rexcellentgames.rengine.assets.mod

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.utils.JsonReader

object ModManager {
	var loaded = arrayListOf<Mod>()

	fun targetAssets() {

	}

	fun loadAssets() {
		val dir = Gdx.files.internal("mods")
	}
}