public abstract class Mamiferos {
    private String sexo;
    private int edad;

    public Mamiferos(String sexo, int edad){
        this.sexo = sexo;
        this.edad = edad;
    }

    public String hablar(){
        return "Mamifero";
    }
}
