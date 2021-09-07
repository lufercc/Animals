public class Gato extends Mamiferos{
    private String color;

    public Gato(String color, String sexo, int edad){
        super(sexo, edad);
        this.color = color;

    }
    public String hablar(){
        return "miau";
    }

}
