package org.alexkrechet.training.configuration.entity;

import org.alexkrechet.training.configuration.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> listOfRock = new ArrayList<>();
    @Override
    public List<String> getSong() {
        listOfRock.add("Wind cries Mary");
        listOfRock.add("Crazy train");
        listOfRock.add("November rain");
        return listOfRock;
    }
}