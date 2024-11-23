package tp5;

public class Appartement extends Proprieteprivee{
private int numetage ;

public Appartement(int id, Personne responsable, double surface,String adresse, int nbpiece, int numetage) {
	super(id, responsable, surface,adresse,nbpiece);
	this.numetage = numetage;
}

@Override
public String toString() {
	return "Appartement [numetage=" + numetage + "]";
} 

}
