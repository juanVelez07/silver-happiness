//


public class persona {
    String nombre;
    int edad;
    //construcutor
    persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre + ", Edad");
    }
    public static void main(String[] args) {
        Persona p = new Persona(nombre: "Juan")
    }
}
