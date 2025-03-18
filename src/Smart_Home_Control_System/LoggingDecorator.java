package Smart_Home_Control_System;

public class LoggingDecorator implements SmartDevice {
    private SmartDevice device;

    public LoggingDecorator(SmartDevice device) {
        this.device = device;
    }


    public void turnOn() {
        System.out.println("Turning ON " + device.getName());
        device.turnOn();
    }


    public void turnOff() {
        System.out.println("Turning OFF " + device.getName());
        device.turnOff();
    }


    public String getStatus() {
        return device.getStatus();
    }


    public String getName() {
        return device.getName();
    }
}
