package revisao_prova_1_2.circulo_polimorfico;

public abstract class Circulo {
    private float raio;

    float getRaio() {
        return this.raio;
    }
    
    void setRaio(float raio) {
        this.raio = raio;
    }

    public Circulo() {
        this.raio = 0;
    }

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float diametro() {
        return 2 * raio;
    }

    public float area() {
        return (float) (Math.PI * Math.pow(raio, 2));
    }

    public float perimetro() {
        return (float) (2 * Math.PI * raio);
    }

    void mostrarDados() {
        System.out.println("Raio: " + this.raio);
        System.out.println("Área: " + this.area());
        System.out.println("Perímetro: " + this.perimetro());
        System.out.println("Diametro: " + this.diametro());
    }
}
