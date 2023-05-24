import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame();

        TwoPlayer gui = new TwoPlayer();
        frame.add(gui);

        frame.pack();
        frame.setVisible(true);
    }
}
