package domain;

public class Tesoura implements Algoritmo{

  @Override
  public void executar(TipoAlgoritmo tipo) {
    
    switch(tipo){
      case PEDRA :
        System.out.println("perdeu!pedra destroi tesoura");
        break;
      case SPOCK :
        System.out.println("perdeu! Spock destroi tesoura.");
        break;
      case TESOURA :
        System.out.println("empatou!tesoura empata com tesoura.");
        break;
      case LAGARTO :
        System.out.println("ganhou!tesoura decapita lagarto ");
        break;
      default :
        System.out.println("Ganhou! tesoura corta  Papel");
    }
  }

  
}
