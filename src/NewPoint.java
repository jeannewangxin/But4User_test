import java.awt.Point;

public class NewPoint {
	int value;
	NewPoint gauche;
	NewPoint droit;
	
	public NewPoint() {
		super();
	}
	
	public NewPoint(int value, NewPoint gauche, NewPoint droit) {
		super();
		this.value = value;
		this.gauche = gauche;
		this.droit = droit;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public NewPoint getGauche() {
		return gauche;
	}
	public void setGauche(NewPoint gauche) {
		this.gauche = gauche;
	}
	public NewPoint getDroit() {
		return droit;
	}
	public void setDroit(NewPoint droit) {
		this.droit = droit;
	}
}
