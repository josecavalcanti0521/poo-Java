package polimorfismo;

public class FiguraPlana {
    double area() {
        return 0;
    }

    double perimetro() {
        return 0;
    }

    void mostrarDados() {
        System.out.println("Nome do Objeto = " + this.toString ());
        System.out.println ("Area = " + this.area());
        System.out.println ("Perimetro = " + this.perimetro());
    }
}
