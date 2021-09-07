public class Main {
    public static void main(String arg[]){
        Gato oliver = new Gato("Amarillo", "macho", 2);
        System.out.println(oliver.talk());


        Perro rocky = new Perro("negro", 8, "macho");
        System.out.println(rocky.talk());

        Vet animalVet = new Vet( "sam");
       //String resultVet = animalVet.atenderAnimal(rocky);
        //System.out.println(resultVet);

        animalVet.registrarPaciente(rocky);
        animalVet.registrarPaciente(oliver);
        animalVet.registrarPaciente(oliver);

        animalVet.printPacientes();

    }




}
