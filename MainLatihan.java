public class MainLatihan {
    public static void main(String[] args) {
        MahasiswaLatihan mhs1 = new MahasiswaLatihan("Nina", "105223040", "Teksnik Sipil", 3.5);
        MahasiswaLatihan mhs2 = new MahasiswaLatihan("Tiara", "105223041", "Teknik Kimia", 2.8);

        System.out.println("--- Data Mahasiswa 1 ---");
        mhs1.tampilkanInfo();
        System.out.println("Lulus? " + mhs1.cekLulus());

        System.out.println("\n--- Data Mahasiswa 2 ---");
        mhs2.tampilkanInfo();
        System.out.println("Lulus? " + mhs2.cekLulus());
    }
}