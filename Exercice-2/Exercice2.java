/* Calculatrice 
- Mettre en place un menu
    -addition
    -soustraction
    -multipllication
    -division
    -factoriel
*/

import java.util.Scanner;

public class Exercice2 {

    public static double addition(double ...args){
        double resultat = 0;
        for(double number: args){
            resultat += number;
        }
        return resultat;
    }

    public static double soustraction(double ...args){
        double resultat = 0;
        for(double number: args){
            resultat -= number;
        }
        return resultat;
    }

    public static long multiplication(long ...args){
        long resultat = 1;
        for(long number: args){
            resultat *= number; 
        }
        return resultat;
    }

    public static long division(long ...args){
        for(long number: args){
            if(number == 0){
                System.out.println("Une division par zéro n'est pas possible.");
            }
        }
        long resultat = args[0];
        for(int i =1; i < args.length; i++){
            resultat = resultat / args[i];
        }
        return resultat;
    }

    public static long factoriel(long number){
        long resultat = 1;
        do {
            System.out.println("Entrer un nombre valide");
        }while (number<0);

        if (number <= 1) {
            return resultat;
        }else {
            for(int i = 1; i <= number; i--){
                resultat = resultat * i;
            }
        }
        return resultat;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("---Welcome to the Calculatrice---\n");
        
        boolean continuer = true;
        while(continuer){
            System.out.println(
                """
                    1- Addition
                    2- Soustraction
                    3- Multiplication
                    4- Division
                    5- Factoriel
                    q- Quitter
                        
                """
            );

            System.out.print("Veillez Choisir une option de calcule\n: ");
            String choix = scanner.nextLine();

            if (choix.equalsIgnoreCase("q")) {
                continuer = false;
                System.out.println("Au revoir !");
                continue;
            }

            int choice;
            try {
                choice = Integer.parseInt(choix);
            } catch (NumberFormatException e) {
                System.out.println("Option invalide, veuillez réessayer.");
                continue;
            }

            if (choice == 1) {
                System.out.print("Entrer les valeurs: ");
                double valeurs = scanner.nextDouble();
                scanner.nextLine(); // consommer le saut de ligne
                addition(valeurs);
                System.out.println("Résultat: " + addition(valeurs));
            }
        }

        scanner.close();
    }
}
