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
public class Entrenador extends Seleccion {

    private String idFederacion;

    public Entrenador() {
    }

    public Entrenador(int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
    }

    public Entrenador(String idFederacion, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
        this.idFederacion = idFederacion;
    }

    
    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    

    @Override
    public String toString() {
        return"Entrenador \n ID :\t" + super.getId() + "\n NOME: \t" + super.getNome()
                + "\n APELIDOS: \t" + super.getApelido() + "\n EDADE: \t" + super.getEdade()
                + "\n ID FEDERACIÓN: \t" +idFederacion;
    }

    @Override
    public void viajar() {
        System.out.println("\nViaxa o entrenador");
    }
    
    public void dirixirPartido() {

    }

    public void dirixirAdestramento() {
    }

}
