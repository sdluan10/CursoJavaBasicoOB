public class Main {
    public static void main(String[] args) {
        cliente cliente = new cliente();
        trabajador trabajador = new trabajador();

        trabajador.salario = 20000;



        cliente.edad = 28;
        cliente.nombre = "luis";
        cliente.telefono = 312325092;
        cliente.credito = 1000;


        System.out.println(cliente.edad);
        System.out.println(cliente.nombre);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);
        System.out.println(trabajador.salario);

    }
}

    class persona {
    int edad;
    String nombre;
    int telefono;
}

class cliente extends persona {
    float credito;
}

class trabajador extends persona {

    float salario;
}


