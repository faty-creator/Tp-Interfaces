package ma.projet.bean;

import ma.projet.inter.IAffichage;
import ma.projet.inter.IOperation;


public class Reel implements IOperation<Reel>, IAffichage {
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

	public double plus(double... x) {
		double somme = this.x;
		for (double val : x) {
			somme += val;
		}
		return somme;
	}

	public double moins(double... x) {
		double res = this.x;
		for (double val : x) {
			res -= val;
		}
		return res;
	}

}
