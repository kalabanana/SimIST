package controllers;

import Sounds.Controller;
import Sounds.Model;
import Sounds.View;
import javax.swing.SwingUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jrimland
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               SwingUtilities.invokeLater(new Runnable (){

            @Override
            public void run() {
                Model model = new Model();
                View view = new View("Sample");
                Controller controller = new Controller(model, view);
                controller.control();
            }
            
        });
    }
    
}
