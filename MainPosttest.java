class Mobil {
    private String nomorPlat;
    private String merek;
    private double hargaSewa;
    private boolean tersedia;

    public Mobil() {
        this("", "", 0.0, true);
    }

    public Mobil(String nomorPlat, String merek, double hargaSewa, boolean tersedia) {
        this.nomorPlat = nomorPlat;
        this.merek = merek;
        this.hargaSewa = hargaSewa;
        this.tersedia = tersedia;
    }

    public String getNomorPlat() { 
        return nomorPlat; 
    }
    
    public String getMerek() {
        return merek;
    }

    public double getHargaSewa() {
        return hargaSewa; 
    }

    public boolean isTersedia() { 
        return tersedia; 
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    public void tampilkanInfo() {
        System.out.println("Nomor Plat: " + nomorPlat + ", Merek: " + merek + ", Harga Sewa: " + formatRupiah(hargaSewa) + ", Tersedia: " + (tersedia ? "Ya" : "Tidak"));
    }

    public static String formatRupiah(double jumlah) {
        return "Rp " + String.format("%,.2f", jumlah);
    }
}

class Pelanggan {
    private String nama;
    private String nomorKTP;
    private String nomorHP;

    public Pelanggan(String nama, String nomorKTP, String nomorHP) {
        this.nama = nama;
        this.nomorKTP = nomorKTP;
        this.nomorHP = nomorHP;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", Nomor KTP: " + nomorKTP + ", Nomor HP: " + nomorHP);
    }
}

class Sewa {
    private Pelanggan pelanggan;
    private Mobil mobil;
    private int durasi;
    private double totalBiaya;
    private boolean sukses;

    public Sewa(Pelanggan pelanggan, Mobil mobil, int durasi) {
        this.pelanggan = pelanggan;
        this.mobil = mobil;
        this.durasi = durasi;
        this.prosesSewa();
    }

    private void prosesSewa() {
        if (mobil.isTersedia()) {
            mobil.setTersedia(false);
            totalBiaya = hitungDiskon(mobil.getHargaSewa() * durasi, durasi);
            sukses = true;
        } else {
            sukses = false;
        }
    }

    public void tampilkanStruk() {
        System.out.println("==== Struk Penyewaan ====");
        pelanggan.tampilkanInfo();
        mobil.tampilkanInfo();
        System.out.println("Durasi: " + durasi + " hari");
        System.out.println("Total Biaya: " + Mobil.formatRupiah(totalBiaya));
        System.out.println("Status: " + (sukses ? "Berhasil" : "Gagal, Mobil Tidak Tersedia"));
    }

    public static double hitungDiskon(double total, int durasi) {
        return (durasi > 5) ? total * 0.9 : total;
    }
}

public class MainPosttest {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("BK 124 AA", "Toyota Avanza", 450000, true);
        Mobil mobil2 = new Mobil("D 567 YY", "Honda Jazz", 500000, true);

        Pelanggan pelanggan1 = new Pelanggan("Tiara", "1234567", "085678910");
  
        System.out.println("Daftar Mobil Tersedia:");
        mobil1.tampilkanInfo();
        mobil2.tampilkanInfo();

        Sewa sewa1 = new Sewa(pelanggan1, mobil1, 7);
        sewa1.tampilkanStruk();
    }
}