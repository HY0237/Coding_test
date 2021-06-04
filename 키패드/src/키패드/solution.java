package Å°ÆÐµå;

public class solution {
	
    public static void main(String[] args){
  	  
    	int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    	String hand = "right";
    	System.out.print(solution(a, hand));
    }
    
    
    public static int getDistance(int position1, int position2) {
    	int p1x = 0;
    	int p2x = 0;
    	int p1y = 0;
    	int p2y = 0;
    	
    	
    	if(position1 == 3 || position1 == 6 || position1 == 9 || position1 == 12) {
    		p1x = position1/3-1;
    		p1y = position1%3 + 3;
    	}else {
    		p1x = position1/3;
    		p1y = position1%3;
    	}
    	
    	if(position2 == 3 || position2 == 6 || position2 == 9 || position2 == 12) {
    		p2x = position2/3-1;
    		p2y = position2%3 + 3;
    	}else {
    		p2x = position2/3;
    		p2y = position2%3;
    	}
    	
    	
    	return (int)(Math.abs(p1x-p2x) + Math.abs(p1y-p2y));
    }
    
    public static String solution(int[] number, String hand) {
    	
    	String answer ="";
    	int Lposition = 10;
    	int Rposition = 12; 
    	int Ldistance =0, Rdistance =0;
    	
    	
    	for(int i =0; i< number.length; i++) {
    		
    		if(number[i] == 1 || number[i] ==4 || number[i] ==7) {
    			Lposition = number[i];
    			answer += "L";
    		}else if(number[i] == 3 || number[i] == 6 || number[i] == 9) {
    			Rposition = number[i];
    			answer += "R";
    		}else {
    			
    			if(number[i] == 0) {
    				number[i] = 11;
    			}
    			
    			Ldistance = getDistance(Lposition, number[i]);
    			Rdistance = getDistance(Rposition, number[i]);
    			
    			if(Ldistance > Rdistance) {
    	 			Rposition = number[i];
        			answer += "R";
    			}else if(Ldistance < Rdistance){
    				Lposition = number[i];
        			answer += "L";		
    			}else if(Ldistance == Rdistance) {
    				if(hand.equals("right")) {
    					Rposition = number[i];
            			answer += "R";
    				}else {
    					Lposition = number[i];
            			answer += "L";
    				}
    			}
    			
    			
    		}
    	}
    	
    	
		return answer;
    	
    }

}
