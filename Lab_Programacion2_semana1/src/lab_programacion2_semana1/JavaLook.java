/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_programacion2_semana1;

import javax.swing.JFrame;

/**
 *
 * @author David
 */
public class JavaLook {
    EmailAccount[] cuentas;
    EmailAccount cuentaActual;
    
    public JavaLook(){
        //Primera clase que se ejecuta
        //Crea el almacenador de cuentas
        cuentas= new EmailAccount[200];
        
        //Ejecutar de pestania menu incial aqui
        //Desarrollar el menu con una cuenta como parametro
        
        
        
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
    
    
    //Establecimiento de cuenta logeada
    public void setCuentaLogged(EmailAccount cuenta){
        if(cuentaActual==null){
            cuentaActual = cuenta;
        }
    }
    
    //Obtencion de cuenta actual
    public EmailAccount getCuentaLogged(){
        return cuentaActual;
    }
    
    
    
    
}
