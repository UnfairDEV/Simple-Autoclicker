package me.unfair.test;

import javax.swing.*;
import java.awt.event.InputEvent;

public class Main{

    private static final Main instance = new Main();
    private static final Autoclicker autoclicker = new Autoclicker();

    public static void main(String[] args){
        String oldClicks = JOptionPane.showInputDialog(null, "How Many Times Do You Want To Click?");
        int clicks = Integer.parseInt(oldClicks);

        String oldDelay = JOptionPane.showInputDialog(null, "What Delay Do You Want In Between Clicks?");
        int delay = Integer.parseInt(oldClicks);

        autoclicker.setDelay(delay);

        JOptionPane.showMessageDialog(null, "You Have 3 Seconds Before Start!", "Warning", JOptionPane.QUESTION_MESSAGE);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        for (int i = 0; i < clicks; i++) {
            autoclicker.click(InputEvent.BUTTON1_MASK);
        }

        JOptionPane.showMessageDialog(null, "Finished!");
    }

}

