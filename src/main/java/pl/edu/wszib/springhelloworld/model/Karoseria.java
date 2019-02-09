package pl.edu.wszib.springhelloworld.model;

import org.springframework.stereotype.Component;

@Component
public class Karoseria {

    private Drzwi drzwi;

    public Karoseria(Drzwi drzwi) {
        this.drzwi = drzwi;
    }
}
