package smart_city_simulator_project;

import java.time.LocalTime;

class SmartLighting implements Runnable {
    public void run() {
        while (true) {
            LocalTime currentTime = LocalTime.now();
            // Adjust street light brightness based on currentTime
            // Implement your logic here
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}