/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appenfermeria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Ejecutor {
    
    // Apilamos las operaciones dentro de una lista
    private List<Operacion> operaciones = new ArrayList<>();

    // Agragamos la operación a la lista
    public void recibirOperacion(Operacion operacion) {
        this.operaciones.add(operacion);
    }

    // Ejecutamos la operación
    public void realizarOperacion() {
        this.operaciones.forEach(x -> x.execute()); // Por cada operación lo vamos a ejecutar
        this.operaciones.clear();
    }
}