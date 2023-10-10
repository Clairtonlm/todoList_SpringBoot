package tech.clairtonlima.todoList.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/primeiraRota")
//http://localhost:8080/---aqui vai a rota---
public class MInhPrimeiraController {

    @GetMapping("/primeiroMetodo")
    public String primeiraMensagem(){
        return "Funcionou Java";
    }
}
