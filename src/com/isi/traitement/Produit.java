package com.isi.traitement;

import java.util.Scanner;

public class Produit {
    private int qtE;
    private int prixE;
    private int qtS;
    private int prixS;
    private int stock;

    public void calcul() {
        Scanner scanner = new Scanner(System.in);
        String rep = null;
        stock = 0;
        do {
            do {
                    System.out.println("Voulez vous saisir une entree ou une sortie e/s");
                    rep = scanner.nextLine();
                    if (rep.equalsIgnoreCase("e")) {
                        System.out.println("Saisir la quantite en entree");
                        qtE = Integer.parseInt(scanner.nextLine());
                        System.out.println("Saisir le prix en entree");
                        prixE = Integer.parseInt(scanner.nextLine());
                        stock = stock + qtE;
                    } else if (rep.equalsIgnoreCase("s")) {
                        System.out.println("Saisir la quantite en sortie");
                        qtS = Integer.parseInt(scanner.nextLine());
                        System.out.println("Saisir le prix en sortie");
                        prixS = Integer.parseInt(scanner.nextLine());
                        if (stock > qtS) {
                            stock = stock + qtS;
                        } else {
                            System.out.println("le stock n'est pas dosponible");
                        }
                    } else {
                        rep = "n";
                    }
              }while (rep.equalsIgnoreCase("n")) ;
                System.out.println("Voulez vous continuer? oui/non");
                rep = scanner.nextLine();
            } while (rep.equalsIgnoreCase("oui"));
            System.out.println("Le Stock global est de : " + stock);
        }
    }
