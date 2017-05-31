public class PatternAlpha {
	public static void main(String[] args) {
		//outer loop to go 3 times
		for(int i =1;i<=3;i++){			//for spaces
			for(int j = 1; j <= Math.abs((3-i) % 3); j++){
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++){
		    	System.out.print((char) (97+j));
		    }
		    for(int j = (i-1); j > 0; j--){
		    	System.out.print((char) (96+j));
		    }
		    System.out.println(" ");
		}
		//outer loop to go 2 times
		for(int i =2; i >= 1; i--){
			for(int j=1; j <= Math.abs((3-i) % 3); j++){
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++){
				System.out.print((char) (97+j));
			}
			for(int j = (i-1); j > 0; j--){
				System.out.print((char) (96+j));
			}
			System.out.println(" ");
		}
	}
}