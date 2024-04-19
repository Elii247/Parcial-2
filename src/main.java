import java.util.Scanner;
import utils.Verificacion;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre, apellido, cedula, correo, respuesta;
        String contrase;
        boolean continuar = true;

        while (continuar) {
            ///Introduccion por teclado//
            System.out.println("Ingrese informacion de Usuario");
            System.out.println("\nIngrse su nombre: ");
            nombre = scanner.next();
            if (!Verificacion.validarNombre(nombre)) {
                System.out.println("Nombre invalido. debe tener letras y espacios");
                scanner.nextLine();
            }

            System.out.println("\nIngese su apellido: ");
            apellido = scanner.next();
            if (!Verificacion.validarApellido(apellido)) {
                System.out.println("Apellido invalido.solo debe tener letras y espacios");
                scanner.nextLine();
            }

            System.out.println("\nIngrese su cedula: ");
            cedula = scanner.next();
            if (!Verificacion.validarCedula(cedula)) {
                System.out.println("Cedula invalida. Solo debe tener numeros,Giones o una letra al empezar(en caso de ser extranjero)\t" + cedula);
                scanner.nextLine();
            }
            System.out.println("\nCorreo electronico: ");
            correo = scanner.next();
            if (!Verificacion.validarCorreo(correo)) {
                System.out.println("Correo electronico invalido");
                scanner.nextLine();
            }

            System.out.println("\nContraseña");
            contrase = scanner.next();
            if (!Verificacion.validarContrasena(contrase)) {
                System.out.println("Contraseña incorrecta");
                scanner.nextLine();
            }

            Usuario infoUsuario = new Usuario(nombre, apellido, cedula, correo, contrase);
            ///ERROR AL FINAL DE LA PANTALLA
            if (infoUsuario.validar()) {
                System.out.println("Registro extoso. !Bienvenido, " + infoUsuario.getNombre());
            } else {
                System.out.println("Informacion no valida");
            }

            System.out.println("\nQuiere introducir mas informacion? (S/N)");
            respuesta = scanner.next();
            continuar = respuesta.equalsIgnoreCase("S");

        }


    }
}