package retangulo;

public class Retangulo {
    int base;
    int altura;

    public void mostrarDados() {
        System.out.println("Area = " + this.area());
        System.out.println("Perimetro = " + this.perimetro());
    }

    int area() {
        return (this.base * this.altura);
    }

    int perimetro() {
        return (2 * ( this.base + this.altura));
    }
}
