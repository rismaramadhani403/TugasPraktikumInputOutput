/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum5;

/**
 *
 * @author ASUS
 */
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.io.*;
import java.util.*;

public class LatihanC {
    public static void main(String[] args) {
        Path inputPath = Paths.get("input.txt");
        Path outputPath = Paths.get("count.txt");
        Map<String, Integer> frekuensi = new HashMap<>();

        try (BufferedReader br = Files.newBufferedReader(inputPath, StandardCharsets.UTF_8)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] kata = line.toLowerCase().replaceAll("[^a-z0-9\\s]", "").split("\\s+");
                for (String k : kata) {
                    if (!k.isEmpty()) frekuensi.put(k, frekuensi.getOrDefault(k, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.err.println("Gagal membaca file: " + e.getMessage());
            return;
        }

        try (BufferedWriter bw = Files.newBufferedWriter(outputPath, StandardCharsets.UTF_8)) {
            for (Map.Entry<String, Integer> entry : frekuensi.entrySet()) {
                bw.write(entry.getKey() + ":" + entry.getValue());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Gagal menulis file: " + e.getMessage());
        }

        System.out.println("Proses selesai. Hasil disimpan di count.txt");
    }
}
   

