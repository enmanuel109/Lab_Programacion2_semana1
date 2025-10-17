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
    email[] imbox;
    int contar = 0;

    public EmailAccount(String direccionEmail, String password, String nombreUsuario) {
        this.direccionEmail = direccionEmail;
        this.password = password;
        this.nombreUsuario = nombreUsuario;
        this.imbox = null;
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
    
    public email recibirEmail(email em){
        for(email tem: imbox){
            if(tem==null && contar<imbox.length){
                imbox[contar]= new email(em);
                contar++;
                return true
            }
        }
        return false;
    }
    public void printInbox(){
    
        
    }
}
