package revisao_prova_2_1.quadrado_piramide;

public class Piramide extends Quadrado {
    private double altura;

    public Piramide(double lado, double altura) {
        super(lado);
        this.altura = altura;
    }

    public Piramide() {
        super();
        this.altura = 0;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public double perimetro() {
        return 0;
    }

    public double alturaLado() {
        return Math.sqrt(Math.pow(super.getLado() / 2, 2) + Math.pow(altura, 2));
    }

    public double areaLateral() {
        return (4 * ((getLado() * alturaLado()) / 2));
    }

    public double area() {
        return super.area() + areaLateral();
    }

    public double volume() {
        return super.area()* altura / 3;
    }

    public void mostrarDados() {
        System.out.println("Lado: " + getLado());
        System.out.println("Perimetro da base: " + super.perimetro());
        System.out.println("Altura do lado: " + this.alturaLado());
        System.out.println("Área lateral: " + this.areaLateral());
        System.out.println("Área: " + this.area());
        System.out.println("Volume: " + this.volume());
    }
}
