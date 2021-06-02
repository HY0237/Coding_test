package Ã¼À°º¹;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		int[] lost = {3};
		int[] reserve = {1};
		
		int a = solution(3, lost, reserve);
		System.out.println(a);
		

	}
	
	public int Solution(int n, int[] lost, int[] reserve) {
		int[] all = new int[n];

		for (int i : reserve)
			all[i - 1]++;

		for (int i : lost)
			all[i - 1]--;

		for (int i = 0; i < all.length; i++)
			if (all[i] < 0)
				if (i != all.length - 1 && all[i + 1] > 0) {
					all[i]++;
					all[i + 1]--;
				} else if (i != 0 && all[i - 1] > 0) {
					all[i]++;
					all[i - 1]--;
				}

		int answer = 0;

		for (int i = 0; i < all.length; i++)
			if (!(all[i] < 0))
				answer++;

		return answer;
	}
	
    public static int solution(int n, int[] lost, int[] reserve) {
    	int answer =0;
        int a = 0;

        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < lost.length;  i++) {
        	for(int j=0; j < reserve.length; j++) {
        		if(reserve[j] + 1 == lost[i] || reserve[j] - 1 == lost[i]) {
        			if(list.size() == 0) {
        				System.out.println(lost[i]+","+reserve[j]);
            			list.add(lost[i]);
            			list.add(reserve[j]);
            			a++;
            			break;
        			}
        		
        			if(list.contains(lost[i]) || list.contains(reserve[j])) {
        				break;
        			}else{
                		System.out.println(lost[i]+", "+reserve[j]);
                		list.add(lost[i]);
                		list.add(reserve[j]);
                		a++;
        			}
        

        		}
        	}
        }
    
        answer = n-lost.length+a;

        return answer;
    }
    

}
