package AppliBanque;

public class CompteBancaire {
	
    protected double m_solde;

    public CompteBancaire()
    {
    	m_solde=0;
    }
    public void deposer(double value) {m_solde+=value;}
    public double get_solde() {return m_solde;}
    public void retirer(double value){m_solde = m_solde - value;}
}
