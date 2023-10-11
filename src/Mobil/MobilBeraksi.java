package Mobil;

import Mobil.Mobil;

public class MobilBeraksi {
    public static void main(String[] args){
        Mobil mobilku=new Mobil();
        mobilku.warna="kuning";
        mobilku.tahunProduksi=2018;
        System.out.println("warna :"+mobilku.warna);
        System.out.println("Tahun :"+mobilku.tahunProduksi);
    }
}
