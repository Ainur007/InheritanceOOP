public class Makanan {
    int idMakanan = 1;
    String namaMakanan = "Bakso";
    String jenis = "Berkuah";
    int harga = 10000;
    int jumlahPorsi = 2;

    void dibuat (){
        System.out.println( namaMakanan+", "+ jenis + " id "+ idMakanan +" sedang dibuat harap tunggu ya...");
    }

    void disajikan (){
        System.out.println("Ini " + namaMakanan + "nya, " + jumlahPorsi + " porsi ya, \nSelamat Menikmati ");
    }

    void tagihan (){
        System.out.println("\nTagihannya: \nharga 1 porsi "+ namaMakanan + ": " + harga + "\nJumlah porsi: "+ jumlahPorsi + "\nTotal tagihan: "+(jumlahPorsi*harga) + " Rupiah");
    }

    public static void main(String[] args) {
        Makanan bakso = new Makanan();

        bakso.dibuat();
        bakso.disajikan();
        bakso.tagihan();
    }

}


