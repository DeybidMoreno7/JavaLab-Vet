public class Conejo extends Animal {
    @Override
    public double calcularCostoConsulta() {
        return 35000.0;
    }

    public Conejo(String nombre, int edad, String nombreDueno) {
        super(nombre, edad, nombreDueno);
    }
}
