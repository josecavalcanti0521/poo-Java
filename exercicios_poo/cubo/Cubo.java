package cubo;

public class Cubo {
    int a;

    public void mostrarDados() {
        System.out.println("Area = " + this.area());
        System.out.println("Volume = " + this.volume());
    }

    int area() {
        return (int) (6 * Math.pow(this.a, 2));
    }

    int volume() {
        return (int) (Math.pow(this.a, 3));
    }
}
