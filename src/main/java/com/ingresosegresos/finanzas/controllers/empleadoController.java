package com.ingresosegresos.finanzas.controllers;


import com.ingresosegresos.finanzas.entities.Empleado;
import com.ingresosegresos.finanzas.services.Response;
import com.ingresosegresos.finanzas.services.empleadoService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/empleados")
public class empleadoController {
    private empleadoService empleadoserv;
    public  empleadoController(empleadoService emple){
        this.empleadoserv=emple;

    }

    @RequestMapping("getEmpleados")
    public ArrayList<Empleado>getempleados() {

        return this.empleadoserv.selectall();
    }

    @PostMapping("create")
    public Response createempleado(@RequestBody Empleado request) {
        return this.empleadoserv.createEmpleado(request);


    }

    @RequestMapping("getemple/{id}")
    public Empleado getEmpleado(@PathVariable int id) {

        return this.empleadoserv.selectById(id);
    }

    @DeleteMapping("deleteEmple/{id}")
    public Response deleteEmple(@PathVariable int id) {

        return this.empleadoserv.deleteEmpleById(id);
    }

//actualiza el Empleado por id
    @PutMapping("updateEmple")
    public Response updateEmple(@RequestBody Empleado request) {
        return this.empleadoserv.updateEmpleado(request);

    }




    }
