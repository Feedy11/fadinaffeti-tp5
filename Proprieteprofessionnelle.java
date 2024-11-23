package tp5;

public class Proprieteprofessionnelle extends Propriete {
    private int nbemploye;
    private boolean estetatique;

    public Proprieteprofessionnelle(int id, Personne responsable, double surface, String adresse, int nbemploye, boolean estetatique) {
        super(id, responsable, surface, adresse);
        this.nbemploye = nbemploye;
        this.estetatique = estetatique;
    }

    @Override
    public String toString() {
        return "Proprieteprofessionnelle [nbemploye=" + nbemploye + ", estetatique=" + estetatique + ", id=" + id
                + ", responsable=" + responsable + ", surface=" + surface + ", adresse=" + adresse + "]";
    }

    @Override
    public double calculImpot() {
        if (estetatique) return 0;
        return (100 * (surface / 100)) + (30 * nbemploye);
    }

}

