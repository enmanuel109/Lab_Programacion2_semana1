package lab_programacion2_semana1;

import java.util.Calendar;

/**
 *
 * @author Jiny
 */
public class email {

    private String emisor;
    private String asunto;
    private String contenido;
    private boolean leido;
    private Calendar fechaEnvio;

    public email(String emisor, String asunto, String contenido) {
        this.asunto = asunto;
        this.contenido = contenido;
        this.emisor = emisor;
        this.leido = false;
        this.fechaEnvio = Calendar.getInstance();
    }

    public email() {

    }

    public String getEmisor() {
        return emisor;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getContenido() {
        return contenido;
    }

    public boolean getLeido() {
        return leido;
    }

    public boolean leido() {
        leido = true;
        return leido;
    }

    public Calendar getFechaEnvio() {
        return fechaEnvio;
    }

    public void print() {
        System.out.println("De:  " + emisor);
        System.out.println("Asunto:  " + asunto);
        System.out.println("Contenido:  " + contenido);
        System.out.println("Fecha:  " + fechaEnvio);
        System.out.println("Estado:  " + leido);
    }

}
