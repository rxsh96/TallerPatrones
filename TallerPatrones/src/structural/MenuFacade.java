/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural;

import java.util.ArrayList;
import creational.CreatorInstitucion;
import sinPatron.InstitucionEducativa;

/**
 *
 * @author ASUS
 */
public class MenuFacade {
    
    private final ArrayList<InstitucionEducativa> arr = new ArrayList<>();
    
    public MenuFacade(){
        InstitucionEducativa institucion;
        int cont = 1;
        do{
            institucion = CreatorInstitucion.inicializarInstitucion(cont);
            if(institucion != null)
                arr.add(institucion);
            cont++;
        }
        while(institucion != null);
    }
    
    public void imprimirInstituciones(){
        for(int i = 0; i < arr.size(); i++){
            InstitucionEducativa ins = arr.get(i);
            System.out.println(ins.GetInfo());
        }
    }
    
    public InstitucionEducativa getInstitucion(int id){
        return arr.get(id-1);
    }
}
