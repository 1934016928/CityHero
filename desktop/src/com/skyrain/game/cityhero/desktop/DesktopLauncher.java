package com.skyrain.game.cityhero.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.skyrain.game.cityhero.MainGame;

public class DesktopLauncher {
    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "CityHero";
        config.vSyncEnabled = false;
        config.width = 960;
        config.height = 540;
        config.useGL30 = true;

        new LwjglApplication(new MainGame(), config);
    }
}
