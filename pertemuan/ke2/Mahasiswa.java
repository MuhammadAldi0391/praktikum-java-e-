package pertemuan.ke2;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mahasiswa {
    String npm, nama;
    Date tanggallahir;

    void tampilkanIdentitasDiri(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("NPM "+this.npm);
        System.out.println("NAMA LENGKAP "+this.nama);
        System.out.println("TANGGAL LAHIR "+sdf.format(this.tanggallahir));
    }

    int hitungUsia(){
        Calendar tglLahir = Calendar.getInstance();
        tglLahir.setTime(this.tanggallahir);
        Calendar hariIni = Calendar.getInstance();

        int selisih = hariIni.get(Calendar.YEAR)- tglLahir.get(Calendar.YEAR);
        if(hariIni.get(Calendar.MONTH)< tglLahir.get(Calendar.MONTH)){
            selisih--;
        }else{
            if(hariIni.get(Calendar.MONTH)== tglLahir.get(Calendar.MONTH)
                    &&
                    hariIni.get(Calendar.DAY_OF_MONTH)< tglLahir.get(Calendar.DAY_OF_MONTH)){
                selisih--;
            }
        }
        return selisih;
    }
    double hitungkali(double nilai1, double nilai2){
        return nilai1* nilai2;
    }

    void SapaNama(String nama){
        JOptionPane.showMessageDialog(
                null, "Halo "+nama, "Ini Judul", JOptionPane.WARNING_MESSAGE);
    }
}

