public class ItDepartemen extends Pegawai{

    String departemen = "IT Support";
    @Override
    void perkenalan() {
        super.perkenalan();
        System.out.println("dari departemen " + departemen);
    }

    void alamat (){
        setAlamat("Jalanin aja dulu");
        System.out.println("Alamat: " + super.alamat);

    }
    void gaji (){
        System.out.println("Gaji saya : " + super.gaji);
    }


    public static void main(String[] args) {
        ItDepartemen run = new ItDepartemen();

        run.perkenalan();
        run.setAlamat("Jalan In Aja Dulu");
        run.alamat();
        run.gaji();

    }
}
