package AppliBanque;

public class DossierBancaire {

    private CompteBancaire m_compte_bancaire;
	//Constructeur
    public DossierBancaire()
    {
    	m_compte_bancaire = new CompteBancaire();
    }

    public void deposer(double value) {m_compte_bancaire.deposer(value);}
    public double get_solde() {return m_compte_bancaire.get_solde();}
    public void remunerer() {}
    
}
