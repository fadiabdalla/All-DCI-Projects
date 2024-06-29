package com.wellness.wellnessApp.entity;

import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class WellnessCoach implements Coach {

    List<String> wellnessExercises = List.of("Seven Most Effective Exercises: ",
            "1. Walking ",
            "2. Interval training·",
            "3. Squats ",
            "4. Lunges ",
            "5. Push-ups",
            "6. Abdominal Crunches",
            "7. Bent-over Row.");


    @Override
    public List<String> getWorkoutExercises() {
        return wellnessExercises;
    }
}
