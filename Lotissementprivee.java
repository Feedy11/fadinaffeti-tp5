package tp5;

public class Lotissementprivee extends Lotissement {

    public Lotissementprivee(int max) {
        super(max);
    }

    @Override
    public boolean ajouter(Propriete p) {
        if (p instanceof Proprieteprivee) {
            return super.ajouter(p);
        } 
        System.out.println("Erreur!!seules les proprietes privees sont autorisées.");
        return false;
    }

    public Proprieteprivee getProprieteByIndice(int i) {
        if (i >= 0 && i < nombre && tabProp[i] instanceof Proprieteprivee) {
            return (Proprieteprivee) tabProp[i];
        } else {
            System.out.println("Erreur : index invalide ou type incorrect.");
            return null;
        }
    }

    public int getNbPieces() {
        int somme = 0;
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i] instanceof Proprieteprivee) {
                somme += ((Proprieteprivee) tabProp[i]).getNbpiece();
            }
        }
        return somme;
    }
}
