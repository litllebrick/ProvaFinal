package ProvaFinal;

import java.util.ArrayList;

public class AnimalController {

	public int alimentar(ArrayList<Animal> animais) {
		int alimentados = 0;
		for(Animal animal : animais) {
			if(animal instanceof Cachorro) {
				if(!((Cachorro) animal).isEstaCheio()) {
					animal.comer();
					alimentados++;
				}
			} else {
				if(!((Gato) animal).isEstaCheio()) {
					animal.comer();
					alimentados++;
				}
			}
		}
		return alimentados;
	}
	
}
