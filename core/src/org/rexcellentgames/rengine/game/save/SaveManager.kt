package org.rexcellentgames.rengine.game.save

import com.badlogic.gdx.Gdx

object SaveManager {
	const val saveDirectoryName = "burningknight"

	fun createSaveDirectory() {
		val dir = Gdx.files.external(saveDirectoryName)

		if (dir.exists()) {
			return
		}

		dir.file().createNewFile()
	}
}