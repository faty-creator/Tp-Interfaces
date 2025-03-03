package ma.projet.bean;

import ma.projet.inter.IAffichage;
import ma.projet.inter.IOperation;

public class Complexe implements IOperation, IAffichage {
	private double im;
	private double re;

	public Complexe(double im, double re) {
		super();
		this.im = im;
		this.re = re;
	}

	@Override
	public String affiche() {
		return re + (im >= 0 ? " + " : " - ") + Math.abs(im) + "i";
	}

	@Override
	public Object plus(Object obj) {
		if (obj instanceof Complexe) {
			Complexe c = (Complexe) obj;
			return new Complexe(this.re + c.re, this.im + c.im);
		}
		return null;
	}

	@Override
	public Object moins(Object obj) {
		if (obj instanceof Complexe) {
			Complexe c = (Complexe) obj;
			return new Complexe(this.re - c.re, this.im - c.im);
		}
		return null;
	}

}
