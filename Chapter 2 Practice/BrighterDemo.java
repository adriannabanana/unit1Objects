import java.awt.Color;
import javax.swing.Jframe;

public class BrighterDemo
{
    public static void main(String[] args)
    {
        JFrame fram = new JFrame();
        frame = setSize(200,200);
        Color myColor = cyan;
        frame.getContentPane().setBackground(myColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}