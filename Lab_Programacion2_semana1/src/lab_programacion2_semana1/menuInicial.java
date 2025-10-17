/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_programacion2_semana1;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author David
 */
public class menuInicial {
   //Creacion de Jframe
    
    private static EmailAccount[] cuentas;
    private static EmailAccount actual;
    
    public menuInicial(EmailAccount[] cuentas, EmailAccount actual){
        this.actual=actual;
        this.cuentas= cuentas;
        JFrame screen = new JFrame();
        screen.setSize(1000, 800);  //Tamaño standard para menus
        screen.setResizable(false);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setLocationRelativeTo(null);
        screen.setLayout(null);
        
        JLabel titulo= new JLabel("Menu Inicial");
        titulo.setBounds(300, 20, 500, 200);
        titulo.setFont(new Font("Serif", Font.BOLD, 80));
        
        JButton botonLogin = new JButton("Iniciar Sesion");
        JButton botonNewAccount = new JButton("Crear Cuenta");
        JButton botonSalir = new JButton("Salir");
        
        botonLogin.setBounds(400, 200, 250, 100);
        botonNewAccount.setBounds(400, 350, 250, 100);
        botonSalir.setBounds(400, 500, 250, 100);
        
        
        
        botonLogin.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              screen.dispose();
              ventanaLogIn ventana = new ventanaLogIn(cuentas, actual);
          }
                    
        });
        
        botonNewAccount.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              screen.dispose();
              windowNewAccount ventanaLog= new windowNewAccount(cuentas,actual);
          }
                    
        });
        
        botonSalir.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              screen.dispose();
          }
                    
        });
        
        
        
        
        
        
        
        
        screen.add(botonLogin);
        screen.add(botonNewAccount);
        screen.add(botonSalir);
        screen.add(titulo);
        
        
        
        screen.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        menuInicial ventana= new menuInicial(cuentas, actual);
    }
       
    
}
