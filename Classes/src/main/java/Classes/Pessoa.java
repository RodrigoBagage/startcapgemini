package Classes;

public class Pessoa {

    //Atributos
    private float peso;
    private float altura;
        
    // Met�do construtor
    public Pessoa(float peso, float altura){
      this.peso = peso;
      this.altura = altura;
    }

    public float calcularIMC() {
        float imc = peso / (altura * altura);
        return imc;
    }

    //M�todos acessores
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }
}
