package revisao_prova_2_1.triangulo_prisma;

public class PrismaTriangular extends Triangulo{
    private double altura;
    private double apotema;

    public PrismaTriangular(double lado, double altura, double apotema) {
        super(lado);
        this.altura = altura;
        this.apotema = apotema;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getApotema() {
        return this.apotema;
    }

    public double areaLateral() {
        return (super.perimetro() / 2) * apotema;
    }

    public double area() {
        return super.area() + this.areaLateral();
    }

    public double perimetro() {
        return 0;
    }

    public double volume() {
        return (1/3) * super.area() * altura;
    }

    public void mostrarDados() {
        System.out.println("Lado: " + getLado());
        System.out.println("Altura: " + altura);
        System.out.println("Apotema: " + apotema);
        System.out.println("Perimetro da base: " + super.perimetro());
        System.out.println("Area da base: " + super.area());
        System.out.println("Area lateral: " + areaLateral());
        System.out.println("Area: " + area());
        System.out.println("Volume: " + this.volume());
    }
}
