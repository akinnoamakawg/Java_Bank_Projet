import java.util.*;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calcul op = new Calcul();

        int choice;
        
        do{
            op.menuPrincipale();
            System.out.print("Choix : ");
            int choix = sc.nextInt();
            
            switch (choix) {
                case 1:op.creerCpte(); break;
                case 2:op.afficherCpte(); break;
                case 3: op.creerLigneComptable(); op.afficherLigne();break;
                case 4:op.sortir();break;
                case 5: op.alAide();break;
            }
            System.out.println("Continuer [1- oui/2- non]");
            choice = sc.nextInt();
        }while(choice != 2);
        
    }
}
