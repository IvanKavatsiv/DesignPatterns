package com.kaiv.patterns.Behavioral.Command;

public class LighAndMusicCommand implements Command{

    MusicPlayer musicPlayer;

    Light light;

    public LighAndMusicCommand(MusicPlayer musicPlayer, Light light) {
        this.musicPlayer = musicPlayer;
        this.light = light;
    }

    @Override
    public void execute() {
        musicPlayer.playMusic();
        light.switchLight();
    }
}
