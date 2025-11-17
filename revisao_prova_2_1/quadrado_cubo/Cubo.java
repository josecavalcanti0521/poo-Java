package revisao_prova_2_1.quadrado_cubo;

public class Cubo extends Quadrado{
    public Cubo(double lado) {
        super(lado);
    }

    public Cubo() {
        super();
    }

    public double perimetro() {
        return 0;
    }

    public double area() {
        return super.area() * 6;
    }

    public double volume() {
        return super.area() * this.getLado();
    }

    public void mostrarDados () {
        System.out.println("Lado: " + this.getLado());
        System.out.println("Área: " + this.area());
        System.out.println("Volume: " + this.volume());

    }
}
