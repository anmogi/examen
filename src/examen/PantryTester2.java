package examen;

import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class PantryTester2 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //Inicialitza un objecte de tipus escaner
        Scanner scan = new Scanner(System.in);
        int num, amount;
        //Crea 4 objectes de tipus Jam i un objecte de tipus Pantry
        Jam goose = new Jam("Gooseberry", "7/4/2015", 12);
        Jam apple = new Jam("Crab Apple", "9/30/2015", 8);
        Jam rhub = new Jam("Rhubarb", "10/31/2014", 3);
        Jam rhub2 = new Jam("Rhubarb", "10/31/2014", 3);
        Pantry hubbard = new Pantry(goose, apple, rhub);
        //Imprimeix per pantalla un missatge de benvinguda i un llistat de les jerres en la Pantry
        System.out.println("Welcome to Mother Hubbard's Party!");
        System.out.println("The jams are: ");
        hubbard.print();

        do {
            //Te demana que introdueixis quin Jam vols
            System.out.println("Enter your selection (1,2,or 3):");
            num = scan.nextInt();
            //Si és un número dels contemplats entra en la condició
            if (num == 1 || num == 2 || num == 3) {
                hubbard.select(num);
                System.out.println("Enter amount to spread:");
                amount = scan.nextInt();
                hubbard.spread(amount);
                System.out.println("The jams are: ");
                hubbard.print();

            } else { //Si està fora de rang demana que introdueixis un altra cop un nombre valid o si vols sortir del programa
                System.out.println("Selection out-of-range, please enter again or '-1' for exit!");
            }
        } 
        //El programa seguirà mentre no introdueixis -1
        while (num != -1);
        System.out.println("Good-by!");
        scan.close();
    }
}
