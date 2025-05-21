package com.kaiv.patterns.Behavioral.Command;

public class PlayMusicCommand implements Command {

    MusicPlayer musicPlayer;

    public PlayMusicCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.playMusic();
    }
}
