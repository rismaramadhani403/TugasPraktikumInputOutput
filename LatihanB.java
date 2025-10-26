/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum5;

/**
 *
 * @author ASUS
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LatihanB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan kalimat: ");
        String kalimat = br.readLine();
        String[] kata = kalimat.trim().split("\\s+");
        System.out.println("Jumlah kata: " + kata.length);
    }
}


