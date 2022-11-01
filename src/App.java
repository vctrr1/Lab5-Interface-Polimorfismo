import figurasGeometricas.*;

public class App {
    public static void main(String[] args) throws Exception {
        Quadrado q = new Quadrado(5);
        Circulo c = new Circulo(4);
        Retangulo r = new Retangulo(4, 3);
        Triangulo t1 = new Triangulo(3, 3, 3);
        Triangulo t2 = new Triangulo(3, 3, 4);
        Triangulo t3 = new Triangulo(3, 5, 4);
        

        System.out.println("\n-----------------------Ciculo----------------------\n");
        System.out.println(c.desenharFigura());
        System.out.println(c.exibirInfos());

        System.out.println("\n----------------------Quadrado---------------------\n");
        System.out.println(q.desenharFigura());
        System.out.println(q.exibirInfos());

        System.out.println("\n----------------------Retangulo---------------------\n");
        System.out.println(r.desenharFigura());
        System.err.println(r.exibirInfos());

        System.out.println("\n----------------------Triangulo---------------------\n");
        System.out.println(t1.desenharFigura());
        System.out.println(t1.exibirInfos());
        System.out.println(t2.exibirInfos());
        System.out.println(t3.exibirInfos());
        System.out.println("");
    }
}
