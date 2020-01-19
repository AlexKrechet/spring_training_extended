package org.alexkrechet.training.configuration.entity;

import org.alexkrechet.training.configuration.Music;

import java.util.ArrayList;
import java.util.List;

public class PopMusic implements Music {
    private List<String> listOfPop = new ArrayList<>();

    @Override
    public List<String> getSong() {
        listOfPop.add("One more time");
        listOfPop.add("Lady in red");
        listOfPop.add("Love me");
        return listOfPop;
    }
}