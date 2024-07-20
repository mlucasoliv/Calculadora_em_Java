import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double resultado = 0;

        System.out.println("======Calculadora======");
        System.out.println();

        System.out.println("Digite o primeiro número: ");
        double primeiro = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        double segundo = sc.nextDouble();

        System.out.println();
        System.out.println();
        System.out.println("Digite o número da operação que vc deseja: ");
        System.out.println();
        System.out.println("1- Somar");
        System.out.println("2- Subtrair");
        System.out.println("3- Dividir");
        System.out.println("4- Multiplicar");
        int escolha = sc.nextInt();
        System.out.println();
        System.out.println();

        switch (escolha){

            case 1:
                resultado = primeiro + segundo;
                break;
            case 2:
                resultado = primeiro - segundo;
                break;
            case 3:
                    if (primeiro != 0 && segundo != 0) {
                        resultado = primeiro / segundo;
                    }
                    else {
                        System.out.println("Divisão inválida.");
                        sc.close();
                        return;
                    }
                    break;
            case 4:
                resultado = primeiro * segundo;
                break;
            default:
                System.out.println("Operação inválida.");
                sc.close();
                return;

        }

        System.out.printf("O resultado da operação é: %.2f", resultado);
        sc.close();


    }
}