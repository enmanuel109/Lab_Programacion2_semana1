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
public class windowNewAccount {
    private static EmailAccount[] cuentas;
    private static EmailAccount actual;
    
    public windowNewAccount(EmailAccount[] cuentas, EmailAccount actual){
        this.actual=actual;
        this.cuentas=cuentas;
        JFrame screen = new JFrame();
        screen.setSize(500, 600);  //Tamaño standard para menus
        screen.setResizable(false);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setLocationRelativeTo(null);
        screen.setLayout(null);
        
        JLabel titulo = new JLabel("Cuenta Nueva");
        titulo.setBounds(160, 10, 300, 100);
        titulo.setFont(new Font("Serif", Font.BOLD, 30));
        
        //Vatiables que almacenan
       
        
        JLabel emailLabel= new JLabel("Ingrese su correo:");
        emailLabel.setBounds(100, 120, 300, 25);
        JTextField emailInput = new JTextField();
        JLabel nameLabel = new JLabel("Ingrese su nombre:");
        nameLabel.setBounds(100, 190, 300, 25);
        JTextField nameInput = new JTextField();
        JLabel psswLabel = new JLabel("Ingrese su contraseña:");
        psswLabel.setBounds(100, 250, 300, 25);
        JTextField psswInput = new JTextField();
        
        
        emailInput.setBounds(100, 150, 300, 25);
        nameInput.setBounds(100, 210, 300, 25);
        psswInput.setBounds(100, 280, 300, 25);
        
        
        
        JButton newCuenta = new JButton("Crear Cuenta");
        newCuenta.setBounds(150, 350, 200, 50);
        
        
        JButton volver= new JButton("Volver");
        volver.setBounds(150, 420, 200, 50);
        
         newCuenta.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              //Obtencion de informacion
               String password;
               String nombre;
                String correo; 
              password=psswInput.getText();
              nombre=nameInput.getText();
              correo=emailInput.getText();
              
              
              EmailAccount cuentaNueva= new EmailAccount(correo, password, nombre);
              for(int i=0; i<cuentas.length; i++){
                  if(cuentas[0]==null){
                      cuentas[i]= cuentaNueva;
                      JOptionPane.showMessageDialog(screen, "Se ha crerado la cuenta de manera exitosa");
                      emailInput.setText("");
                      nameInput.setText("");
                      psswInput.setText("");
                      break;
                  }else if(cuentas[i]!=null){
                      cuentas[i]= cuentaNueva;
                      JOptionPane.showMessageDialog(screen, "Se ha crerado la cuenta de manera exitosa");
                      emailInput.setText("");
                      nameInput.setText("");
                      psswInput.setText("");
                      break;
                  }
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
        screen.add(newCuenta);
        screen.add(psswLabel);
        screen.add(nameLabel);
        screen.add(emailLabel);
        screen.add(emailInput);
        screen.add(nameInput);
        screen.add(psswInput);
        screen.add(titulo);
        screen.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        windowNewAccount ventana = new windowNewAccount(cuentas,actual);
    }
    
    
    
    private boolean revisarCorreo(String correo){
        try{
            if(cuentas.length<1){
            return false;
            }else{
                for(EmailAccount account: cuentas){
                //Revisa que no este vacia
                if(account!=null){
                    //revisa que no sea la misa cuenta
                    
                        if(account.getDireccionEmail().equals(correo)){
                            return true; //si existe otro correo
                        }
                    
                }
                }
            }
        
            return false;//no se encontro otro, por lo que es  
        }catch(NullPointerException e){
            return false;
        }
       
    }
    
    private boolean revisarContrasenia(String contra){
        boolean revLong=false;
        boolean revChar=false;
        boolean revNum=false;
        boolean revUp=false;
        
        //revision longotud
        if(contra.length()>5){
            revLong=true;
        }
        
        //revision de letras
        for(char letra: contra.toCharArray()){
            if(Character.isUpperCase(letra)){
                revUp=true;
            }
        }
        
        //Revision de Num
        for(char letra: contra.toCharArray()){
            try{
                Integer.parseInt(contra);
                revNum=true;
            }catch(NumberFormatException e){
                revNum=false;
            }
        }
        
        //revision de Caracter
        for(char letra: contra.toCharArray()){
            if(letra=='!' || letra=='@' || letra=='#' || letra=='$' || letra=='%' || letra=='^' || letra=='&' || letra=='*' ||
                    letra=='(' || letra==')' || letra=='_' || letra=='-' || letra==' '|| letra=='+'){
                revChar=true;
            }
        }
        if(revLong == true && revChar == true && revNum == true && revUp ==true){
            return true;
        }else{
            return false;
        }
    }
    
     //Metodo para busqueda de cuentas en array de cuentas
    public EmailAccount buscarCuenta(String correo){
        for(EmailAccount cuenta: cuentas){
            if(cuenta!=null){
                if(correo.equals(cuenta.getDireccionEmail())){
                    return cuenta;
                }
            }
        }
        return null;
    }
    
    
}
