import java.util.ArrayList;

public class Vet {
    private String name;
    private ArrayList pacientes;
    private Mamiferos paciente;

    public Vet(String name){
        this.name = name;
        pacientes = new ArrayList<Mamiferos>();

    }
    public void registrarPaciente(Mamiferos paciente){

        pacientes.add(paciente);
        System.out.println(pacientes.size());
    }
    public String atenderAnimal(Mamiferos paciente){
        this.paciente = paciente;
        return paciente.hablar() + "vet";
    }
    public void printPacientes(){
        for (Object m : pacientes) {
            Mamiferos sa = (Mamiferos) m;
            System.out.println(sa.hablar());
        }
    }
}
