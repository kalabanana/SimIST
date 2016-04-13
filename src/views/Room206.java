/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import models.CharacterMovement;
import models.Customer;
import controllers.RoomController;
import models.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author qpm5006
 */
//public final class Room206 extends JPanel implements KeyListener{
    

public class Room206 extends JPanel {
//    public static final int COUNTERWIDTH = 160;
//    public static final int COUNTERHEIGHT = 192;
//    public static final int COFFEEWIDTH = 309;
//    public static final int COFFEEHEIGHT = 40;
//    public static final int SIGNWIDTH = 50;
//    public static final int SIGNHEIGHT = 45;
//    public static final int TRASHWIDTH = 114;
//    public static final int TRASHHEIGHT = 62;
//    public static final int BAKERYWIDTH = 50;
//    public static final int BAKERYHEIGHT = 150;
//    public static final int FRUITWIDTH = 75;
//    public static final int FRUITHEIGHT = 65;
//    public static final int SOUPWIDTH = 144;
//    public static final int SOUPHEIGHT = 40;
//    public static final int COOLERWIDTH = 310;
//    public static final int COOLERHEIGHT = 30;
//
//    private Rectangle counter;
//    private Rectangle coffee;
//    private Rectangle sign;
//    private Rectangle trash;
//    private Rectangle bakery;
//    private Rectangle fruit;
//    private Rectangle soup;
//    private Rectangle cooler;
//    private Rectangle exitOutside;
//    private Rectangle exitCompSci;
//    private CharacterMovement characterMovement;
//    private Customer student;
//
//    private JLabel temp = new JLabel();
//
//    public Room206(Customer inf_Student, CharacterMovement inf_charMovement) {
//        super();
//        student = inf_Student;
//        characterMovement = inf_charMovement;
//        setSize(800, 600);
//        setLayout(null);
//        add(temp);
//        temp.setBounds(200, 200, 200, 200);
//        init();
//        placeStations();
//        this.addKeyListener(characterMovement);
//
//        this.addMouseMotionListener(new MouseAdapter() {
//            @Override
//            public void mouseMoved(MouseEvent e)
//            {
////                System.out.println(e.getPoint());
//                temp.setText(e.getPoint().toString());
//            }
//        });
//        this.setFocusable(true);
//    }
//
//    private void init() {
//        counter = new Rectangle();
//        coffee = new Rectangle();
//        sign = new Rectangle();
//        trash = new Rectangle();
//        bakery = new Rectangle();
//        fruit = new Rectangle();
//        soup = new Rectangle();
//        cooler = new Rectangle();
//        
//        
//    }
//
//    private void placeStations() {
//        student.setBounds(700, 400, student.width, student.height);
//        counter.setBounds(622, 158, COUNTERWIDTH, COUNTERHEIGHT);
//        coffee.setBounds(201, 513, COFFEEWIDTH, COFFEEHEIGHT);
//        sign.setBounds(86, 355, SIGNWIDTH, SIGNHEIGHT);
//        trash.setBounds(59, 492, TRASHWIDTH, TRASHHEIGHT);
//        bakery.setBounds(5, 132, BAKERYWIDTH, BAKERYHEIGHT);
//        fruit.setBounds(28, 5, FRUITWIDTH, FRUITHEIGHT);
//        soup.setBounds(146, 17, SOUPWIDTH, SOUPHEIGHT);
//        cooler.setBounds(318, 26, COOLERWIDTH, COOLERHEIGHT);
//
//    }
//    
//    public Rectangle getCounter()
//    {
//        return counter;
//    }
//    
//    public Rectangle getCoffee()
//    {
//        return coffee;
//    }
//    
//    public Rectangle getSign()
//    {
//        return sign;
//    }
//    
//    public Rectangle getTrash()
//    {
//        return trash;
//    }
//    
//    public Rectangle getBakery()
//    {
//        return bakery;
//    }
//    
//    public Rectangle getFruit()
//    {
//        return fruit;
//    }
//    
//    public Rectangle getSoup()
//    {
//        return soup;
//    }
//    
//    public Rectangle getCooler()
//    {
//        return cooler;
//    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.drawImage(new ImageIcon("new_room.png").getImage(), 0, 0, null);
       // g.drawImage(new ImageIcon(characterMovement.getAnimation()).getImage(), student.x, student.y, null);

    }

}


    
    
//    int max = 3;
//    int[] [] map,maptmp;
//    int manX, manY,boxnum;
//    Image[] myImage;
//    Readmap map1;
//    Readmap maptmp1;
//    int len = 30;
//    int level = 1;
//    Stack mystack = new Stack();
//    
//    public Room206(Customer inf_Student, CharacterMovement inf_charMovement) {
//        super();
//        student = inf_Student;
//        characterMovement = inf_charMovement;
//        setSize(800, 600);
//        setLayout(null);
//        add(temp);
//        temp.setBounds(200, 200, 200, 200);
//        init();
//        placeStations();
//        this.addKeyListener(characterMovement);
//
//        this.addMouseMotionListener(new MouseAdapter() {
//            @Override
//            public void mouseMoved(MouseEvent e)
//            {
////                System.out.println(e.getPoint());
//                temp.setText(e.getPoint().toString());
//            }
//        });
//        this.setFocusable(true);
//    }
//    Room206(){
//        setSize(600,620);
//        setBounds(15,50,600,600);
//        setBackground(Color.white);
//        addKeyListener(this);
//       //  myImage = new Image[10];
//       // for(int i=0; i<10; i++){
//       //     myImage[i] = Toolkit.getDefaultToolkit().getImage("pic\\"+i+".gif");
//       // }
//        setVisible(true);
//        this.pushboxes(this.level);
//        this.requestFocus();
//        validate();
//    }
//    
//    void pushboxes(int i){
//        map1 = new Readmap(i);
//        maptmp1 = new Readmap(i);
//        map = map1.getmap();
//        manX = map1.getmanX();
//        manY = map1.getmanY();
//        maptmp = maptmp1.getmap();
//        repaint();
//        
//    }
//    
//   
//    
//    public void paint(Graphics g){
//         super.paint(g);
//
//        g.drawImage(new ImageIcon("new_Room.png").getImage(), 0, 0, null);
//        }
//       
//    
//    @Override
//    public void keyTyped(KeyEvent ke) {
//    }
//
//    @Override
//    public void keyPressed(KeyEvent ke) {
//        if (ke.getKeyCode() == KeyEvent.VK_UP){
//            moverup();
//        }
//        if (ke.getKeyCode() == KeyEvent.VK_DOWN){
//            movedown();
//        }
//        if(ke.getKeyCode() == KeyEvent.VK_LEFT){
//            moveleft();
//        }
//        if(ke.getKeyCode() == KeyEvent.VK_RIGHT){
//            moveright();
//            
//        }
//        if(unlock()){
//           
//                JOptionPane.showMessageDialog(this, "The Door Opened!");
//                mystack.removeAllElements();
//        }
//    }
//
//    @Override
//    public void keyReleased(KeyEvent ke) {
//    }
//    
//    boolean isMystackEmpty(){
//        return mystack.isEmpty();
//    }
//    void remove(){
//        mystack.removeAllElements();
//    }
//    int back() {
//        return (int) mystack.pop();
//    }
//
//    private void moverup() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void movedown() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void moveleft() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void moveright() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private boolean unlock() {
//        boolean num = false;
//        out: for(int i = 0; i<20; i++)
//                for (int j = 0; j<20; j++){
//            if(maptmp [i][j] == 4 || maptmp[i][j] ==9)
//                    if (map[i][j] ==9)
//                        num = true;
//                    else {
//                        num = false;
//                        break out;
//                            }
//            }
//        return num;            
//    }
//                
//
//}
//    
//
//
//class Readmap{
//    private int level , mx, my;
//    private int [] [] mymap = new int[20][20];
//    FileReader r;
//    BufferedReader br;
//    String bb="";
//    int []x;int c = 0;
//    Readmap(int k){
//        level = k;
//        String s;
//        try {
//            File f = new File("maps\\"+level+".map");
//            r = new FileReader (f);
//            br = new BufferedReader(r);
//        }
//        catch (IOException e){
//            System.out.println(e);
//        }
//    
//    try{
//     while ((s=br.readLine())!=null){
//	bb=bb+s;
//        }
//    }
//    catch (IOException g){
//	System.out.println(g);
//	}
//    
//    byte [] d = bb.getBytes();
//    int len = bb.length();
//    int [] x = new int[len];
//    for (int i=0; i<bb.length();i++)x[i] = d[i]-48;
//    for (int i=0; i<20; i++){
//        for(int j = 0; i <20; j++){
//            mymap[i][j]= x[c];
//            if(mymap [i][j] == 5){
//                mx = j;
//                my = i;
//            }
//            c++;
//        }
//    }
//    }
//    int [][] getmap(){
//        return mymap;
//    }
//    int getmanX(){
//        return mx;
//    }
//    int getmanY(){
//        return my;
//    }
//}
