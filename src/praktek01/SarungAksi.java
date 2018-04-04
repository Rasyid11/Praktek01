/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author Rasyid
 */
public class SarungAksi {
    public static void main(String[] args) {
        Sarung Hasan = new Sarung();
        
        Hasan.Merk="Wadimor";
        Hasan.Bahan="Songket";
        Hasan.Motif="Bunga";
        Hasan.Asal="Minangkabau";
        Hasan.Warna="Orange dan Kuning";
        
        Hasan.SebagaiAlatSholatdanPenutupAurat();
        
        Sarung Rasid = new Sarung();
        
        Rasid.Merk="GajahDuduk";
        Rasid.Bahan="Tenun";
        Rasid.Motif="Kotak-Kotak";
        Rasid.Asal="Samarinda";
        Rasid.Warna="Merah dan Coklat";
        
        Rasid.SebagaiAlatSholatdanPenutupAurat();
        
        Sarung Bapak = new Sarung();
        
        Bapak.Merk="Atlass";
        Bapak.Bahan="Tapis";
        Bapak.Motif="Garis-garis";
        Bapak.Asal="Lampung";
        Bapak.Warna="Biru dan Hijau";
        
        Bapak.SebagaiAlatSholatdanPenutupAurat();
    }
}
