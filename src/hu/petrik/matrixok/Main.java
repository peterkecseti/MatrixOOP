package hu.petrik.matrixok;

public class Main {
    public static void main(String[] args) {

        Matrix m1 = new Matrix(4, 5);
        Matrix m2 = new Matrix(5, 10);
        System.out.println(m1);
        System.out.println(System.lineSeparator());
        System.out.println(m2);
        System.out.printf("m1 pozitív elemeinek száma: %d" + Matrix.br(), m1.getPozitivElemek());
        System.out.printf("m2 pozitív elemeinek száma: %d" + Matrix.br(), m2.getPozitivElemek());
        System.out.printf("m1 összege: %d" + Matrix.br(), m1.getElemekOsszege());
        System.out.printf("m2 összege: %d" + Matrix.br(), m2.getElemekOsszege());
        System.out.printf("m1 legnagyobb eleme: %d" + Matrix.br(), m1.legnagyobbElem());
        System.out.printf("m2 legnagyobb eleme: %d" + Matrix.br(), m2.legnagyobbElem());
        int[] elsoPozitivM1 = m1.findElsoPozitivElem();
        int[] elsoPozitivM2 = m2.findElsoPozitivElem();
        System.out.printf("m1 első pozitív eleme: [%d,%d]", elsoPozitivM1[0], elsoPozitivM1[1]);
        System.out.printf("m2 első pozitív eleme: [%d,%d]", elsoPozitivM2[0], elsoPozitivM2[1]);
    }
}
