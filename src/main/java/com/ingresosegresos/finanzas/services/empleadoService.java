package com.ingresosegresos.finanzas.services;


import com.ingresosegresos.finanzas.entities.Empleado;
import com.ingresosegresos.finanzas.repository.IEmpleadoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service

public class empleadoService {
    private IEmpleadoRepository empleRepository;
    public empleadoService(IEmpleadoRepository emple){
        this.empleRepository=emple;

    }
    public ArrayList<Empleado> selectall(){

        return  (ArrayList<Empleado>) this.empleRepository.findAll();
    }

public Response createEmpleado(Empleado data){
        Response response=new Response();
        if(data.getCorreoEmpleado() == null ||data.getCorreoEmpleado().isBlank()){
            response.setCode(500);
            response.setMessage("Error su email no es valido");
            return response;
        }
        ArrayList<Empleado>existe=this.empleRepository.existeCorreo(data.getCorreoEmpleado());

        if(existe!=null && existe.size()>0){
            response.setCode(600);
            response.setMessage("Error el email ya esta en uso");
            return response;
        }
        this.empleRepository.save(data);
        response.setCode(200);
        response.setMessage("Empleado registrado exitosamente");
        return response;
}

    public Empleado selectById(int id) {
        Optional<Empleado> existe = this.empleRepository.findById(id);
        if (existe.isPresent()) {
            return existe.get();
        } else {
            return null;

        }
    }

    public Response deleteEmpleById(int id){
        Response response= new Response();
        try {

            this.empleRepository.deleteById(id);
            response.setCode(200);
            response.setMessage("Usuario eliminado exitosamente");
            return response;
        }
        catch (Exception ex)  {
            response.setCode(500);
            response.setMessage("Error"+ex.getMessage());
            return response;
        }


    }

    public Response updateEmpleado(Empleado data) {
        Response response = new Response();
        if (data.getId() == 0) {
            response.setCode(500);
            response.setMessage("Error el id del usuario no es valido");
            return response;
        }
        Empleado exists = selectById(data.getId());
        if (exists == null) {
            response.setCode(500);
            response.setMessage("Error el usuario no existe en la base de datos");
            return response;
        }

        exists.setCorreoEmpleado(data.getCorreoEmpleado());
        this.empleRepository.save(exists);
        response.setCode(200);
        response.setMessage("Usuario modificado exitosamente");

        return  response;
    }


    public Response updateEmpleName(Empleado data) {
        Response response = new Response();
        if (data.getId() == 0) {
            response.setCode(500);
            response.setMessage("Error el id del usuario no es valido");
            return response;
        }

        //validamos si el usuario que desea actualizar existe
        Empleado exists = selectById(data.getId());
        if (exists == null) {
            response.setCode(500);
            response.setMessage("Error el usuario no existe en la base de datos");
            return response;
        }
        exists.setNombreEmpleado(data.getNombreEmpleado());
        this.empleRepository.save(exists);
        response.setCode(200);
        response.setMessage("Usuario modificado exitosamente");

        return  response;
    }






}
