package pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public abstract class Temps  {
 String name;
 float degree;
 List<IObserver> observateurs= new ArrayList<IObserver>();
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getDegree() {
	return degree;
}
public void setDegree(float degree) {
	this.degree = degree;
}

public void register (IObserver obser) {
	observateurs.add(obser);
}

public void unregister(IObserver obser) {
	
	observateurs.remove(obser);
}
public void notifier() {
	ListIterator <IObserver> it =observateurs.listIterator();
	
	while(it.hasNext()) {
		IObserver obser= it.next();
		obser.update(this);
	}
	}
	
}
