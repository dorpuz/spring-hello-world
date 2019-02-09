package pl.edu.wszib.springhelloworld;

import org.apache.tomcat.util.http.fileupload.FileUtils;

import java.io.*;
import java.util.Scanner;

public class FileDataBase implements DataBase {
    @Override
    public void save(String klucz, String wartosc) {
        try {
            PrintWriter plik = new PrintWriter(klucz + ".txt", "UTF-8");
            plik.append(wartosc);
            plik.close();
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String get(String klucz) {
        try {
            Scanner scanner = new Scanner(new File(klucz + ".txt"));
            return scanner.next("\\A");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete(String klucz) {
        try {
            FileUtils.forceDelete(new File(klucz + ".txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
