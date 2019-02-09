package pl.edu.wszib.springhelloworld;

import java.util.HashMap;
import java.util.Map;

public class MapDateBase implements DataBase {

    private Map<String,String> baza = new HashMap<>();


    @Override
    public void save(String klucz, String wartosc) {
        baza.put(klucz,wartosc);
    }

    @Override
    public String get(String klucz) {
        return baza.get(klucz);
    }

    @Override
    public void delete(String klucz) {
        baza.remove(klucz);
    }
}
