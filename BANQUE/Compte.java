import java.util.*;
public class Compte {
    public String type_cpte;
    public double valeur, taux;
    public int  num_cpte;

    public Compte(String t, int  num , double valeur, double taux){
        this.valeur = valeur;
        this.taux = taux;
        this.type_cpte = t;
        this.num_cpte = num;
    }

    public String toString(){
        return "Numero de compte : "+"\t\t"+num_cpte+"\nType de compte : "+"\t\t"+type_cpte+"\nTaux : "+"\t\t\t\t"+taux+" %"+"\nValeur créditée : "+"\t\t"+valeur+" $";
    }
}