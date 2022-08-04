package Interfaces;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

    String marca;
    String modelo;
    int puertas;
    int ventanas;

    public CocheCRUDImpl() {
    }

    public CocheCRUDImpl(String marca, String modelo, int puertas, int ventanas) {
        this.marca = marca;
        this.modelo = modelo;
        this.puertas = puertas;
        this.ventanas = ventanas;
    }


    @Override
    public void save() {
        System.out.println("Guardando el audi");
    }

    @Override
    public List<CocheCRUDImpl> findAll() {
        System.out.println("viendo el audi");
        return null;

    }

    @Override
    public void delete() {
        System.out.println("sacando el audi");
    }




    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", puertas=" + puertas +
                ", ventanas=" + ventanas +
                '}';
    }

}
