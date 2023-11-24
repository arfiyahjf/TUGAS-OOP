public class Mainformulir {
    public static void main(String[] args) {

        System.out.println();
        Formulirmahasiswa formulir01 = new Formulirmahasiswa();
        formulir01.Carabayar();
        formulir01.Tatatertib();

        System.out.println();
        Formulirdosen formulir02 = new Formulirdosen();
        formulir02.Carabayar();
        formulir02.Tatatertib();

        System.out.println();
        Formuliradmin formulir03 = new Formuliradmin();
        formulir03.Carabayar();
        formulir03.Tatatertib();
    }
}