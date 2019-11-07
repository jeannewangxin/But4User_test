 import java.awt.Point;
import java.util.ArrayList;

public class Main {

	
	public static void main(String[] args) {
		ArrayList<NewPoint> list = new ArrayList<NewPoint>();
		ArrayList<Arrete> arretes = new ArrayList<Arrete>();
		Point r = new Point(100,200);
		Point g = new Point(150,200);
		Point d = new Point(100,250);
		NewPoint droit = new NewPoint(d,null,null);
		NewPoint gauche = new NewPoint(g,null,null);
		NewPoint racine = new NewPoint(r,gauche,droit);
		list.add(racine);
		list.add(gauche);
		list.add(droit);
		
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				double dist = list.get(i).getValue().distance( list.get(j).getValue());
				Arrete arrete = new Arrete(list.get(i),list.get(j),dist);
				arretes.add(arrete);
			}
		}
		
		for(NewPoint p : list) {
			String str =" point (" +p.getValue().x+","+p.getValue().y+"):";
		    if(p.getGauche()!=null) {
				str +=" child gauche : ("+p.getGauche().getValue().x+","+p.getGauche().getValue().y+");";
			}else {
				str +="don't have child gauche ";
			}
			if(p.getDroit()!=null) {
				str +=" child droit :"+p.getDroit().getValue().x+","+p.getDroit().getValue().y+");";
			}else {
				str +="don't have child droit ";
			}
			System.out.println(str);
		}
		
		Graphe graph = new Graphe(list,arretes); 

	}

}


