package com.music.musicapp.controller;

import com.music.musicapp.entity.Singer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppController {

    Singer singer ;


    @Autowired
    public void setSinger (Singer theSinger){

        singer = theSinger;
    }

    @RequestMapping("/theweeknd")
    public List<String> getSongs() {
        return singer.getSongs();
    }

}
