import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner area = new Scanner(System.in);

        while (true) {
            System.out.println("-----Menu-----");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = area.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o lado do quadrado:");
                    float lado = area.nextFloat();
                    float areaQuadrado = lado * lado;
                    System.out.println("A área do quadrado é " + areaQuadrado);
                    break;
                case 2:
                    System.out.println("Digite o raio do círculo:");
                    float raio = area.nextFloat();
                    float areaCirculo = (float) (Math.PI * raio * raio);
                    System.out.println("A área do círculo é " + areaCirculo);
                    break;
                case 3:
                    System.out.println("Programa encerrado.");
                    area.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
