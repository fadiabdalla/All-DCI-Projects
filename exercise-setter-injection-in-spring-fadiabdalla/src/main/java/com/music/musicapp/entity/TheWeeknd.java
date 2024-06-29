package com.music.musicapp.entity;


import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TheWeeknd implements Singer {

    List<String> songs = List.of("The Weeknd songs:",
                                 "1. Blinding lights - The Weeknd",
                                 "2. All I Know - The Weeknd",
                                 "3. Alone Again - The Weeknd",
                                 "4. Angel - The Weeknd ",
                                 "5. As You Are - The Weeknd");


    @Override
    public List<String> getSongs() {
        return songs;
    }
}
