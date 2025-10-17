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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author David
 */
public class ventanaLogIn {
    private static EmailAccount[] cuentas;
    private static EmailAccount actual;
    
    public ventanaLogIn(EmailAccount[] cuentas, EmailAccount actual){
        this.actual=actual;
        this.cuentas=cuentas;
        JFrame screen = new JFrame();
        screen.setSize(500, 600);  //Tamaño standard para menus
        screen.setResizable(false);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setLocationRelativeTo(null);
        screen.setLayout(null);
        
        JLabel titulo = new JLabel("Log In");
        titulo.setBounds(160, 10, 300, 100);
        titulo.setFont(new Font("Serif", Font.BOLD, 30));
        
        //Vatiables que almacenan
       
        
        JLabel emailLabel= new JLabel("Ingrese su correo:");
        emailLabel.setBounds(100, 120, 300, 25);
        JTextField emailInput = new JTextField();
        JLabel psswLabel = new JLabel("Ingrese su contraseña:");
        psswLabel.setBounds(100, 190, 300, 25);
        JTextField psswInput = new JTextField();
      
        
        
        emailInput.setBounds(100, 150, 300, 25);
        psswInput.setBounds(100, 210, 300, 25);
        
        JButton LogIn = new JButton("Iniciar Sesion");
        LogIn.setBounds(150, 350, 200, 50);
        
        
        JButton volver= new JButton("Volver");
        volver.setBounds(150, 420, 200, 50);
        
         LogIn.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              //Obtencion de informacion
               String password;
               String nombre;
                String correo; 
              password=psswInput.getText();
              //nombre=nameInput.getText();
              correo=emailInput.getText();
              
              boolean logInError;
              for(EmailAccount cuenta: cuentas){
                  String email = cuenta.getDireccionEmail();
                  String contra = cuenta.getpassword();
                  
                  if(email.equals(correo)&& contra.equals(password)){
                      JOptionPane.showMessageDialog(screen, "Inicio de sesion exitozo");
                      
                      menuPrincipal menu = new menuPrincipal(cuenta, cuentas);
                      screen.dispose();
                  }
                     
              }
              if(logInError=false){
                  JOptionPane.showMessageDialog(screen, "No se ha podido iniciar sesion");
              }
          }

                    
        });
        
        
        
        
        volver.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              screen.dispose();
              menuInicial ventanaAnt = new menuInicial(cuentas, actual);
          }
                    
        });
        
        
        screen.add(volver);
        screen.add(LogIn);
        screen.add(psswLabel);
        //screen.add(nameLabel);
        screen.add(emailLabel);
        screen.add(emailInput);
        //screen.add(nameInput);
        screen.add(psswInput);
        screen.add(titulo);
        screen.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        ventanaLogIn ventana = new ventanaLogIn(cuentas,actual);
    }
    

}
