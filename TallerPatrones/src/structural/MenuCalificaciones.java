package structural;

import behavioral.IEscalaExtranjera;


/**
 * 
 */
public abstract class MenuCalificaciones extends MenuDecorator {
   
    private IEscalaExtranjera escala;

    /**
     * Default constructor
     */
    public MenuCalificaciones() {
    }

    /**
     * 
     */


    /**
     * @param i
     */
    public void MenuCalificaciones(MenuOpciones i) {
        // TODO implement here
    }

    /**
     * @param calif 
     * @param pais 
     * @return
     */
    public String Convertir(Float calif, String pais) {
        // TODO implement here
        return "";
    }

    /**
     * @param op 
     * @return
     */
    @Override
    public abstract String ejecutarOpcion(int op);

}