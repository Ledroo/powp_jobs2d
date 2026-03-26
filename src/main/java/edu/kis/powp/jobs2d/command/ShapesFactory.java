package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class ShapesFactory {

    public ShapesFactory(){

    }

    public static ComplexCommand drawSquare(Job2dDriver driver, int x, int y, int length){
        ComplexCommand complexCommand = new ComplexCommand();

        complexCommand.addCommand(new SetPositionCommand(driver, x, y));
        complexCommand.addCommand(new OperateToCommand(driver,x + length, y));
        complexCommand.addCommand(new OperateToCommand(driver, x + length, y + length));
        complexCommand.addCommand(new OperateToCommand(driver,x , y + length));
        complexCommand.addCommand(new OperateToCommand(driver, x, y));

        return complexCommand;
    }

    public static ComplexCommand drawTriangle(
            Job2dDriver driver,
            int x1, int y1,
            int x2, int y2,
            int x3, int y3){
        ComplexCommand complexCommand = new ComplexCommand();

        complexCommand.addCommand(new SetPositionCommand(driver, x1, y1));
        complexCommand.addCommand(new OperateToCommand(driver,x2, y2));
        complexCommand.addCommand(new OperateToCommand(driver, x3, y3));
        complexCommand.addCommand(new OperateToCommand(driver,x1 , y1));

        return complexCommand;
    }
}
