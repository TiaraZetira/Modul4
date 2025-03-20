public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Nina", "105223040", "Teksnik Sipil", 3.5);
        Mahasiswa mhs2 = new Mahasiswa("Tiara", "105223041", "Teknik Kimia", 2.8);

        System.out.println("--- Data Mahasiswa 1 ---");
        mhs1.tampilkanInfo();
        System.out.println("Lulus? " + mhs1.cekLulus());

        System.out.println("\n--- Data Mahasiswa 2 ---");
        mhs2.tampilkanInfo();
        System.out.println("Lulus? " + mhs2.cekLulus());
    }
}