package LowLevelDesign.DesignPatterns.CommandDesignPattern;

public class TurnOnCommand implements Command{
    AirConditioner airConditioner;

    TurnOnCommand(AirConditioner airConditioner){
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOnAc();
    }

    @Override
    public void undo() {
        airConditioner.turnOfAC();
    }
}
