package mostrardatos; 
import java.util.Scanner; 

public class Mostrandodatos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce tu apellido: ");
        String apellido = scanner.nextLine();

        System.out.println("Nombre completo: " + nombre + " " + apellido);

        scanner.close();
    }
}

