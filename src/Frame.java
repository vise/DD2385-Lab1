import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame
{
    public void createAndShowFrame(){
        JFrame frame = new JFrame("Frame");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel emptyLabel = new JLabel("");
        emptyLabel.setPreferredSize(new Dimension(100, 100));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
