/* Exercise 1 — Personal Information
Goal: variables, types, and displaying info.

Write a program that asks for:
- A student's name.
- Their age.
- Their grade average.
- Whether they passed or not.
Then display all the information and the mention. "Heyst" */

import java.util.Scanner;

public class Exercice1 {

    public static  boolean estAdmis(double moyenne){
        if(moyenne >= 12){
            return true;
        }
        return false;
    }

    public static String mention(double moyenne){
        if(moyenne < 10){
            return "Insuffisant";
        }
        else if (moyenne < 12){
            return "Passable";
        }
        else if(moyenne < 14){
            return "Assez-Bien";
        }
        else if(moyenne < 16){
            return "Bien";
        }
        else if(moyenne < 18){
            return "Très-Boen";
        }
        else if(moyenne <= 20){
            return "Honorable";
        }
        else {
            return "La moyenne est invalide";
        }
    }
    public static void main(String[] args){

        System.out.println("--------Systeme d'Inscription--------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEntrer votre nom: ");
        String nom = scanner.nextLine();

        System.out.print("Entrer votre prenom: ");
        String prenom = scanner.nextLine();

        System.out.print("Entrer votre age: ");
        int age = scanner.nextInt();

        System.out.print("Entrer votre moyenne: ");
        double moyenne = scanner.nextFloat();

        scanner.close();

        System.out.println("\n");

        System.out.println("_-_-_-_-Information Etudiant-_-_-_-_");
        System.out.println(
            "\nNom: " + nom + "\n" +
            "Prenom: " + prenom + "\n" +
            "Age: " + age + "\n" +
            "Moyenne: " + moyenne  
        );

        if(estAdmis(moyenne)){
            System.out.println("Admis");
        }else {
            System.out.println("Echouer");
        }
        
        System.out.println("Mention: " + mention(moyenne));

    } 
}
