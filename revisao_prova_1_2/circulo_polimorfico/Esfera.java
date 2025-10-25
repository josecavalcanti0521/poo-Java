package revisao_prova_1_2.circulo_polimorfico;

public class Esfera extends Circulo {
    public Esfera() {}

    public Esfera(float raio) {
        super(raio);
    }

    public float diametro() {
        return 0;
    }

    public float perimetro() {
        return 0;
    }

    public float area() {
        return 4 * super.area();
    }

    public float volume() {
        return (float) (4/3 * Math.PI * Math.pow(super.getRaio(), 2));
    }

    void mostrarDados() {
        System.out.println("Raio: " + this.getRaio());
        System.out.println("Área: " + this.area());
        System.out.println("Volume: " + this.volume());
    }
}
