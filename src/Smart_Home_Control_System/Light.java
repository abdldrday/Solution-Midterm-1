package Smart_Home_Control_System;

public class Light implements SmartDevice {
    private String name;
    private boolean isON;

    public Light(String name) {
        this.name = name;
    }

    public void turnOn(){
        isON = true;
    }

    public void turnOff(){
        isON = false;
    }

    public String getStatus(){
        return name + " is " + (isON ? "ON" : "OFF");
    }

    @Override
    public String getName() {
        return name;
    }
}
