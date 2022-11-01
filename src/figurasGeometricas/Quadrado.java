package figurasGeometricas;

import interfaces.FiguraGeometrica;

public class Quadrado implements FiguraGeometrica{

    private int lado;

    public Quadrado(int lado){
        this.lado = lado;
    }

    @Override
    public String desenharFigura() {
        return "Desenhando Quadrado de Lado " + lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4*lado;
    }

    @Override
    public String exibirInfos() {
        return "Informações do QUADRADO: \n\nTamanho do Lado: "+ lado
        +"\nArea total do Quadrado: " + calcularArea() + "\nPerimetro do Quadrado: " + calcularPerimetro();
    }

    
    
}
