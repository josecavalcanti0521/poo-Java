package revisao_prova_2_1.quadrado_cubo;

public abstract class Quadrado {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public Quadrado() {
        this.lado = 0;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return this.lado;
    }

    public double area() {
        return Math.pow(lado, 2);
    }

    public double perimetro() {
        return this.lado * 4;
    }

    public void mostrarDados() {
        System.out.println("Lado: " + this.lado);
        System.out.println("Área: " + this.area());
        System.out.println("Perímetro: " + this.perimetro());
    }
}
