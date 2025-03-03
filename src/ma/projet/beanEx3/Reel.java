package ma.projet.beanEx3;

import ma.projet.abstEx3.Affichage;
import ma.projet.interEx3.IOperation;

public class Reel extends Affichage implements IOperation<Reel> {
	private double x;

	public Reel(double x) {
		super();
		this.x = x;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	@Override
	public Reel plus(Reel obj) {

		return new Reel(obj.x + this.x);
	}

	@Override
	public Reel moins(Reel obj) {

		return new Reel(obj.x - this.x);

	}

	@Override
	public String affiche() {

		return "le nbr est :" + this.x;
	}

	
	


}
