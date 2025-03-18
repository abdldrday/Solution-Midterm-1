package Smart_Home_Control_System;

import java.util.ArrayList;
import java.util.List;

public abstract class DeviceList implements SmartDevice {
    private String name;
    private List<SmartDevice> devices;

    public DeviceList(String name) {
        this.name = name;
        this.devices = new ArrayList<>();
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void removeDevice(SmartDevice device) {
        devices.remove(device);
    }

    public void turnOn() {
        System.out.println(name + " - Turning on all devices");
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }
    public void turnOff() {
        System.out.println(name + " - Turning off all devices");
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }

    public String getStatus(){
        String status = name + " is \n";
        for (SmartDevice device : devices){
            status += device.getStatus() + "\n";
        }
        return status;
    }
}
