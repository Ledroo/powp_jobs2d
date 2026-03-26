package edu.kis.powp.jobs2d.command;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand{

    public List<DriverCommand> commands;


    public ComplexCommand(){
        this.commands = new ArrayList<>();
    }

    public ComplexCommand(List<DriverCommand> commands){
        this.commands = new ArrayList<>(commands);
    }

    public void addCommand(DriverCommand command){
        this.commands.add(command);
    }


    @Override
    public void execute() {
        for(DriverCommand command : new ArrayList<>(commands)){
            command.execute();
        }
    }
}
