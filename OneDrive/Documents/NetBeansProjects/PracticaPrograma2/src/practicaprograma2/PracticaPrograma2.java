 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaprograma2;

import static practicaprograma2.ManagerReservas.agregarReservasConcurrentemente;
import static practicaprograma2.ManagerReservas.agregarUsuariosConcurrentemente;

/**
 *
 * @author dagui
 */
public class PracticaPrograma2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Usuario[] usuarios = {
            new Usuario("11568942", "Usuario1", "123456789"),
            new Usuario("31568942", "Usuario2", "987654321")
    };

    Reserva[] reservas = {
            new Reserva("11568942", "25/02/2024", "Desayuno", "Arroz", "Frijoles", "Pollo", "Verde"),
            new Reserva("31568942", "26/02/2024", "Almuerzo", "Frijoles", "Frutas", "Huevos", "Rusa")
    };

    agregarUsuariosConcurrentemente(usuarios);
    agregarReservasConcurrentemente(reservas);

    System.out.println("Usuarios y reservas agregados exitosamente.");
}
}