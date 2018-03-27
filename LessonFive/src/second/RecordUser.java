package second;

import java.util.Scanner;

public class RecordUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The number of records :");
		int recordNumber=0;
		Scanner in=new Scanner(System.in);
		recordNumber=in.nextInt();
		Record[] records=new Record[recordNumber];
		System.out.println("The details of records: ");
		for(int i=0;i<records.length;i++){
			System.out.println("The performer: ");
			String performer=in.next();
			System.out.println("The title:");
			String title=in.next();
			System.out.println("The length:");
			int length=Integer.parseInt(in.next());
			records[i]=new Record(performer,title,length);
		}
		int longestRecordIndex=0;
		for(int i=0;i<records.length;i++){
			if(records[i].isLonger(records[longestRecordIndex])==1){
				longestRecordIndex=i;
			}
		}
		System.out.println("The longest record's details:"+records[longestRecordIndex].getDetails());
		System.out.println("The permormer:");
		String performer=in.next();
		for(int i=0;i<records.length;i++){
			if(records[i].isPerformer(performer)){
				System.out.println("The record's details:"+records[i].getDetails());
			}
		}

	}

}
