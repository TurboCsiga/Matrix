package com.company;

public class Main {

    public static void main(String[] args) {
	    Matrix m= new Matrix();
        System.out.println("Négyzetes-e: " + (m.isNegyzetes()?"igen": "nem"));

        System.out.println("A mátrix mérete: "+m.getSorokSzama()+" x "+m.getOszlopokSzama());
        System.out.println(m);
        System.out.println("\nA mátrix összege: " + m.osszeg());
        System.out.println("" + m.parosokSzama());
        System.out.println("" + m.legnagyobbElem());
    }
}
