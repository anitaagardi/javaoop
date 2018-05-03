package first.prisms;

import first.Cylinder;
import first.Prism;

public class Prisms {
	private Prism[] prismArray;

	public Prisms(int max) {
		super();
		this.prismArray = new Prism[max];
	}

	public void setArrayElements(int index, Prism p) {
		prismArray[index] = p;
	}
	
	public int getSize(){
		return prismArray.length;
	}
	public Prism getValueFromIndex(int index){
		return prismArray[index];
	}
	public int getNotNullNum(){
		int count=0;
		for(int i=0;i<prismArray.length;i++){
			if(prismArray[i]!=null){
				count++;
			}
		}
		return count;
	}
	
	public double getAverageSurface(){
		double averageSurface=0;
		for(int i=0;i<prismArray.length;i++){
			if(prismArray[i]!=null){
				averageSurface+=prismArray[i].getSurface();
			}
		}
		return averageSurface/getNotNullNum();
	}
	public int getCylinderNum(){
		int count=0;
		for(int i=0;i<prismArray.length;i++){
			if(prismArray[i].getClass()==Cylinder.class){
				count++;
			}
		}
		return count;
	}
	
	
}
