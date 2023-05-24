import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;
import java.io.IOException;


public class TwoPlayer extends JPanel implements ActionListener, ItemListener, ChangeListener {

    private JPanel namePanel;
    private JPanel main;
    private JButton player1ReadyButton;
    private JTextField enterPlayer2STextField;
    private JButton player2ReadyButton;
    private JPanel checkBox2;
    private JTextField enterPlayer1STextField;
    private JCheckBox checkBox1;
    private JLabel Yuuki;

    private JLabel jLabel;

    static int condition = 1;



    public TwoPlayer() throws IOException {
        this.setContentPane(namePanel);
        setSize(1400, 700);
        setVisible(true);
        player1ReadyButton.addActionListener(this);

        this.setDoubleBuffered(true);
        this.setSize(new Dimension(100, 100));
        BufferedImage pac = ImageIO.read(new File("src/pixil-frame-0_(1).png"));


        Graphics g = pac.getGraphics();
        g.drawImage(pac, 700, 350, main);
        this.add(main);
    }


    public void paintComponent(Graphics g) {

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        JButton button = (JButton) source;
        String text = button.getText();
        if (text.equals("Player1 Ready")){


        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }
}