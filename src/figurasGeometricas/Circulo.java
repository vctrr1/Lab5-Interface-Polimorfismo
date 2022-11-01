package figurasGeometricas;

import interfaces.FiguraGeometrica;

public class Circulo implements FiguraGeometrica{

    private double raio;

    public Circulo(float raio){
        this.raio = raio;
    }

    @Override
    public String desenharFigura() {
        return "Desenhando Circulo de Raio: " + raio;
    }

    @Override
    public double calcularArea() {
        double x = Math.PI;
        double area = x * (Math.pow(raio, 2)); 
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double x = Math.PI;
        double perimet = (2 * x) * raio;
        return perimet;
    }

    @Override
    public String exibirInfos() {
        return "Informações do Circulo: \n\nTamanho do Raio: "+ raio
        +"\nArea total do Circulo: " + calcularArea() + "\nPerimetro do Circulo: " + calcularPerimetro();
    }
    
}
