import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Perro p1 = new Perro("Annie", 8,"Yuri","Cooker Spanish");
        Gato g1 = new Gato("Zeus",5,"Tatiana",true);
        Ave a1 = new Ave("Roberto", 3,"Manuel",20.0);
        Conejo c1 = new Conejo("Colivio",10,"Sara");

        //practicando ArrayList
        List<Animal> listaAnimales = new ArrayList<>();

        listaAnimales.add(p1);
        listaAnimales.add(g1);
        listaAnimales.add(a1);
        listaAnimales.add(c1);
        System.out.println("Prueba 1");
        for (Animal animal : listaAnimales ){
            System.out.println(animal.toString());
        }

        p1.registrarVacuna("Parvovirosis");
        p1.registrarVacuna("Moquillo");
        g1.registrarVacuna("Triple Felina");

        System.out.println("\nPrueba 2");
        System.out.println("Vacunas aplicadas a " +p1.nombre+ ": "+p1.getVacunasAplicadas());
        System.out.println("Vacunas aplicadas a " +g1.nombre+ ": "+g1.getVacunasAplicadas());

        System.out.println("\nPrueba 3");
        Clinica patitasFelices = new Clinica("Patitas Felices", "Kra 24 # 4-55 sur");
        List<Asegurable> listaAsegurados = new ArrayList<>();
        listaAsegurados.add(p1);
        listaAsegurados.add(g1);
        listaAsegurados.add(patitasFelices);

        for (Asegurable asegurado : listaAsegurados){
            System.out.println("No. Poliza: "+asegurado.obtenerNumeroPoliza() +
                    " - Prima Anual"+asegurado.calcularPrimaSeguro());
        }




    }
}