package creational;

import structural.MenuOpciones;

/**
 * 
 */
public abstract class MenuBuilder {

    protected MenuOpciones m;

    /**
     * Default constructor
     */
    public MenuBuilder() {
    }

    /**
     * 
     */

    /**
     * @return
     */
    public MenuOpciones getMenu() {
        // TODO implement here
        return null;
    }

    /**
     * 
     */
    public abstract void definirMenu();

    /**
     * 
     */
    public abstract void construirMenu();

}