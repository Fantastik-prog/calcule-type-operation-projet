/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calcule;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static Scanner clavier = new Scanner (System.in);
    static Scanner clavier2 = new Scanner (System.in);
    public static void main(String[] args) {
        // lignes pour les variables
        double firstnum;
        double secondnum;
        double result;
        String operations = "" ;

         //lignes pour les fonction affichage et lire

        System.out.println("Bienvenue dans le monde de calcule");

        //lignes de commandes aux utilisateurs
        System.out.println("Entrer un nombre:");
        firstnum = clavier.nextDouble();

        System.out.println("Entrer une deuxieme nombre:");
        secondnum = clavier.nextDouble();
        //clavier.nextLine();

        //lignes pour le choix de l'operation
        System.out.println("Saisir l'operation de votre choix:");
        operations = clavier2.nextLine();
        //clavier.nextLine();
         System.out.println(operations);

        //conditions pour les operations
        if (operations.equalsIgnoreCase("addition") || operations.equalsIgnoreCase("+"))
        {
            result = firstnum + secondnum;
            System.out.println("l'addition de:" +firstnum+ "+" +secondnum+ "=" +result);
        }

        else if (operations.equalsIgnoreCase("soustraction")|| operations.equalsIgnoreCase("-"))
        {
            result = firstnum - secondnum;
            System.out.println("La soustraction de: " +firstnum + " - " + secondnum+ " = " + result);
        }

        else if (operations.equalsIgnoreCase("multiplication")|| operations.equalsIgnoreCase("*"))
        {
            result = firstnum * secondnum;
            System.out.println("la multiplication de:" +firstnum+ "*" +secondnum+ "=" +result);
        }

        else if (operations.equalsIgnoreCase("division")|| operations.equalsIgnoreCase("/"))
        {
            result = firstnum / secondnum;
            System.out.println("la dvision de:" +firstnum+ "/" +secondnum+ "=" +result);
        }

    }

}
