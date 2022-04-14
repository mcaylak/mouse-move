package com.company;

import java.awt.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        try {
            while(true){
                Thread.sleep(10000);

                Random random = new Random();
		    
		// These coordinates are screen coordinates

                int xCoord = 500 + random.nextInt(1000);
                int yCoord = random.nextInt(1000);;

                // Move the cursor
                Robot robot = new Robot();
                robot.mouseMove(xCoord, yCoord);
            }
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }

    }
}
