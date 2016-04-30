package views;


import java.awt.Graphics;
import java.awt.MenuComponent;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aot5238, lmo5113
 */
public class Cybertorium extends JPanel implements ActionListener
{
    JButton table1, table2, table3, table4, table5, seatButton;
    Exam exam;
    
    public Cybertorium()
    {
        setLayout(null);
        
        table1 = new JButton();
        table2 = new JButton();
        table3 = new JButton();
        table4 = new JButton();
        table5 = new JButton();   
        seatButton = new JButton();
        
        add(table1);
        add(table2);
        add(table3);
        add(table4);
        add(table5);
        add(seatButton);        

        table1.setOpaque(false);
        table1.setContentAreaFilled(false);
        table1.setBorderPainted(false);
        table2.setOpaque(false);
        table2.setContentAreaFilled(false);
        table2.setBorderPainted(false);
        table3.setOpaque(false);
        table3.setContentAreaFilled(false);
        table3.setBorderPainted(false);
        table4.setOpaque(false);
        table4.setContentAreaFilled(false);
        table4.setBorderPainted(false);
        table5.setOpaque(false);
        table5.setContentAreaFilled(false);
        table5.setBorderPainted(false);
        seatButton.setOpaque(true);
        seatButton.setContentAreaFilled(true);
        seatButton.setBorderPainted(true);
        
        table1.setBounds(new Rectangle (92, 145, 800, 10));
        table2.setBounds(new Rectangle (90, 220, 800, 10));
        table3.setBounds(new Rectangle (90, 294, 800, 10));
        table4.setBounds(new Rectangle (90, 365, 800, 10));
        table5.setBounds(new Rectangle (90, 440, 800, 10));
        seatButton.setBounds(new Rectangle(94, 157, 45, 45));
        
        seatButton.addActionListener(this);
        
        exam = new Exam();
        
    }

    Cybertorium(String floor_1) {    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        ImageIcon Icon = new ImageIcon("cybertorium.jpg");
        g.drawImage(Icon.getImage(), 0, 0, this);
        

    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        Object obj = e.getSource();
        if(obj == seatButton)
        {
            MenuComponent previousUI = null;
            remove(previousUI);
            this.add(exam);
            revalidate();
            repaint();
            System.out.println("hello");
        }
    }

}

