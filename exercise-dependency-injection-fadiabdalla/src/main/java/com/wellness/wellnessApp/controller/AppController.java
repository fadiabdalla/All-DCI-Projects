package com.wellness.wellnessApp.controller;

import com.wellness.wellnessApp.entity.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppController {

    private Coach coach;




    @Autowired
    public AppController( Coach theCoach){

        coach = theCoach;
    }


    @GetMapping("/get-exercises")
    public List<String> getExercise (){
        return coach.getWorkoutExercises();
    }

}
