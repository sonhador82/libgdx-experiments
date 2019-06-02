package ru.sonhador.helloworld;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class Launcher {
    public static void main(String[] args){
        HelloWorldImage myProgram = new HelloWorldImage();
        LwjglApplication launcher = new LwjglApplication(myProgram);
    }
}
