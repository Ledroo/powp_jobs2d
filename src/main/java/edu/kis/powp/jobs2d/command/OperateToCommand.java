package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {
    public final int x;
    public final int y;
    public Job2dDriver driver;
    public OperateToCommand(Job2dDriver driver, int x, int y){
        this.x = x;
        this.y = y;
        this.driver = driver;
    }

    public void setDriver(Job2dDriver driver) {
        this.driver = driver;
    }

    @Override
    public void execute() {
        driver.operateTo(x, y);
    }
}
