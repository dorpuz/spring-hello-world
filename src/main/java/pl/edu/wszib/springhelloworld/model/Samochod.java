package pl.edu.wszib.springhelloworld.model;

import org.springframework.stereotype.Component;

@Component
public class Samochod {

    private Karoseria karoseria;
    private Zawieszenie zawieszenie;

    public Samochod(Karoseria karoseria, Zawieszenie zawieszenie) {
        this.karoseria = karoseria;
        this.zawieszenie = zawieszenie;
    }
}
