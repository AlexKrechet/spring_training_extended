package org.alexkrechet.training.configuration.entity;

import org.alexkrechet.training.configuration.Music;

public class MusicPlayer {
    private Music music;

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void playMusic(){
        System.out.println("Playing : " + music.getSong());
    }
}
