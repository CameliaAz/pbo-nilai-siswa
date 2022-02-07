package nilaisiswa;

import java.util.Scanner;

public class kelulusan {
 public static void main(String[] args) {
     siswa siswa = new siswa();
     siswa.nama_siswa();

     siswa hobi = new siswa();
     siswa.hobi_siswa();

     siswa umur = new siswa();
     siswa.umur_siswa();
    
     Scanner input = new Scanner(System.in);
     System.out.println("Inputkan nilai produktif RPL");
     int nilai = input.nextInt();

    System.out.println("Nilai anda = "+nilai);
    if(nilai >=80){
        System.out.println("TIDAK REMIDI");
    }
    else{
        System.out.println("REMIDI");
  }
 }
}
