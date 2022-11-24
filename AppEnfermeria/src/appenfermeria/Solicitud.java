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
public class Solicitud {

    private int id;
    private int nroPacientes;

    // Constructor donde por medio de parametros inicializamos los valores.
    public Solicitud(int id, int nroPacientes) {
        this.id = id;
        this.nroPacientes = nroPacientes;
    }

    // Lógica de las Necesidades Básicas de Virginia Henderson
    public void pacientesNecesidades(int consultas) {
        this.nroPacientes = this.nroPacientes - consultas;
        System.out.println("[COMANDO NECESIDADES] Solicitud: " + id
                + "\n Pacientes: " + this.nroPacientes);
    }

    // Lógica de Patrones funcionales de Marjory Gordon
    public void pacientesPatrones(int consultas) {
        this.nroPacientes = this.nroPacientes - consultas;
        System.out.println("[COMANDO PATRONES] Solicitud: " + id
                + "\n Pacientes: " + this.nroPacientes);
    }

    // Lógica de Dominios NANDA
    public void pacientesDominios(int consultas) {
        this.nroPacientes = this.nroPacientes - consultas;
        System.out.println("[COMANDO DOMINIOS] Solicitud: " + id
                + "\n Pacientes: " + this.nroPacientes);
    }
}
