import java.util.Scanner;

public class ExercicioTemperatura {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int quantidadeTemperaturas = 12;
    double entradaTemperaturas, totalTemperaturas = 0, mediaTemperaturas;

    for (int i = 1; i <= quantidadeTemperaturas; i++){
        System.out.println("Digite a temperatura "+i+" (entre 4 e 10):");
        entradaTemperaturas = scanner.nextDouble();
        if (entradaTemperaturas>=4 && entradaTemperaturas <=10) {
            totalTemperaturas = totalTemperaturas + entradaTemperaturas;
        }else {
            System.out.println("Temperatura invalida! Tente novamente!");
            i--;
        }
    }
    mediaTemperaturas = totalTemperaturas / quantidadeTemperaturas;
    System.out.println("A média de hoje das temperaturas é: "+ String.format("%.1f",mediaTemperaturas) + "º C");
    scanner.close();
}    
}
