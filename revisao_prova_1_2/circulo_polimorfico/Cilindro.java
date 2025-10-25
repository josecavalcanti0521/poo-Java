package revisao_prova_1_2.circulo_polimorfico;

public class Cilindro extends Circulo {
    private float altura;

    Cilindro() {
        this.altura = 0;
    }

    Cilindro(float raio, float altura) {
        super(raio);
        this.altura = altura;
    }

    void setAltura(float altura) {
        this.altura = altura;
    }

    public float diametro() {
        return 0;
    }

    public float perimetro() {
        return 0;
    }

    float areaLateral() {
        return super.area() * altura;
    }

    public float area() {
        return 2 * super.area() + this.areaLateral();
    }

    public float volume() {
        return super.area() * this.altura;
    }

    public void mostrarDados() {
        System.out.println("Raio: " + this.getRaio());
        System.out.println("Altura: " + this.altura);
        System.out.println("Area da base: " + super.area());
        System.out.println("Perimetro da base: " + super.perimetro());
        System.out.println("Area lateral: " + this.areaLateral());
        System.out.println("Area: " + this.area());
        System.out.println("Volume: " + this.volume());
    }
}
