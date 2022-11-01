package figurasGeometricas;

import interfaces.FiguraGeometrica;

public class Retangulo implements FiguraGeometrica {

    private double base, altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }    

    @Override
    public String desenharFigura() {
        return "Desenhando um Retangulo";
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return (2 * base) + (2 * altura);
    }

    @Override
    public String exibirInfos() {
        return "Informações do Retangulo: \n\nTamanho do Retangulo: "+ "Base -> " + base + " | " + "altura -> " + altura
        +"\nArea total do Retangulo: " + calcularArea() + "\nPerimetro do Retangulo: " + calcularPerimetro();
    }
    
}
