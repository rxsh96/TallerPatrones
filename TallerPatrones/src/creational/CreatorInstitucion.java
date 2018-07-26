/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational;

import sinPatron.InstitucionEducativa;
import sinPatron.*;

/**
 *
 * @author ASUS
 */
public class CreatorInstitucion {
    public static InstitucionEducativa inicializarInstitucion(int id) {
        if(id == 1){
            return new Jatun();
        }
        else if (id == 2){
            return new Sumak();
        }
        else if(id == 3){
            return new ConsueloBenavides();
        }
        return null;
    }
}
