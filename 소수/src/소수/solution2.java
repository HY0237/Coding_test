package ¼Ò¼ö;

public class solution2 {
	
	
    public static void main(String[] args){
    	  
    	int[]  a = {1,2,7,6,4};
    	System.out.print(solution(a));
    }
    
    public static boolean isPrime(int results){
        for(int x = 2; x*x <= results; x++){
            if(results%x == 0){
                    return false;
             }
        }
                    return true;
    }
    
    public static int solution(int[] nums) {
        int answer = 0;
        int results;

        for(int i = 0; i < nums.length; i ++){
            for(int j = i +1; j <nums.length; j++){
                for(int w = j +1; w < nums.length; w++){
                    results = nums[i] + nums[j] + nums[w];
                    if(isPrime(results)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

}
