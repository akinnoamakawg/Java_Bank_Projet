import java.time.LocalDate;
public class LigneComptable {
    public double lValeur;
    public String theme, paiement;
    public LocalDate date;

    //public LigneComptable(){}
    public LigneComptable(String th, String p, double lv, LocalDate d){
        this.lValeur = lv;
        this.date = d;
        this.theme = th;
        this.paiement = p;
    }

    public String toString(){
        return "Montant : "+"\t\t\t"+lValeur+" $"+"\nThème : "+"\t\t\t"+theme+"\nPaiement : "+"\t\t\t"+paiement+"\nDate : "+"\t\t\t\t"+date;
    }
}
