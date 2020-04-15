package com.rk.aidk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Programs {
    public static void main(String[] args) {
        BufferedReader dataInput = new BufferedReader((new InputStreamReader(System.in)));
        String Nama = "";

        System.out.print("Masukkan Nama Kamu   : ");

        try {
            Nama = dataInput.readLine();
        } catch (IOException PesanError) {
            System.out.println("Error: " + PesanError);
        }

        System.out.println("Hallo " + Nama + "!");
    }
}
