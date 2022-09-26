package Spring3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MovimientoDineroController {

    public

    @GetMapping("/MovimientoDineroList")
    public String MovimientoDineroList(){

        return "Lista de Movimientos de Dinero";
    }
}
