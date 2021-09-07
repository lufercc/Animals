public class Main {
    public static void main(String arg[]){
        Gato olver = new Gato("Amarillo", "macho", 2);
        System.out.println(olver.talk());

        Dog dogui = new Dog("Amarillo",2, "macho");
        System.out.println(dogui.talk());

        Vet animalVet = new Vet("doodle");
//        String resultVet = animalVet.atenderAnimal(dogui);
//        System.out.println(resultVet);

        animalVet.registrarPaciente(olver);
        animalVet.registrarPaciente(dogui);
        animalVet.registrarPaciente(olver);
        animalVet.registrarPaciente(olver);
        animalVet.registrarPaciente(olver);

        animalVet.printPacientes();
    }
}
