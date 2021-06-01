package 소수;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		int[] arr = {1, 2, 7, 6, 4};
		boolean[] visited = new boolean[arr.length];
		comb(arr, visited, 0, 3);
		System.out.println(solution(arr));
		
	}
		
	 public static boolean isPrime(int n) {
	      for (int i = 2; i*i <= n; i++) {
	            if (n % i == 0) return false;
	        }
	        return true;
	 }

	 public static int solution(int[] nums) {
	        int answer = 0;

	        // 세 수의 합 구하기
	        for (int i = 0; i < nums.length; i++) {
	            for (int j = i+1; j < nums.length; j++) {
	                for (int k = j+1; k < nums.length; k++) {
	                    int sum = nums[i] + nums[j] + nums[k];
	                    if (isPrime(sum)) answer++;
	                }
	            }
	        }

	        return answer;
	    }

    public static void comb(int[] nums, boolean[] visited, int start, int r) {
    	
    	 List<Integer> list = new ArrayList<Integer>();
    	 int a =0 ;
        if(r == 0) {
        	for(int i = 0; i < nums.length; i++) {
        		if(visited[i] == true)
        			a = a + nums[i];
        	}
    		for(int i = 2; i < a; i++) { 
    			if(a % i == 0) {
    				return;
    			}
    		}
    		System.out.println(a + " 소수");
   
        }else {
        for(int i = start; i < nums.length; i++) {
        	visited[i] = true;
        	comb(nums, visited, i+1, r-1);
        	visited[i] = false;
   
        	}
        }


    }

}
