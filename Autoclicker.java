package me.unfair.test;

import java.awt.*;

public class Autoclicker {

    private Robot robot;
    private int delay;

    public Autoclicker() {
        try {
            robot = new Robot();
        } catch (AWTException e){
            e.printStackTrace();
        }
    }

    public void click(int button){
        robot.mousePress(button);
        robot.delay(delay);
        robot.mouseRelease(button);
        robot.delay(delay);
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }
}
