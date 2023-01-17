import java.util.Scanner;

/*Escollir entre 1-correr, 2-parar, 3-acabar */
public class switch2 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int funcio = 0;
        do {
            System.out.println("Escull entre aquestes tres");
            funcio = sc.nextInt();

      switch (funcio) {
      case 1:
        System.out.println("Escollir");
        break;
      case 2:
        System.out.println("Correr");
        break;
      case 3:
        System.out.println("Parar");
        break;

       default:
       System.out.println("no existe");
       break;
       }
     }
     while (funcio!=3);
    }
  }
