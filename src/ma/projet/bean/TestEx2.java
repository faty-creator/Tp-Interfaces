package ma.projet.bean;

public class TestEx2 {
	 public static void main(String[] args) {
	        
	        Complexe c1 = new Complexe(4, 3);
	        Complexe c2 = new Complexe(2, -1);

	        Complexe add = (Complexe) c1.plus(c2);
	        Complexe sous = (Complexe) c1.moins(c2);

	        System.out.println("Addition des complexes : " + add.affiche());
	        System.out.println("Soustraction des complexes : " + sous.affiche());

	        Reel r1 = new Reel(5.5);
	        Reel r2 = new Reel(2.5);

	        Reel addR = (Reel) r1.plus(r2);
	        Reel sousR = (Reel) r1.moins(r2);

	        System.out.println("Addition des réels : " + addR.affiche());
	        System.out.println("Soustraction des réels : " + sousR.affiche());


//	        System.out.println("Surcharge plus : " + r1.plus(10.0));
//	        System.out.println("Surcharge moins : " + r1.moins(3.0));
}
}
