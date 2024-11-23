package tp5;

public class Fiscalité {

	public static void main(String[] args) {
		 Personne p1 = new Personne(1, "mohamedali", "Ben ahmed");
	     Personne p2 = new Personne(2, "fadi", "naffeti");
	     Personne p3 = new Personne(3, "aymen", "naffeti");
	        Lotissement lotissement = new Lotissement(10);
	        lotissement.ajouter(new Proprieteprivee(1, p1, 350, "Corniche", 4));
	        lotissement.ajouter(new Villa(2, p2, 400, "Dar Chaabane", 6, true));
	        lotissement.ajouter(new Appartement(3, p2, 1200, "Hammamet", 8, 3));
	        lotissement.ajouter(new Proprieteprofessionnelle(4, p3, 1000, "Korba", 50, true));
	        lotissement.ajouter(new Proprieteprofessionnelle(5, p1, 2500, "Bir Bouragba", 400, false));

	        System.out.println("Liste des proprietes");
	        lotissement.afficherProprietes();
	        System.out.println("Nombre total de pieces : " + lotissement.getNbPieces());
	        Personne p11 = new Personne(1, "Mohamed Ali", "Ben Ahmed");
	        Personne p22 = new Personne(2, "Fadi", "Naffeti");
	        Lotissement lt= new Lotissementprivee(10);
	        System.out.println("//lotissemntprivee//");
	        lt.ajouter(new Proprieteprivee(1, p11, 250, "Nabeul", 4));
	        lt.ajouter(new Villa(2, p22, 500, "Mrezga", 6, true));
	        lt.ajouter(new Appartement(3, p22, 1200, "Hammamet", 5, 3));
	        lt.afficherProprietes();

	}

}
