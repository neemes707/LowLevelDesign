package LowLevelDesign.DesignPatterns.CommandDesignPattern;

public class AirConditioner {
     boolean isOn;
     int temperature;

    public void turnOnAc(){
        isOn = true;
        System.out.println("AC is on");
    }
    public  void turnOfAC() {
        isOn = false;
        System.out.println("AC is off");
    }
    public void setTemperature(int temperature){
        this.temperature = temperature;
        System.out.println("Temperature set to "+ temperature);
    }

}
