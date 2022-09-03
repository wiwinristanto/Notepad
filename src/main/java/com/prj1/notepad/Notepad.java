/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.prj1.notepad;
import javax.swing.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author wiwin.ristanto
 */
public class Notepad{

    public static void main(String[] args) {
        
        Tampilan tp = new Tampilan();
        tp.setVisible(true);
        
    }
    
}

//Note
//https://stackoverflow.com/questions/46438359/saving-jtextarea-to-a-txt-file-with-a-button
//https://www.tutorialspoint.com/swingexamples/show_save_file_dialog.htm