package Smart_Home_Control_System;

interface SmartHomeFactory {
    SmartDevice createLight(String name);
    SmartDevice createThermostat(String name);
}


class BasicSmartHomeFactory implements SmartHomeFactory{
    public SmartDevice createLight(String name){
        return new Light(name);
    }

    public SmartDevice createThermostat(String name){
        return new Thermostat(name);
    }

}

