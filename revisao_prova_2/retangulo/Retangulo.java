package revisao_prova_2.retangulo;

public class Retangulo {
    int codigo;
    int base;
    int altura;

    int area() {
        return base * altura;
    }

    int perimetro() {
        return (2 * (base + altura));
    }
}
