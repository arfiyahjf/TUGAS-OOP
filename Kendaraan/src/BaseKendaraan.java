public abstract class BaseKendaraan {
    public String merk;
    public String warna;
    public int tahunProduksi;

    void nyalakanMesin() {
        System.out.println("Mesin kendaraan dinyalakan.");
    }

    abstract void klakson();
}