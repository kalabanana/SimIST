/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import static com.sun.javafx.application.PlatformImpl.exit;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import models.CharacterMovement;
import models.Customer;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.lang.System.exit;
import static javafx.application.Platform.exit;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.Global.exit;

/**
 *
 * @author qpm5006
 */
//public final class Room206 extends JPanel implements KeyListener{
    

public class Room206 extends JPanel {

    public static final int ShelfWidth = 60;
    public static final int ShelfHeight = 15;
    public static final int LongtableWidth = 175;
    public static final int MiddletableWidth = 90;
    public static final int ShorttableWidth = 18;
    public static final int TableHeight = 15;
    public static final int CornertableWidth = 30;
    public static final int CornertableHeight = 64;
    public static final int WallUDWidth = 450;
    public static final int WallUDHeight = 45;
    public static final int WallLRWidth= 15;
    public static final int WallLRHeight = 600;



    private Rectangle shelf1;
    private Rectangle shelf2;
    private Rectangle longtable;
    private Rectangle middletable1;
    private Rectangle middletable2;
    private Rectangle middletable3;
    private Rectangle middletable4;
    private Rectangle middletable5;
    private Rectangle middletable6;
    private Rectangle shorttable;
    private Rectangle cornertable1;
    private Rectangle cornertable2;
    private Rectangle key;
    private Rectangle wallUD1;
    private Rectangle wallUD2;
    private Rectangle wallLR1;
    private Rectangle wallLR2;
    
    private CharacterMovement characterMovement;
    private Customer student;
    private boolean keyfound = false;

    private JLabel temp = new JLabel();
    private JLabel msg = new JLabel();

    public Room206(Customer inf_Student, CharacterMovement inf_charMovement) {
        super();
        student = inf_Student;
        characterMovement = inf_charMovement;
        setSize(537, 670);
        add(temp);
        temp.setBounds(200,200,200,200);
        msg.setText("Room206 is lock! You need to find the key! Hint: Pointer: 80, 500 ");
        msg.setLocation(200, 500);
        
        add(msg);
        init();
        placeStations();
        this.addKeyListener(characterMovement);

        this.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e)
            {
           
                temp.setText(e.getPoint().toString());
                if(e.getX()==80 && e.getY() == 500){
                    System.out.println("key");
                    keyfound = true;
                    JOptionPane.showMessageDialog(temp,"Key is found,room is now unlocked");
                    
                }
            }
        });
        checkKeyFound();
        this.setFocusable(true);
    }
    private void checkKeyFound(){
        if(keyfound==true){
            this.setVisible(false);
        }
    }
    
    private void init() {
        shelf1 = new Rectangle();
        shelf2 = new Rectangle();
        longtable = new Rectangle();
        middletable1 = new Rectangle();
        middletable2 = new Rectangle();
        middletable3 = new Rectangle();
        middletable4 = new Rectangle();
        middletable5 = new Rectangle();
        middletable6 = new Rectangle();
        shorttable = new Rectangle();
        cornertable1 = new Rectangle();
        cornertable2 = new Rectangle();
        key = new Rectangle();
        wallUD1 = new Rectangle();
        wallUD2 = new Rectangle();
        wallLR1 = new Rectangle();
        wallLR2 = new Rectangle();

   
        
        
    }

    private void placeStations() {
        student.setBounds(450, 150, student.width, student.height);
        shelf1.setBounds(43, 100, ShelfWidth, ShelfHeight);
        shelf2.setBounds(363,100,ShelfWidth, ShelfHeight);
        longtable.setBounds(142, 162, LongtableWidth, TableHeight);
        middletable1.setBounds(94,256,MiddletableWidth, TableHeight);
        middletable2.setBounds(266,256,MiddletableWidth, TableHeight);
        middletable3.setBounds(94,356,MiddletableWidth, TableHeight);
        middletable4.setBounds(266,356,MiddletableWidth, TableHeight);
        middletable5.setBounds(94,456,MiddletableWidth, TableHeight);
        middletable6.setBounds(266,456,MiddletableWidth, TableHeight);
        shorttable.setBounds(436, 449, ShorttableWidth, TableHeight);
        cornertable1.setBounds(444, 353, CornertableWidth, CornertableHeight);
        cornertable2.setBounds(413, 449, CornertableWidth, CornertableHeight);
        key.setBounds(29, 353, CornertableWidth, CornertableHeight);
        wallUD1.setBounds(23,2, WallUDWidth, WallUDHeight);
        wallUD2.setBounds(23, 544, WallUDWidth, WallUDHeight);
        wallLR1.setBounds(0,66, WallLRWidth, WallLRHeight);
        wallLR2.setBounds(458,226, WallLRWidth, WallLRHeight);
   
    }

    public Rectangle getShelf1()
    {
        return shelf1;
    }
    public Rectangle getShelf2()
    {
        return shelf2;
    }
    
    public Rectangle getShorttable()
    {
        return shorttable;
    }
    
    public Rectangle getLongtable()
    {
        return longtable;
    }
    
    public Rectangle getMiddletable1()
    {
        return middletable1;
    }
    public Rectangle getMiddletable2()
    {
        return middletable2;
    }
    public Rectangle getMiddletable3()
    {
        return middletable3;
    }
    public Rectangle getMiddletable4()
    {
        return middletable4;
    }
    public Rectangle getMiddletable5()
    {
        return middletable5;
    }
    public Rectangle getMiddletable6()
    {
        return middletable6;
    }
    public Rectangle getCornertable1()
    {
        return cornertable1;
    }
     public Rectangle getCornertable2()
    {
        return cornertable2;
    }
      public Rectangle getKey()
    {
        return key;
    }
     public Rectangle getWallUD1()
    {
        return wallUD1;
    }
       public Rectangle getWallUD2()
    {
        return wallUD2;
    }
      public Rectangle getWallLR1()
    {
        return wallLR1;
    }
        public Rectangle getWallLR2()
    {
        return wallLR2;
    }

    
   
    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.drawImage(new ImageIcon("room206.png").getImage(), 0, 0, null);
        g.drawImage(new ImageIcon(characterMovement.getAnimation()).getImage(), student.x, student.y, null);
        if(student.x >= 80&&student.x<=90 && student.y >= 500&&student.y<=550){
            JOptionPane.showMessageDialog(temp,"Key is found,room is now unlocked");
        }
    
    }

}
