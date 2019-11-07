import java.util.ArrayList;

public class Main {

	
	public static void main(String[] args) {
		ArrayList<NewPoint> list = new ArrayList<NewPoint>();
		NewPoint droit = new NewPoint(3,null,null);
		NewPoint gauche = new NewPoint(1,null,null);
		NewPoint racine = new NewPoint(2,gauche,droit);
		list.add(racine);
		list.add(gauche);
		list.add(droit);
		
		for(NewPoint p : list) {
			String str =" point:";
		    str += p.getValue();
		    if(p.getGauche()!=null) {
				str +=", child gauche :"+p.getGauche().getValue();
			}else {
				str +=",don't have child gauche ";
			}
			if(p.getDroit()!=null) {
				str +=", child droit :"+p.getDroit().getValue();
			}else {
				str +=",don't have child droit ";
			}
			System.out.println(str);
		}

	}

}
