package smart_city_simulator_project;
import java.io.FileNotFoundException;
import java.io.FileReader;
import com.opencsv.CSVReader;

public class SmartCitySimulation {
    public static void main(String[] args) {
        TrafficManagement trafficManagement = new TrafficManagement();
        SmartLighting smartLighting = new SmartLighting();
        EnvironmentalMonitoring environmentalMonitoring = new EnvironmentalMonitoring();

        Thread trafficThread = new Thread(trafficManagement);
        Thread lightingThread = new Thread(smartLighting);
        Thread monitoringThread = new Thread(environmentalMonitoring);

        trafficThread.start();
        lightingThread.start();
        monitoringThread.start();

        try {
            trafficThread.join();
            lightingThread.join();
            monitoringThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}