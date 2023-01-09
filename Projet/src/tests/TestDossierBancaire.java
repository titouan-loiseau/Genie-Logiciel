package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import AppliBanque.DossierBancaire;

//The Test annotation indicates that the public void method to which it is attached can be run as a test case.
public class TestDossierBancaire {

	@Test
	public void test_constructeur() 
	{
		DossierBancaire dossier=new DossierBancaire();
		assertNotNull(dossier);
	}

	@Test  
	public void test_deposer() 
	{
		DossierBancaire dossier=new DossierBancaire();
		dossier.deposer(100);
		assertEquals(100,dossier.get_solde(),0); 
	}

	@Test
	public void test_remunerer() 
	{
		DossierBancaire dossier=new DossierBancaire();
		dossier.deposer(100);
		dossier.remunerer();
		double apres_remuneration = 0.4 * 100 + 0.6 * 100 * 1.032;
		assertEquals(apres_remuneration,dossier.get_solde(),0); // test après la rémunarétion
	}
}
