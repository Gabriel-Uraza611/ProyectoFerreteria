import java.util.Scanner;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        Lines milienzo = new Lines();
        IrregularPolig milienzo2 = new IrregularPolig();
        Multicolor milienzo3 = new Multicolor();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cualquier tecla para salir");
        scanner.next();
        System.exit(0);
    }

}
