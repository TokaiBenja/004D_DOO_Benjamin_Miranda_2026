

public class Personaje {
    private String clase;
    private String nombre;
    String apellido;
    private int vida;
    private int edad;
    boolean esta_vivo = true;

    //se comporta como un metodo seteador
    public void validarNombre(String nombre){
        nombre = nombre.toLowerCase().strip();
        this.nombre = nombre;
        switch (nombre){
            case "weon", "miguel", "nigga", "nigger":
            this.nombre = "******";
            break;

            case "":
            this.nombre = "ninguno, vuelva a ingresar el nombre.";
            break;
        }

        System.out.println("Me llego el nombre " + nombre);
    }

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

    public String obtener_nombre(){
        return this.nombre;
    }

    public void validarClase(String clase){
        clase = clase.toLowerCase().strip();
        this.clase = clase;
        switch (clase){
            case "hacker", "gamedev", "boliviano":
            this.clase = clase;
            
            break;

            case "":
            this.clase = "ninguno, vuelva a ingresar el nombre.";
            break;

            default:
                System.out.println("Ingresa una de las 3 clases existentes!");
        }

        


    }

        public String obtener_clase(){
        return this.clase;
        }
}

