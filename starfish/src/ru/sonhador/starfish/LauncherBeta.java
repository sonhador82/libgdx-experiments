package ru.sonhador.starfish;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class LauncherBeta {
    public static void main(String[] args)
    {
        Game myGame = new StarfishCollectorBeta();
        LwjglApplication launcher = new LwjglApplication(myGame, "Starfish Collector", 800, 600);
    }
}
