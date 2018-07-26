package structural;


/**
 * 
 */
public abstract class MenuCertificado extends MenuDecorator {

    /**
     * Default constructor
     */
    public MenuCertificado() {
    }

    /**
     * @param i
     */
    public void MenuCertificado(MenuOpciones i) {
        // TODO implement here
    }

    /**
     * @param op 
     * @return
     */
    @Override
    public abstract String ejecutarOpcion(int op);

}