import com.badlogic.gdx.math.*;

import java.util.ArrayList;
import javax.swing.JFrame;

public class TestBezier {
   public static void main(String[] args) {
        int frameWidth = 500, frameHeight = 500;
        JFrame frame = new JFrame();
        frame.setSize(frameWidth, frameHeight);
        frame.setVisible(true);
        frame.getContentPane().add(new DrawingPlane());
    }
}