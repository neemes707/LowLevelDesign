package LowLevelDesign.DesignPatterns.CommandDesignPattern;

public class TurnOfCommand implements Command{
    AirConditioner airConditioner;

    TurnOfCommand(AirConditioner airConditioner){
        this.airConditioner = airConditioner;
    }
    @Override
    public void execute() {
        airConditioner.turnOfAC();
    }

    @Override
    public void undo() {
        airConditioner.turnOnAc();
    }
}
