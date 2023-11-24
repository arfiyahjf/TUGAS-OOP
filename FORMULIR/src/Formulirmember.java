public class Formulirmember extends Baseformulir{
    public String kodemember;

    void Tatatertib() {
        System.out.println("Tata Tertib Member");
    }

    @Override
    void Carabayar() {
        System.out.println("Cara Bayar Untuk Member");
        super.Carabayar();
    }
}
