package AppliBanque;

public class CompteEpargne extends CompteBancaire {
	
    private double taux; // Taux stocké en pourcentage 1.032 par défaut

    //Constructeur
    public CompteEpargne(double t)
    {
        taux = 1+t/100;
    	m_solde=0;
    }

    public void remunerer(){m_solde = m_solde * taux;}
    
}
