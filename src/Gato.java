import java.util.ArrayList;
import java.util.List;

public class Gato extends Animal implements Vacunable, Asegurable{

    private boolean esEsterilizado;
    private List<String> vacunas = new ArrayList<>();

    public Gato(String nombre, int edad, String nombreDueno, boolean esEsterilizado) {
        super(nombre, edad, nombreDueno);
        this.esEsterilizado = esEsterilizado;
    }

    //implementacion de la interfaz que herada de Animal
    @Override
    public double calcularCostoConsulta() {
        return 38000.0;
    }

    @Override
    public void registrarVacuna(String nombre) {
        vacunas.add(nombre);
    }

    @Override
    public int getVacunasAplicadas() {
        return vacunas.size();
    }

    @Override
    public double calcularPrimaSeguro() {
        if(esEsterilizado){
            return 120000.0;
        }else{
            return 200000.0;
        }
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "Zeus-0005";
    }
}
