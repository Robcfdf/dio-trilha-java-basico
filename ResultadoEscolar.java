import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        double nota = input.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            System.out.println("Recuperação"); 
        } else {
            System.out.println("Reprovado");
        }
    }
}