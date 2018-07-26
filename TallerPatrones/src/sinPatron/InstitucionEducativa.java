package sinPatron;

import java.util.*;
import structural.MenuOpciones;

/**
 * 
 */
public class InstitucionEducativa implements MenuOpciones {

    protected String nombre;
    protected int creada;
    protected String provincia;
    protected String canton;
    protected String parroquia;
    protected String zona;
    
    protected Map estudiantes;
    protected MenuOpciones menu;

    /**
     * Default constructor
     */
    public InstitucionEducativa() {
    }


    /**
     * @return
     */

    public String GetInfo() {
        return "InstitucionEducativa{" + "nombre=" + nombre + ", creada=" + creada + ", provincia=" + provincia + ", canton=" + canton + ", parroquia=" + parroquia + ", zona=" + zona + '}';
    }

    /**
     * @return
     */
    @Override
    public void MostrarOpciones() {
        // TODO implement here
        return;
    }

}