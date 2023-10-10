package tech.clairtonlima.todoList.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("meuTeste")
public class UserController {

     @GetMapping("/Teste")
    public String mesagem(){
        return "Testando pra ver se seu sei porraaaaa";
    }
    
}
