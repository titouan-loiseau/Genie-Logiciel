package AppliBanque;

public class DossierBancaire {
	
	//Constructeur
    private CompteEpargne m_compte_epargne;
    private CompteBancaire m_compte_bancaire;

    public DossierBancaire()
    {
    	m_compte_bancaire = new CompteBancaire();
        m_compte_epargne = new CompteEpargne(3.2); // On utilise un taux de 3.2%
    }

    public void deposer(double value) {
        m_compte_bancaire.deposer(value*0.4);
        m_compte_epargne.deposer(value*0.6);
    }
    public double get_solde() {return m_compte_bancaire.get_solde() + m_compte_epargne.get_solde();}
    public void remunerer() {m_compte_epargne.remunerer();}    
}
