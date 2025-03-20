public class MahasiswaLatihan{
    // Atribut private
    String nama;
    String nim;
    String jurusan;
    double ipk;

    // Constructor
    public MahasiswaLatihan(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // Method untuk menampilkan info MahasiswaLatihan
    public void tampilkanInfo() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("IPK     : " + ipk);
    }

    // Method untuk cek kelulusan
    public boolean cekLulus() {
        return ipk >= 3.0;
    }
}
