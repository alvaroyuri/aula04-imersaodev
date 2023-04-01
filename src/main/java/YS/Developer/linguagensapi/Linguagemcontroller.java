package YS.Developer.linguagensapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Linguagemcontroller {

    
@Autowired
private LinguagemRepository repositorio;


    @GetMapping(value = "/linguagem")
    public List<Linguagem> obterLinguagens () {
        List<Linguagem> linguagens = repositorio.findAll();
        return linguagens;

    }

    @PostMapping(value = "/linguagem")
    public Linguagem cadastrarLinguagem (@RequestBody Linguagem linguagem) {
        Linguagem linguagemSalva = repositorio.save(linguagem);
        return linguagemSalva;
        
    }

}
