public class Perro extends Mamiferos{
    String color;

    public Perro(String color, int edad, String sexo){
        super(sexo, edad);
        this.color = color;
    }
    public String hablar(){
        return  "guau";
    }
}
