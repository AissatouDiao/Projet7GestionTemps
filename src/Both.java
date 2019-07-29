package pack1;

public class Both extends Temps{
     Temps A=new Humidite();
     Temps B=new Temperature();
     String message;
	float D=A.getDegree();
	float F=B.getDegree();
	float z=2*D+3*F;
	
	public Both() {
		this.setName("Fonction plus c'est à dire 2*temperature + 3*humidite ");
		this.setDegree(z);
	    this.notifier();
	}  
	
	
	
	
 
}
