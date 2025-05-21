package com.kaiv.patterns.Behavioral.Command;

public class Main {

    public static void main(String[] args) {

        Command lightCommand = new LightCommand(new Light());
        Command playMusicCommand = new PlayMusicCommand(new MusicPlayer());
        LighAndMusicCommand lighAndMusicCommand = new LighAndMusicCommand(new MusicPlayer(), new Light());

        Button button = new Button(lighAndMusicCommand);
        button.pressButton();

    }
}
