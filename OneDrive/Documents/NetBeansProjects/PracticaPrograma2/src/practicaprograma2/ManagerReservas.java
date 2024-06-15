/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaprograma2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author dagui
 */
public class ManagerReservas {
    private static final Object lock = new Object();

    public static void main(String[] args) {
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
    }

    private static void agregarUsuario(Usuario usuario) {
        synchronized (lock) {
            try (PrintWriter writer = new PrintWriter(new FileWriter("usuarios.txt", true))) {
                writer.println(usuario.cedula + "," + usuario.nombre + "," + usuario.telefono);
            } catch (IOException e) {
            }
        }
    }

    private static void agregarReserva(Reserva reserva) {
        synchronized (lock) {
            try (PrintWriter writer = new PrintWriter(new FileWriter("reservas.txt", true))) {
                writer.println(reserva.cedula);
                writer.println("Fecha de comida: " + reserva.fecha);
                writer.println("Tipo de comida: " + reserva.tipoComida);
                writer.println("Guarnicion 1: " + reserva.guarnicion1);
                writer.println("Guarnicion 2: " + reserva.guarnicion2);
                writer.println("Proteína: " + reserva.proteina);
                writer.println("Ensalada: " + reserva.ensalada);
                writer.println();
            } catch (IOException e) {
            }
        }
    }

    public static void agregarUsuariosConcurrentemente(Usuario[] usuarios) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (Usuario usuario : usuarios) {
            executorService.execute(() -> agregarUsuario(usuario));
        }
        executorService.shutdown();
    }

    public static void agregarReservasConcurrentemente(Reserva[] reservas) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (Reserva reserva : reservas) {
            executorService.execute(() -> agregarReserva(reserva));
        }
        executorService.shutdown();
    }
}