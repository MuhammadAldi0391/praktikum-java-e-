package pertemuan.ke2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MahasiswaBeraksiMethod {
    public static void main(String[] args) throws ParseException {
        Mahasiswa mhs2 = new Mahasiswa();
        SimpleDateFormat formatTanggal = new SimpleDateFormat("dd-MM-yyyy");
        mhs2.npm = "20630391";
        mhs2.nama = "Muhammad Aldi MA";
        mhs2.tanggallahir =formatTanggal.parse("03-09-2001");

        mhs2.tampilkanIdentitasDiri();

        System.out.println("Usia "+mhs2.nama+" adalah "+mhs2.hitungUsia()+" tahun");

        System.out.println(mhs2.hitungkali(7,9));

        mhs2.SapaNama("Aldi");
    }
}
