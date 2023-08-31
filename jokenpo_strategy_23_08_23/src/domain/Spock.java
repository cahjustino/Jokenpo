package domain;

public class Spock implements Algoritmo{

  @Override
  public void executar(TipoAlgoritmo tipo) {
    switch(tipo){
      case PEDRA :
        System.out.println("ganha!spock destri pedra");
        break;
      case SPOCK :
        System.out.println("empatou!spock empata com spock");
        break;
      case TESOURA :
        System.out.println("ganhou!spock destroi tesoura");
        break;
      case LAGARTO :
        System.out.println("perdeu!lagarto envena spock");
        break;
      default :
        System.out.println("perdeu!papel espanta spock");
    }
  }
  
}
