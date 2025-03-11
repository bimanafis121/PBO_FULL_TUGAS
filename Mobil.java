
 public class Mobil2 {
     String warna;
     int tahunProduksi;
     boolean status = false;
     int gigi = 0;
 
     public void hidupkanMobil () {
         if (status == false) {
             status = true;
             System.out.println("Mobil menyala.");
         }
 
         else {
             System.out.println("Mobil sudah dalam keadaan menyala.");
         }
     }
 
     public void matikanMobil () {
         if (status == true) {
             status = false;
             System.out.println("Mobil dimatikan.");
         }
 
         else {
             System.out.println("Mobil sudah dalam keadaan mati.");
         }
     }
 
     public void gantiGigi (int gigi) {
         this.gigi = gigi;
         System.out.println("Mengubah gigi menjadi gigi " + gigi);
     }
 }