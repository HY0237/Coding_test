package Æ÷ÄÏ¸ó;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class solution {
	
	
	
    public static void main(String[] args){
  	  
    	int[]  a = {3,3,3,2,2,2};
    	System.out.print(solution(a));
    }
	
    public static int solution(int[] nums) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<nums.length; i++)
			if(!list.contains(nums[i]))	
				list.add(nums[i]);	
        
        HashSet<Integer> hs = new HashSet<>();

        for(int i =0; i<nums.length;i++) {
            hs.add(nums[i]);
        }
        
        
        if(list.size() > (nums.length/2) ) {
        	answer = nums.length/2;
        }else {
        	answer = list.size();
        }
        


        return answer;
    }

}
