package ma.projet.testEx3;

import ma.projet.beanEx3.Complexe;
import ma.projet.beanEx3.Reel;

public class Test {
	public static void main(String[] args) {

		Complexe[] complexes = new Complexe[3];

		complexes[0] = new Complexe(1, 2);
		complexes[1] = new Complexe(3, 4);
		complexes[2] = new Complexe(5, 6);

		for (Complexe c : complexes) {
			System.out.println(c.affiche());
		}

		Reel[] reels = new Reel[3];

		reels[0] = new Reel(2);
		reels[1] = new Reel(4);
		reels[2] = new Reel(6);

		for (Reel r : reels) {
			System.out.println(r.affiche());

		}
		System.out.println("-------la somme-------- ");
		Complexe cComplexePlus = complexes[0].plus(complexes[1]);
		
		System.out.println(cComplexePlus.affiche());
		System.out.println("------- la soustraction:------");
		Complexe cComplexeMoins = complexes[0].moins(complexes[1]);
		System.out.println(cComplexeMoins.affiche());
		System.out.println("-------la somme-------- ");
		Reel rReelPlus = reels[0].plus(reels[1]);
		System.out.println(rReelPlus.affiche());
		System.out.println("------- la soustraction:------");
		Reel rReelMoins = reels[0].moins(reels[1]);
		System.out.println(rReelMoins.affiche());

	}
}
