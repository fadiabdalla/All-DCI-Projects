package smart_city_simulator_project;

class EnvironmentalMonitoring implements Runnable {
    private Sensor airQualitySensor;
    private Sensor noiseLevelSensor;
    private Sensor temperatureSensor;

    public EnvironmentalMonitoring() {
        airQualitySensor = new Sensor("Air Quality");
        noiseLevelSensor = new Sensor("Noise Level");
        temperatureSensor = new Sensor("Temperature");
    }

    public void run() {
        while (true) {
        	 try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
            // Measure environmental data
            airQualitySensor.measure();
            noiseLevelSensor.measure();
            temperatureSensor.measure();

            // Print or use the measured data as needed
            System.out.println(airQualitySensor);
            System.out.println(noiseLevelSensor);
            System.out.println(temperatureSensor);

            try {
                Thread.sleep(10000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}