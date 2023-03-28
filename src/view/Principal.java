package view;

import java.util.Scanner;
import controller.ConverteController;

public class Principal {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    ConverteController converte = new ConverteController();
    System.out.print("Digite um número até 1000: ");
    int decimal = leitor.nextInt();
    String binario = converte.dec(decimal);
    System.out.println("O número " + decimal + " em binário é: " + binario);
    leitor.close();
  }
}
