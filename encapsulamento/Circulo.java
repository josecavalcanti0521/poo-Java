package encapsulamento;

public class Circulo {
    private int raio;

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public int getRaio() {
        return this.raio;
    } 

    public float area() {
        return (float) (3.14 * (this.raio * this.raio));
    }
}
