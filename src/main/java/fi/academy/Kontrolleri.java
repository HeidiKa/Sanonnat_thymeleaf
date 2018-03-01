package fi.academy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Kontrolleri {

    private Sanonnat sanonnat;



  public Kontrolleri(@Autowired Sanonnat sanonnat) {
        this.sanonnat = sanonnat;
    }

    @GetMapping("/sanonnat")
    public String tulostaSanonnat(Model model) {

        sanonnat.lista.add (new Sanonta("moi", "moimoi" ));
        sanonnat.lista.add(new Sanonta("Gone with the wind", "Frankly, my dear, I don't give a damn."));
        sanonnat.lista.add(new Sanonta("Star Wars","May the Force be with you."));
        sanonnat.lista.add(new Sanonta("Forrest Gump","My mama always said life was like a box of chocolates. You never know what you're gonna get."));
        model.addAttribute("sanonnat", sanonnat.lista);
        return "sanonnat";
    }

    @RequestMapping("/lomake")
    public String naytaLomake (Model model) {
        model.addAttribute("lomake", new Sanonta());
        return "lomake";

    }

    @PostMapping("/sanonnat")
    public String postaa(Sanonta sanonta, Model model ) {
        sanonnat.lista.add(sanonta );
        model.addAttribute("sanonnat", sanonnat.lista);
        return "sanonnat";
    }


}
