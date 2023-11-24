public class Mainkendaraan {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.merk = "Toyota";
        mobil.warna = "Hitam";
        mobil.tahunProduksi = 2022;
        mobil.jumlahPintu = 4;

        SepedaMotor sepedaMotor = new SepedaMotor();
        sepedaMotor.merk = "Honda";
        sepedaMotor.warna = "Kuning";
        sepedaMotor.tahunProduksi = 2021;
        sepedaMotor.jenisMotor = "Matic";

        Sepeda sepeda = new Sepeda();
        sepeda.merk = "Polygon";
        sepeda.warna = "Abu-abu";
        sepeda.tahunProduksi = 2020;
        sepeda.jumlahGigi = 6;

        System.out.println("merk mobil : " + mobil.merk);
        System.out.println("warna mobil : " + mobil.warna.toLowerCase()); 
        System.out.println("tahun produksi : " + mobil.tahunProduksi);
        System.out.println("jumlah pintu : " + mobil.jumlahPintu);
        mobil.nyalakanMesin();
        mobil.klakson();

        System.out.println("\nmerk sepeda motor : " + sepedaMotor.merk);
        System.out.println("warna sepeda motor : " + sepedaMotor.warna.toLowerCase());
        System.out.println("tahun produksi sepeda motor : " + sepedaMotor.tahunProduksi);
        System.out.println("jenis sepeda motor : " + sepedaMotor.jenisMotor);
        sepedaMotor.nyalakanMesin();
        sepedaMotor.klakson();

        System.out.println("\nmerk sepeda : " + sepeda.merk);
        System.out.println("warna sepeda : " + sepeda.warna.toLowerCase()); 
        System.out.println("tahun produksi sepeda : " + sepeda.tahunProduksi);
        System.out.println("jumlah gigi sepeda : " + sepeda.jumlahGigi);
        sepeda.nyalakanMesin();
        sepeda.klakson();
    }
}