package pl.edu.wszib.springhelloworld.model;

import org.springframework.stereotype.Component;

@Component
public class UkladSterowania {

    private Kierownica kierownica;

    public UkladSterowania(Kierownica kierownica) {
        this.kierownica = kierownica;
    }
}
