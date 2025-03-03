package ma.projet.bean;

import ma.projet.inter.IAffichage;
import ma.projet.inter.IOperation;

public class Reel implements IOperation, IAffichage {
	private double x;

	public Reel(double x) {
		super();
		this.x = x;
	}

	@Override
	public String affiche() {
		return "" + x;
	}

	@Override
	public Object plus(Object obj) {
		if (obj instanceof Reel) {
            Reel r = (Reel) obj;
            return new Reel(this.x + r.x);
        }
        return null;
	}

	@Override
	public Object moins(Object obj) {
		if (obj instanceof Reel) {
            Reel r = (Reel) obj;
            return new Reel(this.x - r.x);
        }
        return null;
	}
	public double plus (double y) {
		 return this.x - y;
		
	}
	
}
