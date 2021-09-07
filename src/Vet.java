import java.util.ArrayList;

public class Vet {
    private String name;
    private ArrayList pacientes;
    private Mamifero paciente;

    public Vet(String name){
        this.name = name;
        this.pacientes = new ArrayList<Mamifero>();
    }

    public void registrarPaciente(Mamifero paciente){
        pacientes.add(paciente);
        System.out.println(pacientes.size());
    }

    public String atenderAnimal(Mamifero paciente){
        this.paciente = paciente;
        return paciente.talk() + "vet";
    }

    public void printPacientes(){
        for (Object m : pacientes){
            Mamifero ma = (Mamifero) m;
            System.out.println(ma.talk());
        }
    }
}
