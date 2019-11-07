
public class Arrete {
	NewPoint begin;
	NewPoint end;
	double distance;
	
	public Arrete() {
		super();
	}
	
	public Arrete(NewPoint begin, NewPoint end, double distance) {
		super();
		this.begin = begin;
		this.end = end;
		this.distance = distance;
	}

	
	public NewPoint getBegin() {
		return begin;
	}
	public void setBegin(NewPoint begin) {
		this.begin = begin;
	}
	public NewPoint getEnd() {
		return end;
	}
	public void setEnd(NewPoint end) {
		this.end = end;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
}
