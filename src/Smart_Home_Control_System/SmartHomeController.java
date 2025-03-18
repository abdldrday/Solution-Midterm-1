package Smart_Home_Control_System;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeController {

    private List<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice device){
        devices.add(device);
    }

    public void turnAllOn(){
        for(SmartDevice device : devices){
            device.turnOn();
        }
    }

    public void turnAllOff(){
        for(SmartDevice device : devices){
            device.turnOff();
        }
    }


    public void getDevicesStatus(){
        for(SmartDevice device : devices){
            System.out.println(device.getStatus());
        }
    }
}
