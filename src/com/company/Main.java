package com.company;

public class Main {

    public static void main(String[] args) {
	    Matrix m= new Matrix();
        System.out.println("Négyzetes-e: " + (m.isNegyzetes()?"igen": "nem"));
        System.out.println(m);
    }
}
