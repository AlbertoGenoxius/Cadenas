import java.util.Scanner;
public class Cadena {
    public static void main(String[] args){
        Scanner UWU = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        String nombre = UWU.nextLine();
        System.out.println("Escribe tus Apellidos: ");
        String apellido = UWU.nextLine();

        System.out.println("Tu nombre es: "+ nombre+ " " + apellido);
    }
}