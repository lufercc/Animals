public class Dog extends Mamifero {
    String color;

    public Dog (String color, int edad, String sexo){
        super(sexo, edad);
        this.color = color;
    }

    public String talk(){
        return "Guau";
    }
}
