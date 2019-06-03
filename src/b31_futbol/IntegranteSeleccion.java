/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b31_futbol;

/**
 *
 * @author lvazquezdorna
 */
public interface IntegranteSeleccion {
  
    
    public void concentrarse();
    
    public void viajar();
    
    public void entrenar();
    
    public void jugarPartido();
    
    public default void ruedaPrensa(){
        System.out.println("Rueda de Prensa");
    }
    
    public default void videoPublicitario(){
        System.out.println("Video Publicitario");
    }
    
}

