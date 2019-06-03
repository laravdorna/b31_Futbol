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
public class Maxasista extends Seleccion {

    private String titulacion;
    private int anosExperiencia;

    public Maxasista() {
    }

    
    public Maxasista(int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
    }

    public Maxasista(String titulacion, int anosExperiencia, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return "Maxasista: \n ID :\t" + super.getId() + "\n NOME: \t" + super.getNome()
                + "\n APELIDOS: \t" + super.getApelido() + "\n EDADE: \t" + super.getEdade()
                + "\n TITULACION: \t" + titulacion +"\n ANOS DE EXPERIENCIA: \t" +anosExperiencia;
    }

    @Override
    public void viajar() {
        System.out.println("\nViaxan os maxaxistas"); 
    }

  
    
    public void darMasaxes() {
    }
}
