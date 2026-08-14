public abstract class Animal implements Consulta {

    //
    protected String nombre;
    protected int edad;
    protected String nombreDueno;

    public Animal(String nombre, int edad, String nombreDueno) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDueno = nombreDueno;
    }

    @Override
    public String toString() {
        return  "\nNombre: " + nombre +
                "\nEdad: " + edad +
                "\nNombre Dueño: " + nombreDueno +
                "\nCosto consulta: " + calcularCostoConsulta();
    }
}
