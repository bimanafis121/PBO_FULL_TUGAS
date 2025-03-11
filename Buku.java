public class Buku {
    String judul;
    String pengarang;
    String penerbit;
    int tahunTerbit;

    public Buku (String judul, String pengarang, String penerbit, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
    }

    public void cetakBuku() {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Penerbit : " + penerbit);
        System.out.println("Tahun : " + tahunTerbit);
    }
}