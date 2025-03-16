package Smart_Home_Control_System;

class Thermostat implements SmartDevice {
    private String name;
    private boolean isOn;
    private int temperature;

    public Thermostat(String name) {
        this.name = name;
    }

    public void setTemperature(int temp) {
        this.temperature = temp;
    }
    public void turnOn() {
        isOn = true;
    }
    public void turnOff() {
        isOn = false;
    }
    public String getStatus() {
        return name + " is " + (isOn ? "ON" : "OFF") + ", Temp: " + temperature + "°C";
    }
    public String getName() {
        return name;
    }
}
