import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        mostrarMenu();

    }


    static void mostrarMenu(){

        String opcion_elegida;
        Scanner scanner = new Scanner(System.in);
        boolean iniciar_menu = true;
        Personaje personaje_jugador = new Personaje();
        Hacker amaro = new Hacker();
        Gamedev mati = new Gamedev();
        Boliviano morales = new Boliviano();
        String clase = "ninguna";



        System.out.println("Bienvenido al mundo de WESTEROS!");

        while (iniciar_menu) {        
        System.out.println("1. Crear personaje");
        System.out.println("2. Ver personaje");
        System.out.println("3. Salir");
        System.out.print("Por favor, ingrese una opción: ");

        opcion_elegida = scanner.nextLine();

        System.out.println("La opción elegida por el usuario es: " + opcion_elegida);

        


        switch (opcion_elegida) {
            case "1":
                System.out.println("Creación de personaje seleccionada");

                System.out.println("Ingresa el tipo de heróe que quieres usar:");
                boolean advincula = true;
                String opcion_usuario;
                while (advincula){
                    
                System.out.println("=== Selecciona tu tipo de personaje ===");
                System.out.println("Los personajes disponibles son: Hacker/Gamedev/Boliviano");
                System.out.print("Ingresa la clase deseada: ");


                opcion_usuario = scanner.nextLine();
                switch (opcion_usuario){
                    case "hacker", "gamedev", "boliviano":
                        clase = opcion_usuario;
                        advincula = false;
                        break;

                    default:
                        System.out.println("Ingresa una de las 3 clases disponibles.");
                        break;
                }
        
                

                
                }

        

                System.out.print("Ingresa el nombre de tu heroe: ");
                
                personaje_jugador.validarNombre(scanner.nextLine());

                
                System.out.println("Ingresa el apellido de tú héroe: ");
                personaje_jugador.apellido = scanner.nextLine();

                

                System.out.println("Indique la vida del héroe: ");
                //Este metodo es inseguro, se hará de otra forma.
                //personaje_jugador.vida = Integer.parseInt(scanner.nextLine()); 

                personaje_jugador.setear_vida(Integer.parseInt(scanner.nextLine()));

                System.out.println("Asignarle la edad al personaje: ");
                personaje_jugador.setear_edad(Integer.parseInt(scanner.nextLine()));


                System.out.println("Personaje creado exitosamente!");
                break;
                

                
                
               
                

            case "2":
                System.out.println("Has elegido ver tu personaje");
                System.out.println("Tu clase es " + clase);
                System.out.println("El nombre del personaje es " + personaje_jugador.obtener_nombre());
                System.out.println("El apellido del personaje es " + personaje_jugador.apellido);
                System.out.println("La vida del personaje es " + personaje_jugador.obtener_vida());
                System.out.println("La edad del personaje es "+ personaje_jugador.obtener_edad());
                
                break;

            case "3":
                System.out.println("Gracias por jugar <3");
                iniciar_menu = false;
                break;
        
            default:
                System.out.println("Ingrese una opción valida.");
                break;
        }
            
        }



}
}

