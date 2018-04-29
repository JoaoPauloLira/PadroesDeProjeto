package Criacao.Singleton;

public class TorreDeMarfin {

	private static TorreDeMarfin instance;

	private TorreDeMarfin() {
	}

	public void regeneraHp() {
		System.out.println("HP Regenerado!");
		System.out.println("Bonus 25% de HP por 20 minutos!");
	}

	public void regeneraMp() {
		System.out.println("MP Regenerado!");
		System.out.println("Bonus 25% de MP por 20 minutos!");
	}

	public static TorreDeMarfin getInstance() {
		synchronized (TorreDeMarfin.class) {
			if (instance == null)
				instance = new TorreDeMarfin();
		}
		return instance;
	}

}
