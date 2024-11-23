package tp5;

public class Villa extends Proprieteprivee {
    private boolean avecPiscine;
    
    public Villa(int id, Personne responsable, double surface, String adresse, int nbpiece, boolean avecPiscine) {
    	super(id, responsable, surface, adresse,nbpiece);
        this.avecPiscine = avecPiscine;	
    }
    @Override
    public String toString() {
        return super.toString() + ", Villa [avecPiscine=" + avecPiscine + "]";
    }

    @Override
    public double calculImpot() {
        double impot = super.calculImpot();
        if (avecPiscine) {
            impot += 200;
        }

        return impot;
    }
}
