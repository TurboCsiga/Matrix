package com.company;

import javax.swing.text.MutableAttributeSet;
import java.util.Arrays;

public class Matrix {
    private int sorokSzama;
    private int oszlopokSzama;
    private int[][] matrix;

    public Matrix(int sorokSzama, int oszlopokSzama) {
        this.sorokSzama = sorokSzama;
        this.oszlopokSzama = oszlopokSzama;
        this.matrix= new int[sorokSzama][oszlopokSzama];
    }

    public  Matrix() {
        this.sorokSzama = (int)(Math.random()*11)+5;
        this.oszlopokSzama = (int)(Math.random()*11)+5;
        this.matrix = new int[sorokSzama][oszlopokSzama];
        for (int j = 0; j < this.sorokSzama; j++) {
            for (int i = 0; i < this.sorokSzama; i++) {
                this.matrix[j][i]= (int)(Math.random()* 90)+10;
            }
        }
    }

    public boolean isNegyzetes(){
        return this.sorokSzama == this.oszlopokSzama;
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
