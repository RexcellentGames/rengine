package org.rexcellentgames.rengine.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import org.rexcellentgames.burningknight.App;
import org.rexcellentgames.burningknight.game.AssetLoadState;
import org.rexcellentgames.rengine.Engine;

public class DesktopLauncher {
	public static void main(String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		new LwjglApplication(new Engine(new App(new AssetLoadState())), config);
	}
}