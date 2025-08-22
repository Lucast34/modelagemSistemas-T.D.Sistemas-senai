package br.com.edukacode.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/lead")
public class LeadController {

    @PostMapping
    public void criarLead(@RequestBody DadosCadastroLead dados){

    }

    @GetMapping
    public void listarLeads(){

    }

    @PutMapping
    public void atualizarLead(){

    }

    @DeleteMapping
    public void excluirLead(){

    }

    
}
