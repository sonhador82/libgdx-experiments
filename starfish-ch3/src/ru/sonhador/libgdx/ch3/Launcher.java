package ru.sonhador.libgdx.ch3;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class Launcher {
    public static void main(String[] args)
    {
        Game myGame = new StarfishCollector();
        LwjglApplication launcher = new LwjglApplication(myGame, "Starfish collector", 800, 600);
    }
}
