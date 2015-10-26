/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author SONY
 */
public class Main {

    public static void main(String[] args) {
        
    
     Scanner clavier = new Scanner(System.in);

    Personne p=new Personne("lila","kadri","algérie",20);
    Personne autre = new Personne("aicha","kaioua","algérie",20);
 
   int choix;
       
        System.out.println("**menue**");
        System.out.println("1-ajouter un amis"); 
        System.out.println(" 2-afficher votre liste d'amis");

        System.out.println("\nIntroduction du choix: ");
       choix = clavier.nextInt();
        switch (choix) {                

            case 1:
                p.AjoutAmis(autre);
                break;
            case 2:   
                p.afficherlesamis(p);
                break;
            default:System.out.println("1 ou 2");
                break;
        }
        
      
   
     
        }   
    
}
        