package controller;
import Kreis.PilhaInt.PilhaInt;

public class ConverteController {
  private PilhaInt pilha;

  public ConverteController() {
    this.pilha = new PilhaInt(1000);
  }

  public String dec(int decimal) {
    while (decimal > 0) {
      int res = decimal % 2;
      pilha.empilhar(res);
      decimal = decimal / 2;
    }
    String binario = "";
    while (!pilha.vazia()) {
      binario += Integer.toString(pilha.desempilhar());
    }
    return binario;
  }
}


