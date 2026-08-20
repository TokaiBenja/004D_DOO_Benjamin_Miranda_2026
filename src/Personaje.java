public class Personaje {

    String nombre;
    String apellido;
    private int vida;
    private int edad;
    boolean esta_vivo = true;



    public void setear_vida(int vida){

        if (vida < 0){

            this.vida = 0;
        }
        else {
            this.vida = vida;
        }


    }

    public int obtener_vida(){
        return this.vida;

    };
    
    public void setear_edad(int edad){

        if (edad <= 0){
            System.out.println("Ingresa una edad valida mayor a 0");
            this.edad = 0;
        }
        else {
            this.edad = edad;
        }


    }

    public int obtener_edad(){
        return this.edad;

    };


}
