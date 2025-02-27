package LowLevelDesign.DesignPatterns.CommandDesignPattern;

public class Main {
    public static void main(String[] args) {
        /*TODO here we are trying to implement undo and redo functionality using command design pattern
        *  In command design pattern we have 3 layers
        *  1. Invoker
        *  2. Command
        *  3. Receiver
        *   Undo and redo in code editor or any other functionality*/
        AirConditioner airConditioner = new AirConditioner();
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(new TurnOnCommand(airConditioner));
        remoteControl.pressButton();
        remoteControl.undo();
    }
}
