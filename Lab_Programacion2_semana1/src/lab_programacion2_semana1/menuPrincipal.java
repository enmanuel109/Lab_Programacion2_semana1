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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author David
 */
public class menuPrincipal {
    private static EmailAccount cuentaLogged;
    
    public menuPrincipal(EmailAccount cuentaLogged){
        this.cuentaLogged= cuentaLogged;
        
        
        JFrame screen = new JFrame();
        screen.setSize(1000, 800);  //Tamaño standard para menus
        screen.setResizable(false);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setLocationRelativeTo(null);
        screen.setLayout(null);
        
        JLabel titulo= new JLabel("Menu Principal");
        JLabel userlabel = new JLabel("Usuario:");
        JLabel fechalabel = new JLabel("Fecha:");
        JLabel horaLabel = new JLabel("Hora:");
        titulo.setBounds(100, 5, 500, 200);
        titulo.setFont(new Font("Serif", Font.BOLD, 50));
        userlabel.setBounds(100, 50, 500, 200);
        userlabel.setFont(new Font("Serif", Font.BOLD, 25));
        fechalabel.setBounds(100, 100, 200, 200);
        fechalabel.setFont(new Font("Serif", Font.BOLD, 15));
        horaLabel.setBounds(180,100 , 200, 200);
        horaLabel.setFont(new Font("Serif", Font.BOLD, 15));
        
        JButton btViewInbox = new JButton("Ver Inbox");
        JButton btSend = new JButton("Mandar Correo");
        
        JButton btLeer = new JButton ("Leer Correo");
        JButton btLimpiar = new JButton("Limpiar Inbox");
        JButton btBuscar = new JButton("Buscar Correo");
        
        JButton btLogOut = new JButton("Cerrar Sesion");
        
        btViewInbox.setBounds(700, 100, 200, 80);
        btSend.setBounds(700, 200, 200, 80);
        btLeer.setBounds(700, 300, 200, 80);
        btLimpiar.setBounds(700, 400, 200, 80);
        btBuscar.setBounds(700,500, 200, 80);
        btLogOut.setBounds(700, 600, 200, 80);
        
        
        
        btViewInbox.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              ;
          }
                    
        });
        
        btSend.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              
          }
                    
        });
        
        btLogOut.addActionListener(new ActionListener(){
          @Override 
          public void actionPerformed(ActionEvent e){
              screen.dispose();
              menuInicial menuInicial = new menuInicial(cuentaLogged);
          }
                    
        });
        
     
        JTextField inboxPequenio = new JTextField();
        inboxPequenio.setBounds(100, 250, 500, 500);
        
        
        
        
        screen.add(btLeer);
        screen.add(btLimpiar);
        screen.add(btBuscar);
        screen.add(inboxPequenio);
        screen.add(btViewInbox);
        screen.add(btSend);
        screen.add(btLogOut);
        screen.add(titulo);
        screen.add(userlabel);
        screen.add(fechalabel);
        screen.add(horaLabel);
        
        
        screen.setVisible(true);
        
        
        
    }
    
    
    public static void main(String[] args) {
        menuPrincipal ventana = new menuPrincipal(cuentaLogged);
    }
    
}
