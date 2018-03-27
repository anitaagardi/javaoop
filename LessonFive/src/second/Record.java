package second;

public class Record {
	private String performer;
	private String title;
	private int length;

	public Record(String performer, String title, int length) {
		super();
		this.performer = performer;
		this.title = title;
		this.length = length;
	}
	public String getDetails(){
		return performer+": "+title+" "+length+" minute";
	}
	public int isLonger(Record rec){
		if(length>rec.length){
			return 1;
		}
		if(length==rec.length){
			return 0;
		}
		return -1;
	
	}
	public boolean isPerformer(String performer){
		//equals return true or false
		return this.performer.equals(performer);	
	}
	public String getPerformer() {
		return performer;
	}
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	
	
	
	
	
}
