package org.rexcellentgames.rengine.desktop;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import org.rexcellentgames.burningknight.App;
import org.rexcellentgames.burningknight.game.AssetLoadState;
import org.rexcellentgames.rengine.Engine;

public class DesktopLauncher {
	public static void main(String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();

		// todo, config the app here

		new Lwjgl3Application(new Engine(new App(new AssetLoadState())), config);
	}
}