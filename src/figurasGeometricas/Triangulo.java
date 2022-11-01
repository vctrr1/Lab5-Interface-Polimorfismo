package figurasGeometricas;

import java.util.HashSet;
import java.util.Set;

import interfaces.FiguraGeometrica;
import tiposTriangulos.*;

public class Triangulo implements FiguraGeometrica {

    private double lado1, lado2, lado3;
    private TrianguloEnum tipo;

    public Triangulo(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;

        if(todosLadosZeros() || ladosImpossiveis() || violaRegrasDoTriangulo()){
            throw new Error("Não é Triangulo");
        }else{
            descobrirTipo();
        }
    }

    
    @Override
    public String desenharFigura() {
        return "Desenhando um Triangulo " + tipo;
    }
    
    @Override
    public double calcularArea() {
        double g = (lado1 * lado2) / 2;
        return g;
    }
    
    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public String exibirInfos() {
        return "\nInformações do Triangulo: \n\nPerimetro do Triangulo: "+ calcularPerimetro()
        +"\nArea total do Triangulo: " + calcularArea() + "\nTipo de Triangulo: " + tipo;
    }

    private boolean todosLadosZeros() { 
        return lado1 == 0 && lado2 == 0 && lado3 == 0; 
    }

    private boolean ladosImpossiveis() { 
        return lado1 < 0 || lado2 < 0 || lado3 < 0; 
    } 

    private boolean violaRegrasDoTriangulo() { 
        return lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1;
    }

    
    public void descobrirTipo() { 
        int lados = descobrirLados();
        
        if (lados == 1) { 
            tipo = TrianguloEnum.EQUILATERO;
        } else if (lados == 2) {
            tipo = TrianguloEnum.ISOCELES;
        }else{
            tipo = TrianguloEnum.RETANGULO;
        };
    } 
    
    public int descobrirLados() { 
        Set<Double> lados = new HashSet<>(); 
 
        lados.add(lado1); 
        lados.add(lado2); 
        lados.add(lado3); 
 
        return lados.size(); 
    }
}
