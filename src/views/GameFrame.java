/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Dimension;
import  javax.swing.*;

/**
 *
 * @author matthewtucker
 */
public class GameFrame extends JFrame {
    Cybertorium floor1;
    

    public GameFrame(String title) {
        floor1 = new Cybertorium();
    
        this.setTitle(title);
        this.setVisible(true);
        this.setSize(new Dimension(975, 580));
        this.add(floor1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    
}
}