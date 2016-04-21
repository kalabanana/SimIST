package views;
import java.awt.Dimension;
import java.awt.Toolkit;
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
        Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        int wdwLeft = 385 + screenSize.width / 2;
        int wdwTop = screenSize.height / 2 - 322;
        setLocation(wdwLeft,wdwTop);
        validate();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setFocusable(false);
    }
    
}