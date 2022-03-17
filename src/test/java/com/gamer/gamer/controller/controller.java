
package com.gamer.gamer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@controles
@SIf4j
public class controller {
    
    @Autowired
    private Gamerdao Gamerdao;
    private Object GamerService;
    
    
    
    
    @Getmapping("/")
    public String inicio("se muestra la pagina del index del temp") {
        
     
    log.info("se muestra la pagina");
    
    var gamer = Gamerdao.findall();
           model.addAtribute("Gamer",gamer)
            return "index";
}

 @GetMapping("/nuevocliente")
     public String nuevocliente (Gamer gamer) {
     return "modificarcliente";
     }
     
     @PostMapping("/guardarCliente")
     public String guardarCliente(Gamer gamer) {
    GamerService.save(gamer);
     return "redirect:/";
     }
     
     @GetMapping("/modificarCliente/{idCliente}")
     public String modificarCliente(Gamer gamer, Model model) {
     gamer = GamerService.getCliente(gamer);
     model.addAtribute("cliente",gamer);
     return "modificarGamer";
     }
     
     @GetMapping("/eliminarCliente/{idCliente}")
     public String eliminarCliente(Gamer gamer, Model model) {
     gamer= GamerService.getGamer(gamer);
     model.addAtribute("cliente",gamer);
     return "redirect:/";
     
     }
}
