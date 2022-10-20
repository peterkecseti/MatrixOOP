package hu.petrik.matrixok;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    private int sor;
    private int oszlop;
    private int[][] m;
    private static final Random rnd = new Random();

    public Matrix(int sor, int oszlop) {
        this.sor = sor;
        this.oszlop = oszlop;
        this.m = new int[sor][oszlop];
        for (int i = 0; i < this.m.length; i++) {
            for (int j = 0; j < this.m[i].length; j++) {
                this.m[i][j] = rnd.nextInt(199)-99;
            }
        }
    }

    public int getElemekOsszege(){
        int osszeg = 0;
        for (int[] sor : this.m){
            for(int elem : sor) {
                osszeg += elem;
            }
        }
        return osszeg;
    }
    public int getPozitivElemek(){
        int pozitivElemek = 0;
        for (int[] sor : this.m) {
            for(int elem : sor){
                if (elem > 0){
                    pozitivElemek++;
                }
            }
        }
        return pozitivElemek;
    }

    /*public int legnagyobbElem(){
        int legnagyobbElem = 0;
        for(int[] sor : this.m){
            for(int elem : sor){
                if (elem > legnagyobbElem){
                    legnagyobbElem = elem;
                }
            }
        }
        return legnagyobbElem;
    }*/
    public int legnagyobbElem(){
        int legnagyobbElem = 0;
        for (int i = 0; i < this.m[0].length; i++) {
            for (int j = 0; j < this.m.length; j++) {
                if (legnagyobbElem < this.m[j][i]){
                    legnagyobbElem = m[j][i];
                }
            }

        }
        return legnagyobbElem;
    }

    public int[] findElsoPozitivElem(){
        int sorIndex = 0;
        int oszlopIndex = 0;
        while (sorIndex < this.m.length && this.m[sorIndex][oszlopIndex] < 1){
            oszlopIndex = 0;
            while (oszlopIndex < this.m[sorIndex].length && this.m[sorIndex][oszlopIndex] < 1){
                oszlopIndex++;
            }
            if (oszlopIndex == this.m[sorIndex].length) {
                oszlopIndex = 0;
                sorIndex++;
            }
        }
        if (sorIndex == this.m.length){
            sorIndex = -1;
            oszlopIndex = -1;
        }
        return new int[]{sorIndex, oszlopIndex};
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.m.length; i++) {
            for (int j = 0; j < this.m[i].length; j++) {
                sb.append(String.format("%d ", this.m[i][j]));
            }
            if (i != this.m.length - 1){
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    public static String br(){
        return System.lineSeparator();
    }


}
