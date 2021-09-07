public class Perro extends Mamiferos {
    String Color;

    public Perro (String color, int edad, String sexo){
        super(sexo, edad);
        this.Color = color;
    }

    public String talk(){
        return "Guau";
    }
}
