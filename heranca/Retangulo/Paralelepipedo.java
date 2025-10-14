package heranca.Retangulo;

public class Paralelepipedo extends Retangulo {
    private float ladoc;

    Paralelepipedo() {
        super(0,0 );
        this.ladoc = 0;
    }

    Paralelepipedo(float ladoa, float ladob, float ladoc) {
        super(ladoa, ladob);
        this.ladoc = ladoc;
    }

    public float getLadoC() {
        return this.ladoc;
    }

    public void setLadoC(float ladoc) {
        this.ladoc = ladoc;
    }

    double area() {
        return 2 * (this.ladoa * super.getLadoB() + this.ladoa * this.ladoc + super.getLadoB() * this.ladoc);
    }

    double perimetro() {
        return (0);
    }

    double volume() {
        return super.area() * this.ladoc;
    }

    void mostrarDados() {
        System.out.println("Paralelepipedo com base " + super.ladoa + " e altura " + this.ladoc + " \nArea = " + this.area() + "\nVolume = " + this.volume());
    }
}
