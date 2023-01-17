import java.util.Scanner;
import java.util.Random;

class ruleta {
    public static void main(String[] args) {

        int randomNum = (int) (Math.random() * 37);
        int puntsTotals = 1000;
        int num = 0;
        int premi = 0;
        int aposta = 0;
        int numeroApostat = 0;
        int premi36 = 36;
        int premi2 = 2;
        String par = "par";
        String impar = "impar";
        String parOimpar = "";

        Scanner myObj = new Scanner(System.in);
        puntsTotals = puntsTotals - aposta;
        System.out.println(puntsTotals);

        while (puntsTotals - aposta > 0) {
            randomNum = (int) (Math.random() * 37);
            System.out.println("Introdueix la teva $$$$$ A P O S T A $$$$$, tens " + puntsTotals + " punts");
            aposta = myObj.nextInt();
            puntsTotals = puntsTotals - aposta;
            // System.out.println(randomNum);

            System.out.println("Feu joc, teniu " + puntsTotals + " punts");

            parOimpar = myObj.next();
            numeroApostat = myObj.nextInt();
            if (numeroApostat == randomNum) {
                premi = aposta * premi36;
                puntsTotals = premi + puntsTotals;
                System.out.println("El numero premiat es el " + randomNum + "Has guanyat " + premi + "punts");
            } else if (randomNum % 2 == 0 && parOimpar.equals(par) && numeroApostat % 2 == 0) {

                premi = aposta * premi2;
                puntsTotals = premi + puntsTotals;
                System.out.println("Has guanyat " + premi + "punts");
            } else if (randomNum % 2 != 0 && parOimpar.equals(impar) && numeroApostat % 2 != 0) {
                premi = aposta * premi2;
                puntsTotals = premi + puntsTotals;
                System.out.println("Has guanyat " + premi + "punts");
            }
            System.out.println("el numero premiat ha sigut el " + randomNum);
        }
        System.out.println("Has perdut, més sort a la pròxima");

    }
}
