/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1;

/**
 *
 * @author dagui
 */
import javax.swing.JOptionPane;
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de empleados de la empresa a calcular"));
        int salEmpleadosCaja = 0;
        for (int i = 0; i < numEmpleados; i++) {
            int salEmpleados = Integer.parseInt(JOptionPane.showInputDialog(" Digite los salarios de los empleados"));
            int salSEM = (int) (salEmpleados * 0.0925);
            int salIVM = (int) (salEmpleados * 0.0508);
            int salEmpleadosTotal = salSEM + salIVM;
            salEmpleadosCaja = salEmpleadosTotal + salEmpleadosTotal;
        }
        JOptionPane.showMessageDialog(null, "La empresa deberá abonar a la CCSS el monto de" + " " + salEmpleadosCaja + "  " + "por concepto de SEM y IVM");
    }
}
