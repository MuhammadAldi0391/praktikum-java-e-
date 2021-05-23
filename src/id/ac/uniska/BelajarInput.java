package id.ac.uniska;

import javax.swing.*;
import java.util.Scanner;

public class BelajarInput {

    public static void main(String[] args) {

        String namaLengkap;//null

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama Lengkap Anda : ");
        namaLengkap = input.nextLine();//string

        System.out.println("Nama Lengkap Anda Adalah : "+namaLengkap);
    }
}
