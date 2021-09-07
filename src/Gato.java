public class Gato extends Mamiferos {

    private String Color;
    public Gato (String c, String sexo, int edad){
        super(sexo, edad);
        this.Color = c;
    }

    public String talk(){
        return "Miau";
    }

}
