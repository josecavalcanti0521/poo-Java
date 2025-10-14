package heranca.Retangulo;

public class Retangulo {
    protected float ladoa;
    private float ladob;

    Retangulo(float ladoa, float ladob) {
        this.ladoa = ladoa;
        this.ladob = ladob;
    }

    public float getLadoA() {
        return this.ladoa;
    }

    public void setLadoA(float ladoa) {
        this.ladoa = ladoa;
    }

    public float getLadoB() {
        return this.ladob;
    }

    public void setLadoB(float ladob) {
        this.ladob = ladob;
    }

    double area() {
        return this.ladoa * this.ladob;
    }

    double perimetro() {
        return 2 * (this.ladoa + this.ladob);
    }

    void mostrarDados() {
        System.out.println("Retangulo com lados " + this.ladoa + " e " + this.ladob + "\nArea = " + this.area () + "\nperimetro = " + this.perimetro ());
    }
}
