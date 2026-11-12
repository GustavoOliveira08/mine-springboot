package com.dt2.mine.controller;

import com.dt2.mine.entities.Jogo;
import com.dt2.mine.repositories.JogoRepository;
import org.springframework.web.bind.annotation.*;
//--------------------------------------------------------------//
import java.util.List;

@RestController
@RequestMapping("api/jogos")
public class JogoController {
    private final JogoRepository repository;
    public JogoController(JogoRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<Jogo> mostrar(){
        return repository.findAll();
    }

    @PostMapping
    public String criar(@RequestBody Jogo jogo){
        try{
            repository.save(jogo);
            return "Carequinha tem o molho" + jogo;
        }
        catch (Exception e){
            return "deu ruim bb, rebola lentinho";
        }
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable int id){
        repository.deleteById(id);
        return "Senta e chora na tora bb!";
    }
}
