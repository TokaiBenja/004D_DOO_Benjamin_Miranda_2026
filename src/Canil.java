public class Canil {

    public static void main(String[] args) {
        System.out.println("**** Bienvenido al Canil****");

        Perro perro_del_profe = new Perro();
        Perro perro_de_benja = new Perro();

        perro_del_profe.nombre = "Gimili";
        perro_del_profe.edad = 6;
        perro_del_profe.peso = 40;
        perro_del_profe.tiene_vacuna = false;


        perro_de_benja.nombre = "Joy";
        perro_de_benja.edad = 17;
        perro_de_benja.peso = 34.5;
        perro_de_benja.tiene_vacuna = false;

        if (perro_de_benja.edad > 2){
            System.out.println("El perro de benja tiene más de 2 años");
        

        }

        else {
            System.out.println("El perro no tiene más de dos años");
        }
        
        if (perro_de_benja.peso > 20) {
        System.out.println("El perro pesa más de 20kg, cuidado con su peso!");
    }
        else {
            System.out.println("El perro pesa menos de 20kg, buen peso.");
        }

        System.out.println("Gracias por su visita, lo quiero mucho <3");

}
}