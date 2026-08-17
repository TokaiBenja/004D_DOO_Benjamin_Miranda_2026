public class Personaje {

    String nombre;
    String apellido;
    private int vida;
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
    
}
