package parallel;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ddd {

    public static void main(String[] args) throws InterruptedException, AWTException {

        Robot r = new Robot();
        for (int i = 0; i < 100000; i++) {

            Thread.sleep(30000);

            r.keyPress(KeyEvent.VK_UP);

            r.keyRelease(KeyEvent.VK_UP);

            Thread.sleep(30000);

            r.keyPress(KeyEvent.VK_DOWN);

            r.keyRelease(KeyEvent.VK_DOWN);

            System.out.println(i);

        }

    }
}
