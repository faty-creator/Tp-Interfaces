package ma.projet.beanEx3;

import ma.projet.abstEx3.Affichage;
import ma.projet.interEx3.IOperation;

public class Complexe extends Affichage implements IOperation<Complexe> {

	private double im;
	private double re;
	
	
	
	public Complexe(double im, double re) {
		
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
		obj=new Complexe(this.re+obj.re,this.im+obj.im);
		return obj;
	}

	@Override
	public Complexe moins(Complexe obj) {
		obj=new Complexe(this.re-obj.re,this.im-obj.im);
		return obj;
	}

	@Override
	public String affiche() {

		return "le nbr est :"+this.re+this.im+" i";
		
	}

	
	

	
	
	
	
	

}
