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
public class AppEnfermeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciamos la solicitud con un id y un numero de clientes
        Solicitud solicitud = new Solicitud(1, 50);        

        // Creamos las operaciones correspondientes donde asociamos la
        // solicitud y las consultas
        Necesidades opNecesidades = new Necesidades(solicitud, 12);
        Patrones opPatrones = new Patrones(solicitud, 9);
        Dominios opDominios = new Dominios(solicitud, 12);

        // Instanciamos el ejecutor el cual va a recibir los comandos a ejecutar
        Ejecutor e = new Ejecutor();
        e.recibirOperacion(opNecesidades);
        e.recibirOperacion(opPatrones);
        e.recibirOperacion(opDominios);

        e.realizarOperacion();
    }
    
}
