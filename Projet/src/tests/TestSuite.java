package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import AppliBanque.DossierBancaire;

//The Test annotation indicates that the public void method to which it is attached can be run as a test case.
public class TestSuite {

	@Test  
	public void test_retirer_suffisant() throws Exception 
	{
		DossierBancaire dossier=new DossierBancaire();
		dossier.deposer(100);
		dossier.retirer(20);
		assertEquals(80,dossier.get_solde(),0); 
	}

	@Test
	public void test_retirer_insuffisant() 
	{
		DossierBancaire dossier=new DossierBancaire();
		dossier.deposer(100);
		try {
			dossier.retirer(41);
		} catch (Exception e) {
			//e.printStackTrace();
			fail("Insuffisance dans le compte Bancaire");
		}
		
	}

}
