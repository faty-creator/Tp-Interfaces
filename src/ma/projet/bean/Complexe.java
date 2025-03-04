package ma.projet.bean;

import ma.projet.inter.IAffichage;
import ma.projet.inter.IOperation;


public class Complexe implements IOperation<Complexe>, IAffichage {
	private double im;
	private double re;

	public Complexe(double im, double re) {
		super();
		this.im = im;
		this.re = re;
	}

	public double getIm() {
		return im;
	}

	public void setIm(double im) {
		this.im = im;
	}

	public double getRe() {
		return re;
	}

	public void setRe(double re) {
		this.re = re;
	}

	@Override
	public Complexe plus(Complexe obj) {
	    return new Complexe(this.re + obj.re, this.im + obj.im);
	}

	@Override
	public Complexe moins(Complexe obj) {
	    return new Complexe(this.re - obj.re, this.im - obj.im);
	}


	@Override
	public String affiche() {
	    return "Le nombre est : " + this.re + " + " + this.im + "i";
	}

}
