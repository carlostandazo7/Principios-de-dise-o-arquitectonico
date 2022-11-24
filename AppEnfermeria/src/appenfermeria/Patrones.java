/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appenfermeria;

/**
 *
 * @author Usuario
 */
// Se implementa la interfaz de Operacion
public class Patrones implements Operacion {

    private Solicitud solicitud;
    private int consultas;

    // El constructor toma una solicitud y establece un número de consultas
    public Patrones(Solicitud solicitud, int consultas) {
        this.solicitud = solicitud;
        this.consultas = consultas;
    }

    // Llamamos al método propio de la variable solicitud
    @Override
    public void execute() {
        this.solicitud.pacientesPatrones(this.consultas);
    }
}
