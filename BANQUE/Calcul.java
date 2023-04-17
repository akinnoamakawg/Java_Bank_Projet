import java.time.LocalDate;
import java.util.*;
public class Calcul {
    Scanner sc = new Scanner(System.in);

//========================================================================Compte============================================
    List<Compte> liste_cpte = new ArrayList<>();  

    public void creerCpte() {
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.print("Type de compte [courant/joint/epargne] : ");
        String type_cpte = sc.next();

        double taux = 0;
        switch (type_cpte) {
            case "courant":
                taux = 12.30;
                break;
            case "joint":
                taux = 6.30;
                break;
            case "epargne":
                taux = 10.30;
                break;
        }
        int num_cpte = 0;
        if (liste_cpte.isEmpty()) {
            num_cpte = 1;
        } else {
    
            num_cpte = liste_cpte.size() + 1;
        }

        System.out.println("Taux : " + taux);
        System.out.print("Valeur : ");
        double valeur = sc.nextDouble();

        liste_cpte.add(new Compte(type_cpte,num_cpte,valeur,taux));
        System.out.println("\t\t\tCompte crée avec succès  !");
        System.out.println("-------------------------------------------------------------------------------------------------");

    }
    

    public void afficherCpte(){
        System.out.print("Numero de compte : ");
        int num = sc.nextInt();
        System.out.println("\n-------------------------------------------------------------------------------------------------");
        for(Compte c : liste_cpte){
            if(num == c.num_cpte){
                System.out.println(c);
            }
        }
        System.out.println("-------------------------------------------------------------------------------------------------");
    }
//========================================================Fonctions du programme========================================

    
    
    public static void menuPrincipale(){
        System.out.println("\t\t\tOption\n1- Créer un compte\n2- Afficher un compte\n3- Créer une ligne comptable\n4- Sortir\n5- Aide");
    }
    public static void sortir(){
        System.out.println("Au revoir !!!");
        System.exit(0);
    }
    public void alAide(){
        System.out.println("\n1- Créer un compte\n2- Afficher un compte\n3- Créer une ligne comptable\n4- Sortir\n5- Aide");
    }


//===========================================================Ligne Comptable============================================
    List <LigneComptable> liste_lCpte = new ArrayList<>();

    public void creerLigneComptable(){
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.print("Montant : ");
        double valeur = sc.nextDouble();
        System.out.print("Thème [loyer/etudes/divers] : ");
        String theme = sc.next();
        System.out.print("Moyen de paiement [chèque/virement/CB] : ");
        String paiement = sc.next();

        //===========Format de la date (yyyy/MM/DD)====================
        System.out.print("Année : ");
        int annee = sc.nextInt();
        System.out.print("Mois : ");
        int mois =sc.nextInt();
        System.out.print("Jour : ");
        int jour = sc.nextInt();

        LocalDate date =LocalDate.of(annee, mois, jour);

        liste_lCpte.add(new LigneComptable(valeur, theme, paiement, date));
        System.out.println("\t\t\tLigne comptable créée avec succès !");
        System.out.println("-------------------------------------------------------------------------------------------------");
    }

    public void afficherLigne(){
        for(LigneComptable lg : liste_lCpte){
            System.out.println(lg);
        }
        System.out.println("-------------------------------------------------------------------------------------------------");
    }

}
