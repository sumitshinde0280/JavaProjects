package demo;

public class StarLoop {
	
	public static void main(String[] args) {
		//int k=0;
		for(int i=1;i<=5;i++){ 
			//int k=1;
			for(int j=1;j<=9;j++){
				if(j>=6-i && j<=4+i )
				{
					System.out.print("   ");
				//k=0;
				}
				else{
					System.out.print(" * ");
				//k=1;
			}
			}
		System.out.println("");
	}
		
	}
}
