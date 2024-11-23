package tp5;

public class Proprieteprivee extends Propriete {
    protected int nbpiece;

    public Proprieteprivee(int id, Personne responsable, double surface, String adresse ,int nbpiece) {
        super(id, responsable, surface, adresse);
        this.nbpiece = nbpiece;
    }

    public int getNbpiece() {
		return nbpiece;
	}

	public void setNbpiece(int nbpiece) {
		this.nbpiece = nbpiece;
	}

	@Override
    public String toString() {
        System.out.println(getClass().getSimpleName());
        return "Proprieteprivee [nbpiece=" + nbpiece + ", id=" + id + ", responsable=" + responsable + ", adresse=" + adresse + ", surface=" + surface + "]";
    }

    public double calculImpot() {
        double s = surface / 100;
        return (50 * s) + (10 * nbpiece);
    }
}
