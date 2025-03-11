public class BukuDemo {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Pemrograman Berbasis Objek dengan Java", "Indrajani", "Elexmedia Komputindo", 2007);
        Buku buku2 = new Buku("Dasar Pemrograman Java", "Abdul Kadir", "Andi Offset", 2004);

        buku1.cetakBuku();
        buku2.cetakBuku();
    }
}