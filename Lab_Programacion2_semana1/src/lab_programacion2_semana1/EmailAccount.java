/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_programacion2_semana1;

/**
 *
 * @author Cantarero
 */
public class EmailAccount {
    String direccionEmail;
    String password;
    String nombreUsuario;
    email[] inbox;
    int contar = 0;

    public EmailAccount(String direccionEmail, String password, String nombreUsuario) {
        this.direccionEmail = direccionEmail;
        this.password = password;
        this.nombreUsuario = nombreUsuario;
        this.inbox = new email[10];
    }

    public String getDireccionEmail() {
        return direccionEmail;
    }
    
    public String getpassword(){
        return password;
    } 
    
    public String getnombreUsuario(){
        return nombreUsuario;
    } 
    
    public boolean recibirEmail(email em){
        for(int i=0;i<inbox.length;i++){
            if(inbox[i]==null){
                inbox[i]=em;
                return true;
            }
        }
        return false;
    }
    
    public void printInbox(){
        for(int i =0; i<inbox.length;i++){
        System.out.println("Posicion:"+inbox[i]+" Emisor:"+ in);
        }
    }
}
