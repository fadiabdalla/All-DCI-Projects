package IoT_example.exercise.entity;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements Engine{
    @Override
    public String start() {
        return "Diesel Engine Starting...";
    }
}