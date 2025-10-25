package polimorfismo;

public class Circulo extends FiguraPlana{
    private float raio;

    Circulo(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    float diametro() {
        return raio * 2f;
    }

    double area() {
        return Math.PI * Math.pow(raio, 2);
    }

    double perimetro() {
        return this.comprimento();
    }

    double comprimento() {
        return 2 * Math.PI * this.raio;
    }

    double area(float comprimento) {
        float raio;
        raio = comprimento / 2;
        return (Math.pow(raio, 2));
    }

    void mostrarDados() {
        System.out.println("Informacoes do " + "circulo de raio" + this.raio);
        super.mostrarDados();
        System.out.println("Diametro = " + this.diametro());
    }
}
