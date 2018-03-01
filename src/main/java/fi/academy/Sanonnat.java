package fi.academy;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Sanonnat {

    List<Sanonta> lista = new ArrayList<>();


    public List palautaSanoma() {
        return lista;
    }
    public void lisaaSanoma() {
        lista.add(new Sanonta());
    }
    public void poistaSanoma() {
        lista.remove(new Sanonta());
    }
}
