package domain;

public class Pedra implements Algoritmo {

  @Override
  public void executar(TipoAlgoritmo tipo) {
    switch(tipo){
      case PEDRA : 
        System.out.println(" empatou!pedra empata com pedra ");
        break;
      case SPOCK : 
        System.out.println("perdeu!spock destoi a pedra ");
        break;
      case TESOURA : 
        System.out.println("ganhou!tesoura é destruida pela pedra");
        break;
      case LAGARTO : 
        System.out.println("ganhou!pedra mata o lagarto");
        break;
      default:
        System.out.println("perdeu!papel embrula a pedra");
        
    }
      
    }
  }
  

