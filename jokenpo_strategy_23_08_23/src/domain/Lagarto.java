package domain;

public class Lagarto implements Algoritmo{

  @Override
  public void executar(TipoAlgoritmo tipo) {
    switch(tipo){
      case PEDRA :
        System.out.println("perdeu!pedra mata o lagarto");
        break;
      case SPOCK :
        System.out.println("ganhou!lagarto enveneno o spock");
        break;
      case TESOURA :
        System.out.println("perdeu!tesoura decapita lagarto!");
        break;
      case LAGARTO :
        System.out.println("empate!lagarto empata com lagarto");
        break;
      default :
        System.out.println("ganhou!lagarto come papel");
    }
  }
  
}
