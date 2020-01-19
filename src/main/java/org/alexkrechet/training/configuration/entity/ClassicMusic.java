package org.alexkrechet.training.configuration.entity;

import org.alexkrechet.training.configuration.Music;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class ClassicMusic implements Music {
    private List<String> listOfClassic = new ArrayList<>();
    private ClassicMusic(){}

    public static ClassicMusic getClassicMusic(){
        return new ClassicMusic();
    }

    @PostConstruct
    public void initializationMethod(){
        System.out.println("Doing bean initialization");
    }

    @PreDestroy
    public void destroyMethod(){
        System.out.println("Doing bean destruction");
    }

    @Override
    public List<String> getSong() {
    listOfClassic.add("Hungarian Rhapsody");
    listOfClassic.add("Ave Verum Corpus");
    listOfClassic.add("Ave Maria");
    return listOfClassic;
    }
}
