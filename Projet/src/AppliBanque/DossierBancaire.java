package AppliBanque;

public class DossierBancaire {
	
    private CompteEpargne m_compte_epargne;
    private CompteBancaire m_compte_bancaire;

	//Constructeur
    public DossierBancaire()
    {
    	m_compte_bancaire = new CompteBancaire();
        m_compte_epargne = new CompteEpargne(3.2); // On utilise un taux de 3.2%
    }

    //Déposer : On dépose 40% sur le compte bancaire et 60% sur le compte epargne
    public void deposer(double value) {
        m_compte_bancaire.deposer(value*0.4);
        m_compte_epargne.deposer(value*0.6);
    }
    public void retirer(double value) throws Exception{
        if(value > m_compte_bancaire.get_solde()){
            throw new Exception("Pas assez d'argent sur le compte bancaire");
        }else{
            m_compte_bancaire.retirer(value);
        }
    }

    //Get solde
    public double get_solde() {return m_compte_bancaire.get_solde() + m_compte_epargne.get_solde();}
    //Rémunerer
    public void remunerer() {m_compte_epargne.remunerer();} 

}
