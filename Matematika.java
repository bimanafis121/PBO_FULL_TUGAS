public class Matematika {
     public int pertambahan (int a, int b) {
         return a + b;
     }
 
     public int pengurangan (int a, int b) {
         return a - b;
     }
 
     public int perkalian (int a, int b) {
         return a * b;
     }
 
     public int pembagian (int a, int b) {
         if (b != 0) {
             return a / b;
         }
 
         else {
             System.out.println("Tidak bisa pembagian dengan 0");
             return 0;
         }
     }
 }