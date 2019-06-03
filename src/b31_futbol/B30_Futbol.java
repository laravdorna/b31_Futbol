/*

Crear un proxecto que simule o comportamento dunha selección de futbol .
Para iso definir 3 clases que representan a obxectos xogador,
adestrador e masaxista .

 */
package b31_futbol;

/**
 *
 * @author Lara Vazquez Dorna
 */
public class B30_Futbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        5- Define a clase Boletin 13 cas seguintes sentencias :
        * instancia un obxecto de cada clase
        * instancia un xogador de tipo Seleccion
        * chama ao método concentrarse a través de cada obxecto. ¿ Que observas ?.
        * Invoca ao método viaxar a través de cada obxecto. ¿ Cal é a saida ?

         */

        //instancia un obxecto de cada clase
        Xogador xogadorEx = new Xogador(2, "delantero", 2, "Manolo", "Sanchez", 22);
        Entrenador entrenadorEx = new Entrenador("E22", 3, "Jose", "Perez", 50);
        Maxasista maxasistaEx = new Maxasista("Fisioterapeuta", 35, 25, "Juan", "Mar", 57);

        // instancia un xogador de tipo Seleccion
        Seleccion plantillaEx = new Seleccion(1, "Pepe", "Alvarez", 20);
        // chama ao método concentrarse a través de cada obxecto. ¿ Que observas ?.
        //como el metodo no está sobre escrito, siempre sale el mismo mensaje

//		Viaxa a selección
//
//                Viaxan os xogadores
//
//                Viaxa o entrenador
//
//                Viaxan os maxaxistas
        plantillaEx.concentrarse();
        xogadorEx.concentrarse();
        entrenadorEx.concentrarse();
        maxasistaEx.concentrarse();

        //Invoca ao método viaxar a través de cada obxecto. ¿ Cal é a saida ?
        // como el metodo está sobre escrito salen mensajes especificos para 
        //cada clase 
        plantillaEx.viajar();
        xogadorEx.viajar();
        entrenadorEx.viajar();
        maxasistaEx.viaxar();

    }

}
