package pl.edu.wszib.springhelloworld;

public interface DataBase {

    void save(String klucz, String wartosc);
    String get (String klucz);
    void delete(String klucz);
    }
