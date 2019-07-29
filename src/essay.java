package pack1;

public class essay {

	public static void main(String[] args) {
		
		
		Temps S= new Temperature();
		Temps R=new Humidite();
		Temps T=new Both();
		Ecran E= new Ecran();
		S.register(E);
		R.register(E);
	    T.register(E);
		R.notifier();
		S.notifier();
		T.notifier();
		
		}

}
