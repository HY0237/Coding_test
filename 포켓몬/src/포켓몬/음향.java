package 포켓몬;

public class 음향 {

		public static void main(String[] args){
	    	  
	    	int[]  a = {4,7,12};
	    	boolean[] signs = {true, false, true};
	    	
	    	System.out.print(solution(a, signs));
	    }
	    public static int solution(int[] absolutes, boolean[] signs) {
	        int answer = 0;
	        
	        for(int i = 0; i < absolutes.length; i ++){
	            if(signs[i]){
	                answer += absolutes[i];
	            }else{
	                answer -= absolutes[i];
	            }
	        }
	        return answer;
	    }

}
