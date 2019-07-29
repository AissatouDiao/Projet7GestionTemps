package pack1;

public class Ecran implements IObserver{

	public void update(Temps temps) {
		// TODO Auto-generated method st
		
	
	System.out.println("la nouvelle valeur de " +temps.getName()+" est "+temps.getDegree());
	}
  
}
