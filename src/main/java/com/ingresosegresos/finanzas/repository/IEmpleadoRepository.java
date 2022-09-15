package com.ingresosegresos.finanzas.repository;


import com.ingresosegresos.finanzas.entities.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface IEmpleadoRepository extends JpaRepository<Empleado,Integer> {

@Query("SELECT u FROM Empleado u WHERE u.correoEmpleado=?1")
    ArrayList<Empleado>existeCorreo(String correoEmpleado);
}
