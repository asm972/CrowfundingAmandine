package cf1.adaming.ngspringsec.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import cf1.adaming.ngspringsec.model.Projet;
import cf1.adaming.ngspringsec.services.ProjetService;

@SpringBootTest
 class ProjetControllerApiTest {
	@InjectMocks
	private ProjetControllerApi pca;
	
	@Mock
	private ProjetService ps;
	
	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	

	@Test
	public void testGetById() {
		Projet pro = new Projet();
		pro.setId(1l);
		when(ps.findById(pro.getId())).thenReturn(pro);
		
		Projet expected= pca.getById(pro.getId());
		
		assertThat(expected).isNotNull();
		assertThat(pro).isEqualTo(expected);
	}

	@Test
	public void testFindAll() {
		Projet proo = new Projet();
		
		List <Projet> pro = new ArrayList<Projet>();
		pro.add(proo);
		when(ps.findAll()).thenReturn(pro);
		
		List<Projet> expected= pca.findAll();
		
		assertThat(expected).isNotNull();
		assertThat(pro).isEqualTo(expected);
	}

	@Test
	public void testSave() {

		
		Projet pro = new Projet("test1", 100l, 12);
		when(ps.save(pro)).thenReturn(pro);
		
		Projet expected= pca.save(pro);
		
		assertThat(expected).isNotNull();
		assertThat(pro).isEqualTo(expected);
	}

	@Test
	public void testDelete() {
		Projet pro = new Projet("test1", 100l, 12);
		when(ps.delete(pro.getId())).thenReturn(pro);
		Projet expected= pca.delete(pro.getId());
		
		assertThat(expected).isNotNull();
		assertThat(pro).isEqualTo(expected);
		
	}
}
