package tp5;

import java.util.Objects;

abstract public class Propriete {
    protected int id; 
    protected Personne responsable;
    protected double surface;
    protected String adresse;

    public Propriete(int id, Personne responsable, double surface, String adresse) {
        this.id = id;
        this.responsable = responsable;
        this.surface = surface;
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Propriete [id=" + id + ", responsable=" + responsable + ", surface=" + surface + ", adresse=" + adresse + "]";
    }

    abstract public double calculImpot();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Personne getResponsable() {
        return responsable;
    }

    public void setResponsable(Personne responsable) {
        this.responsable = responsable;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Propriete other = (Propriete) obj;
		return Objects.equals(adresse, other.adresse) && id == other.id
				&& Objects.equals(responsable, other.responsable)
				&& Double.doubleToLongBits(surface) == Double.doubleToLongBits(other.surface);
	} 
    
}
