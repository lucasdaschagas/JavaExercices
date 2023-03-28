import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Questão 1: ");

        int INDICE = 13, SOMA = 0, K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println(SOMA);

        //A variavel "SOMA" será 91

        System.out.println("----------------------------");
        System.out.println("Questão 2: ");


        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();
        int a = 0, b = 1, c;
        boolean pertence = false;
        if (num == 0 || num == 1) {
            pertence = true;
        } else {
            for (int i = 2; i <= num; i++) {
                c = a + b;
                if (c == num) {
                    pertence = true;
                    break;
                }
                a = b;
                b = c;
            }
        }
        if (pertence) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }

        System.out.println("----------------------------------------");
        System.out.println("Questão 3: ");

        System.out.println("A");
        int ultimo1 = 7;
        int penultimo1 = 5;
        int resultado1 = ultimo1 + (ultimo1 - penultimo1);
        System.out.println(resultado1); // saída: 9

        System.out.println("--------");

        System.out.println("B");
        int ultimo2 = 64;
        int resultado2 = ultimo2 * 2;
        System.out.println(resultado2); // saída: 128

        System.out.println("--------");

        System.out.println("C");
        int ultimo3 = 36;
        int resultado3 = ultimo3+ (ultimo3 - 25) + 2;
        System.out.println(resultado3); // saída: 49


        System.out.println("--------");

        System.out.println("D");
        int ultimo4 = 64;
        int resultado4 = ultimo4 + (ultimo4 - 36) + 8;
        System.out.println(resultado4); // saída: 100

        System.out.println("--------");

        System.out.println("E");
        int ultimo5 = 8;
        int penultimo5 = 5;
        int resultado = ultimo5 + penultimo5;
        System.out.println(resultado); // saída: 13

        System.out.println("--------");

        System.out.println("F");
        int ultimo6 = 19;
        int resultado6 = ultimo6 + 1;
        System.out.println(resultado6); // saída: 20

        System.out.println("----------------------------------------");
        System.out.println("Questão 5: ");

        String original = "Hello World!";
        char[] caracteres = original.toCharArray();
        int tamanho = caracteres.length;
        char[] invertido = new char[tamanho];

         //Loop que inverte os caracteres
        for (int i = 0; i < tamanho; i++) {
            invertido[i] = caracteres[tamanho - i -1];
        }

        String resultadoQ5 = new String(invertido);
        System.out.println(resultadoQ5);

    }


    }

