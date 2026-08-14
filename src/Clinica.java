public class Clinica implements Asegurable{

    private String nombre;
    private String direccion;

    public Clinica(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public double calcularPrimaSeguro() {
        return 0;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-CLINICA-["+nombre+"]";
    }
}
