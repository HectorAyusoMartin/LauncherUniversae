/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.launcher;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;



/**
 *
 *
 */


public class Utilities extends Launcher {
    
    
    // Constructor
    public Utilities() {
        
    }
    
    //Método que añade una imagen a un JLabel, pidiendo por parámetro el objeto y la ruta donde se aloja la imagen
    public static void SetImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        labelName.repaint();
    }
}