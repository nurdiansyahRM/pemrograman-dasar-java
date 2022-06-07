package platform.nurdiansyah;

import java.util.Scanner;

public class DataKaryawan {
    public static void main(String[]args){
           String nama,alamat;
           int usia,gaji;
           //membuat scaneer
    Scanner Keyboard =  new Scanner (System.in);
    // tampilkan output ke user
    System.out.println("### pendaftaran karyawan PT. unikom ###");
    System.out.println("nama karyawan : ");
    //menggunakan scanner dan menyimpan apa yang diketik di variabel nama
    nama = Keyboard.nextLine();
    //tampilkan output
    System.out.println ("alamat : ");
    alamat = Keyboard.nextLine();
    System.out.println ("usia : ");
    usia = Keyboard.nextInt();
    System.out.println ("gaji : ");
    gaji = Keyboard.nextInt();
    //menampilkan apa yang sudah simpan di variabel
    System.out.println("----------------");
    System.out.println("nama karyawan : " + nama);
    System.out.println("alamat : " + alamat);
    System.out.println("usia : " + usia + "tahun");
    System.out.println("Gaji RP : " + gaji);    
    
    
    }
    
}
