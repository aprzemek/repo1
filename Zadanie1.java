package pl.sda.strumienie;


// Używając strumieni:
//- wypisz tylko linie nieparzyste
//- wypisz tylko linie zaczynające są od litery "a"
//- wypisz całą zawartość pliku, ale zamień każde wystąpienie “a” na “b”
//- wypisz ilość wystąpień litery “a” w linii
//
//Użyj pliku słownikowego utworzonego na potrzeby gry Wisielec.


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Zadanie1 {

    public static void main(String[] args) {


        Path file = Paths.get("c:/sda/wyselekcjonowane.txt");
        Charset charset = Charset.forName("UTF-8");
        try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }



    }

}
