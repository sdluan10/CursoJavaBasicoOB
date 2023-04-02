public class Main {
    public static void main(String[] args) {
        persona persona = new persona();

        persona.setEdad(25);
        int edad = persona.getEdad();

        persona.setNombre("luis");
        String nombre = persona.getNombre();

        persona.setCelular(312325092);
        int celular = persona.getCelular();

        System.out.println(edad);
        System.out.println(nombre);
        System.out.println(celular);
    }
}

class persona {
    private int edad;
    private String nombre;
    private int celular;

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;

    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setCelular(int celular){
        this.celular = celular;
    }

    public int getCelular(){
        return this.celular;
    }

}