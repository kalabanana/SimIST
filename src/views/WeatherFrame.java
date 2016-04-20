package views;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Qiu
 */
public class WeatherFrame extends JFrame{
    public WeatherFrame(){
    super();
        setSize(300,300);
        setPreferredSize(new Dimension(300,300));
        //setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        validate();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setFocusable(false);
    }
    
}

