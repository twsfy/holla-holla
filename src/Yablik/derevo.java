package Yablik;

public class Derevo {
	private Yabloko[] yabloki;
	
	public void grow(int count){
		System.out.println("Increased - "+count+" yabloki");
		setYabloki(count);
	}
	
	public void shake(int count){
		System.out.println("Shaked - "+count+" yabloki");
		setYabloki(count);
	}

	public void setYabloki(int count) {
		for(int i=0; i<count; i++){
			yabloki = new Yabloko[count];
			yabloki[i] = new Yabloko();
		}
	}
	
}
