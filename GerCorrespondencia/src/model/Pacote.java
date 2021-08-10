package model;

import java.util.Objects;

/**
 * Write a description of class model.Pacote here.
 *
 * @author (Caroline Scherer, Daiane Marcon, Mateus Vagner)
 * @version (1.0)
 */
public class Pacote extends Correspondencia
{
    // instance variables - replace the example below with your own
    private String empresa;

    /**
     * Constructor for objects of class model.Pacote
     */
    public Pacote(Destinatario destino, String empresa)
    {
        super (destino);
        this.empresa = empresa;
    }
   
    public String toString(){
        return super.toString() + "\nEmpresa remetente: "+ empresa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pacote pacote = (Pacote) o;
        return empresa.equals(pacote.empresa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), empresa);
    }
}
