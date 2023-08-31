package domain;

public class Papel implements Algoritmo {

  @Override
  public void executar(TipoAlgoritmo tipo) {
    switch(tipo){
      case PEDRA :
        System.out.println("Ganhou! Papel embrulha Pedra.");
        break;
      case SPOCK :
        System.out.println("Ganhou! Papel espanta o Spock.");
        break;
      case TESOURA :
        System.out.println("Perdeu! Tesoura corta papel.");
        break;
      case LAGARTO :
        System.out.println("Perdeu! Lagarto come o papel.");
        break;
      default:
        System.out.println("Empatou! Papel empata com Papel.");

    }
  }
  
}
