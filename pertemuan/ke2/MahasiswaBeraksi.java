package pertemuan.ke2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException {
        Mahasiswa mhs = new Mahasiswa();
        SimpleDateFormat formatTanggal = new SimpleDateFormat("dd-MM-yyyy");

        mhs.npm = "19630391";
        mhs.nama = "Muhammad Aldi";
        mhs.tanggallahir =formatTanggal.parse("03-09-2001");

        System.out.println("NPM "+mhs.npm);
        System.out.println("NAMA "+mhs.nama);
        System.out.println("TANGGAL LAHIR "+formatTanggal.format(mhs.tanggallahir));

        System.out.println("**************************************");

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.npm = "20630391";
        mhs2.nama = "Muhammad Aldi MA";
        mhs2.tanggallahir =formatTanggal.parse("02-01-2002");

        System.out.println("NPM "+mhs2.npm);
        System.out.println("NAMA "+mhs2.nama);
        System.out.println("TANGGAL LAHIR "+formatTanggal.format(mhs2.tanggallahir));

    }
}
