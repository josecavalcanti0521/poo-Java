package revisao_prova_2_1.triangulo_prisma;

public abstract class Triangulo {
    private double lado;

    public Triangulo(double lado) {
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return this.lado;
    }

    public double altura() {
        return this.lado * Math.sqrt(3) / 2;
    }

    public double area() {
        return this.lado * altura() / 2;
    }

    public double perimetro() {
        return 3 * lado;
    }

    public void mostrarDados() {
        System.out.println("Lado: " + lado);
        System.out.println("Area: " + area());
        System.out.println("Perimetro: " + perimetro());
    }
}
