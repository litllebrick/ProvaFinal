package ProvaFinal;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class AnimalControllerTest {

	@Test
	void test() {
		Cachorro dog1 = new Cachorro();
		Cachorro dog2 = new Cachorro();
		
		Gato cat1 = new Gato();
		Gato cat2 = new Gato();
		
		ArrayList<Animal> list = new ArrayList<>();
		
		list.add(dog1);
		list.add(dog2);
		list.add(cat1);
		list.add(cat2);
		
		AnimalController controller = new AnimalController();
		
		assertEquals(4, controller.alimentar(list)); 
		
	}
	
	@Test
	void test2() {
		Cachorro dog1 = new Cachorro();
		Cachorro dog2 = new Cachorro();
		
		Gato cat1 = new Gato();
		Gato cat2 = new Gato();
		
		cat1.setEstaCheio(true);
		cat1.setEstaCheio(true);
		
		ArrayList<Animal> list = new ArrayList<>();
		
		list.add(dog1);
		list.add(dog2);
		list.add(cat1);
		list.add(cat2);
		
		AnimalController controller = new AnimalController();
		
		assertEquals(2, controller.alimentar(list)); 
	}

}
