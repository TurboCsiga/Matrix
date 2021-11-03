package com.company;

import javax.swing.text.MutableAttributeSet;
import java.util.Arrays;

public class Matrix {
    protected int sorokSzama;
    protected int oszlopokSzama;
    protected int[][] matrix;

    public int getSorokSzama() {
        return sorokSzama;
    }

    public int getOszlopokSzama() {
        return oszlopokSzama;
    }

    public Matrix(int sorokSzama, int oszlopokSzama) {
        this.sorokSzama = sorokSzama;
        this.oszlopokSzama = oszlopokSzama;
        this.matrix= new int[sorokSzama][oszlopokSzama];
    }

    public  Matrix() {
        this.sorokSzama = (int)(Math.random()*11)+5;
        this.oszlopokSzama = (int)(Math.random()*11)+5;
        this.matrix = new int[sorokSzama][oszlopokSzama];
        this.feltolt();
    }

    protected void feltolt(){
        for (int j = 0; j < this.sorokSzama; j++) {
            for (int i = 0; i < this.sorokSzama; i++) {
                this.matrix[j][i]= (int)(Math.random()* 90)+10;
            }
        }
    }

    public boolean isNegyzetes(){
        return this.sorokSzama == this.oszlopokSzama;
    }

    public long osszeg() {
        long sum = 0;
        for (int i = 0; i < this.sorokSzama; i++) {
            for (int j = 0; j < this.oszlopokSzama; j++) {
                sum+= matrix[i][j];
            }
        }
        return sum;
    }

    public int parosokSzama(){
        int db = 0;
        for (int i = 0; i < this.sorokSzama; i++) {
            for (int j = 0; j < this.oszlopokSzama; j++) {
                if (matrix[i][j] % 2 == 0){
                    db++;
                }
            }
        }
        return db;
    }

    public int legnagyobbElem(){
        int max = matrix[0][0];
        for (int i = 0; i < this.sorokSzama; i++) {
            for (int j = 0; j < this.oszlopokSzama; j++) {
                if (matrix[i][j] > max)
                max = matrix[i][j];
            }
        }
        return max;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < this.sorokSzama; i++) {
            for (int j = 0; j < this.oszlopokSzama; j++) {
                s += matrix[i][j] +"";
            }
            s += "\n";
        }
        return s;
    }
}
