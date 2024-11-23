package tp5;

public interface GestionPropriete {
	int Max_prop = 100; 
	public abstract void afficherProprietes();
	public abstract boolean ajouter(Propriete p);  
	public abstract boolean supprimer(Propriete p);
}
	