/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_taller_patrones;

import structural.MenuFacade;

/**
 *
 * @author ASUS
 */
public class DS_Taller_Patrones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MenuFacade menu = new MenuFacade();
        System.out.println("Escoja la institución: ");
        menu.imprimirInstituciones();
    }
    
}
