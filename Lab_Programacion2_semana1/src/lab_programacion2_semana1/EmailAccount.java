/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_programacion2_semana1;

/**
 *
 * @author Cantarero y Jiny
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

    public String getpassword() {
        return password;
    }

    public String getnombreUsuario() {
        return nombreUsuario;
    }

    public boolean recibirEmail(email em) {
        for (int i = 0; i < inbox.length; i++) {
            if (inbox[i] == null) {
                inbox[i] = em;
                return true;
            }
        }
        return false;
    }

    public void printInbox() {
        for (int i = 0; i < inbox.length; i++) {
            System.out.println("Posicion:" + inbox[i] + " Emisor:" + inbox[i].getEmisor() + " Asunto:" + inbox[i].getAsunto() + inbox[i].getLeido());
            System.out.println("Todos los correos: ");
            System.out.println("Sin leer: ");
        }
    }

    public void leerEmail(int pos) {
        for (int i = 0; i < inbox.length; i++) {
            if (inbox[i] != null) {
                inbox[i].print();
                inbox[i].getLeido();
            } else {
                System.out.println("Correo no existe.");
            }
        }
    }

    public int correoSinLeer(int index) {
        if (inbox.length <= index) {
            return 0;
        }

        if (inbox[index] != null && inbox[index].getLeido()) {
            return correoSinLeer(index + 1) + 1;
        } else {
            return correoSinLeer(index + 1);
        }
    }

    public int buscarPorEmisor(String emisor, int index) {
        if (inbox.length <= index) {
            return 0;
        }

        if (inbox[index] != null && inbox[index].getEmisor().equalsIgnoreCase(emisor)) {
            inbox[index].getAsunto();
        }

        return buscarPorEmisor(emisor, index + 1);
    }

    public void mostrarCorreos(int index) {
        if (inbox.length <= index) {
            return;
        }

        if (inbox[index] != null) {
            inbox[index].print();
        }

        mostrarCorreos(index + 1);
    }

    public void EliminarCorreoLeidos(int index) {
        if (inbox.length <= index) {
            return;
        }

        if (inbox[index] == null) {
            return;
        }

        if (inbox[index].leido()) {
            inbox[index] = null;
        }

        EliminarCorreoLeidos(index + 1);

    }

    public int correosTotales() {
        return correosTotales(inbox.length, 0, 0);
    }

    private int correosTotales(int numero, int suma, int index) {
        if (inbox[index] == null && index > inbox.length) {
            return correosTotales(numero - 1, suma + 1, index);
        }
        return suma;
    }
}
