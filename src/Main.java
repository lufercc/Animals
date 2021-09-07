public class Main {
    public static void main(String arg[]){
        Gato oliver = new Gato("Amarillo","macho" , 2);
        System.out.println(oliver.hablar());

        Perro dogy = new Perro("Amarillo", 2, "hembra");
        System.out.println(dogy.hablar());

        Vet animalVet = new Vet("Animal Vet");
//        String result = animalVet.atenderAnimal(oliver);
//        System.out.println(result);
        animalVet.registrarPaciente(dogy);
        animalVet.registrarPaciente(oliver);

        animalVet.printPacientes();
    }
}
