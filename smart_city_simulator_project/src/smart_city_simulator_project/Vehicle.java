package smart_city_simulator_project;

class Vehicle {
    private String vehicleType;
    private String registrationNumber;
    private double currentSpeed;

    public Vehicle(String vehicleType, String registrationNumber) {
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
        this.currentSpeed = 0.0;
    }

    public void accelerate(double speedIncrease) {
        currentSpeed += speedIncrease;
    }

    public void brake(double speedDecrease) {
        currentSpeed -= speedDecrease;
        if (currentSpeed < 0) {
            currentSpeed = 0;
        }
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public String toString() {
        return "Vehicle Type: " + vehicleType +
                ", Registration Number: " + registrationNumber +
                ", Current Speed: " + currentSpeed;
    }
}