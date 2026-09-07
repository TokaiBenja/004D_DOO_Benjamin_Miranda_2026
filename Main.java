
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean mostrarMenu = true;
        ArrayList<String> autores = new ArrayList<>();

        while (mostrarMenu) {
            System.err.println("=== Menú de Instagram ===");
            System.err.println("1. Añadir autor");
            System.err.println("2. Ver autores");
            System.err.println("3. Salir");

            System.err.print("Ingrese su elección: ");
            String opcion_elegida = scan.nextLine();

            switch (opcion_elegida) {
                case "1":
                    agregarAutor(scan, autores);
                    break;
                case "2":
                    for (String autor : autores)
                        System.out.println("El autor se llama: " + autor);
                    break;

                case "3":
                    System.err.println("Gracias por usar el servicio!");
                    mostrarMenu = false;
            
                default:
                    break;
            }}
            
        }

        static void agregarAutor(Scanner scan, ArrayList<String> autores){
            
            System.err.print("Ingresa el nombre del autor: ");
            String nombre_autor = scan.nextLine();
            if (autores.add(nombre_autor)){
                System.err.println("Se ha agregado exitosamente al autor");
            }
            else{
                System.out.println("No se ha podido ingresar");
            }
            }


        }
    

