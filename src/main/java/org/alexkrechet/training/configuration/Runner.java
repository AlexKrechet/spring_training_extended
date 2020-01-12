package org.alexkrechet.training.configuration;

import org.alexkrechet.training.configuration.entity.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main (String [] arg){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        //Since there is no call for a one simple bean, no need keep this from below
//        Music music = context.getBean("musicBean", Music.class);

//        MusicPlayer musicPlayer = new MusicPlayer(music);
//
//        musicPlayer.playMusic();

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
