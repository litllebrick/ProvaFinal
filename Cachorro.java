package ProvaFinal;

public class Cachorro implements Pet, Canino {

	private boolean estaCheio = false;
	
	public boolean isEstaCheio() {
		return estaCheio;
	}

	public void setEstaCheio(boolean estaCheio) {
		this.estaCheio = estaCheio;
	}

	@Override
	public void comer() {
		this.estaCheio = true;
	}

	@Override
	public void brincar() {
		System.out.println("* brincando *");
		
	}

}
