package ex_interface;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner (System.in);
    public static   void main(String[] args) {
       GeometricForm geometricForm = null;
        int op= 0;
        while (op != 4) { 
            System.out.println("Escolha a forma geometrica para calcular a area");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retangulo");
            System.out.println("3 - Circulo");
            System.out.println("4 - Sair do programa");


            op = scanner.nextInt();

            switch (op) {
                case 1 -> {
                    geometricForm = createSquare();
                    System.out.println("Área do quadrado: " + geometricForm.getArea());
                    break;
                }
                case 2 -> {
                    geometricForm = createRectangle();
                    System.out.println("Área do retângulo: " + geometricForm.getArea());
                    break;
                }
                case 3 -> {
                    geometricForm = createCircle();
                    System.out.println("Área do círculo: " + geometricForm.getArea());
                    break;
                }
                case 4 -> {
                    System.out.println("Saindo do programa");
                    System.exit(0);
                }
            
                default -> {
                    System.out.println("Opção invalida");
                }
            }
        }
    }

    private static GeometricForm createSquare(){
        System.out.println("Informe o tamanho do lado do quadrado");
        var side = scanner.nextDouble();
        return new Square(side);
    }

    private static GeometricForm createRectangle(){
        System.out.println("Informe a base");
        var base = scanner.nextDouble();
        System.out.println("Informe a altura do retangulo");
        var height = scanner.nextDouble();
        return new Rectangle(height, base);
    }

    private static GeometricForm createCircle(){
        System.out.println("Informe o raio do circulo");
        var raio = scanner.nextDouble();
        return new Circle(raio);
    }
}
