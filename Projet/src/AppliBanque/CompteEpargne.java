package AppliBanque;
import org.junit.*;
public class CompteEpargne extends CompteBancaire {
	
    private double taux;
    public CompteEpargne(double t)
    {
        taux = 1+t/100;
    	m_solde=0;
    }

    public void remunerer(){m_solde = m_solde * taux;}
    
	//sinj
}
