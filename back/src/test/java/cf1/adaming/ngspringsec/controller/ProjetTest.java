package cf1.adaming.ngspringsec.controller;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cf1.adaming.ngspringsec.model.Categorie;
import cf1.adaming.ngspringsec.model.Projet;
import cf1.adaming.ngspringsec.model.User;

class ProjetTest {
Projet pro = new Projet("jet", 10l,0);
User user = new User();
Categorie cat = new Categorie();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testGetUser() {
		pro.setUser(user);;
	}

	@Test
	void testGetImage() {
		;
	}

	@Test
	void testSetImage() {
		fail("Not yet implemented");
	}

	@Test
	void testSetUser() {
		fail("Not yet implemented");
	}

	@Test
	void testProjet() {
		fail("Not yet implemented");
	}

	@Test
	void testProjetStringLongInteger() {
		fail("Not yet implemented");
	}

	@Test
	void testGetId() {
		fail("Not yet implemented");
	}

	@Test
	void testSetId() {
		pro.setId(1l);
		
	}

	@Test
	void testGetNom() {
		fail("Not yet implemented");
	}

	@Test
	void testSetNom() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDescription() {
		fail("Not yet implemented");
	}

	@Test
	void testSetDescription() {
		fail("Not yet implemented");
	}

	@Test
	void testGetSomme() {
		fail("Not yet implemented");
	}

	@Test
	void testSetSomme() {
		fail("Not yet implemented");
	}

	@Test
	void testGetSomme0() {
		fail("Not yet implemented");
	}

	@Test
	void testSetSomme0() {
		fail("Not yet implemented");
	}

	@Test
	void testGetCategorie() {
		fail("Not yet implemented");
	}

	@Test
	void testSetCategorie() {
		fail("Not yet implemented");
	}

	@Test
	void testGetUp() {
		fail("Not yet implemented");
	}

	@Test
	void testSetUp() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPaiement() {
		fail("Not yet implemented");
	}

	@Test
	void testSetPaiement() {
		fail("Not yet implemented");
	}

}
