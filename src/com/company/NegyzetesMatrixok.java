package com.company;

public class NegyzetesMatrixok  extends Matrix {

    public NegyzetesMatrixok(int sorokSzama) {
        super(sorokSzama, sorokSzama);
    }

    public NegyzetesMatrixok(){
        this((int)(Math.random()*10)+5);
        this.feltolt();
    }

    public int foatloOsszeg(){
        int sum = 0;
        for (int i = 0; i < this.matrix.length; i++) {

            sum += matrix[i][i];
        }
        return sum;
    }

    public int mellekatloLegnagyobbElem(){
        int max = matrix[0][this.oszlopokSzama-1];
        for (int i = 0; i < sorokSzama; i++) {
            if (max < matrix[i][(this.oszlopokSzama-1)-i]){
                max= matrix[i][(this.oszlopokSzama-1)-i];
            }
        }
        return max;
    }
}
