import java.awt.Point;

public class NewPoint {
	Point p;
	NewPoint gauche;
	NewPoint droit;
	
	public NewPoint() {
		super();
	}
	
	public NewPoint(Point p, NewPoint gauche, NewPoint droit) {
		super();
		this.p = p;
		this.gauche = gauche;
		this.droit = droit;
	}
	public Point getValue() {
		return p;
	}
	public void setValue(Point p) {
		this.p = p;
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
