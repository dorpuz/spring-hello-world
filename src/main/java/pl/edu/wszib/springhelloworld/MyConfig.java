package pl.edu.wszib.springhelloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pl.edu.wszib.springhelloworld.model.KartaDoGlosowania;
import pl.edu.wszib.springhelloworld.model.Urna;
import pl.edu.wszib.springhelloworld.model.Wyborca;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Configuration
public class MyConfig {


    public KartaDoGlosowania kartaDoGlosowania(){
        return new KartaDoGlosowania();
    }

    /*@Bean
    public Urna urna(){
        return new Urna();
    }*/

    @Bean
    public Urna urna(List<Wyborca> wyborcy){
        Urna u = new Urna();
        wyborcy.forEach(wyborca -> wyborca.oddajGlos(u));
        u.zlicz();
        return u;
    }

  /*  @Bean
    public Wyborca wyborca1(KartaDoGlosowania kartaDoGlosowania){
        return new Wyborca(kartaDoGlosowania);
    }
    @Bean
    public Wyborca wyborca2(KartaDoGlosowania kartaDoGlosowania){
        return new Wyborca(kartaDoGlosowania);
    }
    @Bean
    public Wyborca wyborca3(KartaDoGlosowania kartaDoGlosowania){
        return new Wyborca(kartaDoGlosowania);
    }*/

    @Bean
    public List<Wyborca> wyborcy(){
        List<Wyborca> lista = new ArrayList<>(1200);
        IntStream.range(0,1200)
                .forEach(i -> {
                    lista.add(new Wyborca(kartaDoGlosowania()));
                });
        return lista;
    }

  /*  @Bean
    public String execute(Wyborca wyborca1, Wyborca wyborca2, Wyborca wyborca3, Urna urna){
        wyborca1.oddajGlos(urna);
        wyborca3.oddajGlos(urna);
        wyborca2.oddajGlos(urna);
        urna.zlicz();
        return "";
    }*/
}
