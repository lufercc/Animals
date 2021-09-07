public abstract class Mamifero {
    private String sexo;
    private int edad;

    public Mamifero(String sexo, int edad){
        this.sexo = sexo;
        this.edad = edad;
    }

    public String talk(){
        return "Mamifero";
    }
}
