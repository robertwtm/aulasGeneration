package ProjetoZoo;

public class Leao extends Carnivoros {

	String comidaLećo;
	
	@Override
	public void som() {
		System.out.println("Rugindo...");
	}
	
	public void alimentar() {
		System.out.println("Comendo zebras...");
	}
	
	public String comer(String comidaLećo) {
		String comendo = comidaLećo;
		return comendo;
	}

}
