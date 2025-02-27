package LowLevelDesign.DesignPatterns.CommandDesignPattern;

import java.util.Stack;

public class RemoteControl {
    Stack<Command> commandStack;
    Command command;

    RemoteControl(){
        commandStack = new Stack<>();
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void pressButton(){
        command.execute();
        commandStack.add(command);
    }
    public void undo(){
        if(!commandStack.isEmpty()){
            Command previousCommand = commandStack.pop();
            previousCommand.undo();
        }
    }
}
