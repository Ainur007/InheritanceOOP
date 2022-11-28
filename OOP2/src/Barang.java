public class Barang {
    private int kodeBarang = 1;
    private String namaBarang = "Kursi";
    private int harga = 20000;
    private int jumlah;
    private String kategori = "Mebel";

    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }

    public int getJumlah(){
        return this.jumlah;
    }
    public void preparing (){
        System.out.println("Kode barang " + kodeBarang + " dengan nama barang " + namaBarang + " sedang disiapkan\n");
    }

    public void checking (){
        System.out.println("Barang " + namaBarang + " dengan jumlah " + getJumlah() + " sedang di check\n");
    }

    public void sending (){
        System.out.println("Barang " + namaBarang + " dengan kategori " + kategori + " telah dikirim\n");
    }

    protected void tagihan(){
        System.out.println("Total tagihan \nNama barang: " + namaBarang + "\nHarga: " + harga + "\nJumlah: " + getJumlah() + "\nTagihan: " + (harga*jumlah));
    }
}
