import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    //Variavel
    int primeiroNumero = 0;
    int segundoNumero = 0;
    int resultado = 0;
    //Entrada de Dados
    System.out.println("Digite O Primeiro Número :");
    primeiroNumero = leitor.nextInt();
    System.out.println("\nDigite O Segundo  Número :");
    segundoNumero = leitor.nextInt();
    //Processamento
    resultado = primeiroNumero * segundoNumero ;
    //Saida
    System.out.println("\nResultado :"+ resultado);

  }
}