package Interfaces;


public class Main{


    public static void main(String[] args) {

        CocheCRUD cocheCrud = new CocheCRUDImpl();

        CocheCRUD audi = new CocheCRUDImpl("Audi","A3",5,5);
        System.out.println(audi);
        audi.save();
        audi.findAll();
        audi.delete();


    }
}
