package 모의고사;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class solution {
	
    public static int[] solution(int[] answers) {
    	
        int[] person1 = {1,2,3,4,5};
        int[] person2 = {2,1,2,3,2,4,2,5};
        int[] person3 = {3,3,1,1,2,2,4,4,5,5};
        
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        
        for(int i = 0; i < answers.length; i++) {
        	
        	if(answers[i] == person1[i%5])p1++;
        	if (answers[i] == person2[i%8])p2++;
        	if (answers[i] == person2[i%10])p3++;
        	
        }
        int max = Math.max(p1, Math.max(p2, p3));
        
        List<Integer> list = new ArrayList<Integer>();
        
        if(max == p1)
            list.add(1);
        if(max == p2)
            list.add(2);
        if(max == p3)
            list.add(3);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
       
        return answer;
        
 
        /**
        if(p1 > 0) {
        	list.add(p1);
        }
        if (p2 > 0) {
        	list.add(p2);
        }
        if (p3 > 0) {
        	list.add(p3);
        }
        	
        Collections.sort(list, Collections.reverseOrder());   
        
        int[] answer = new int[list.size()];
        
        if (list.get(0) == 0) {
        	return answer;
        }else {
        for(int i = 0; i < list.size(); i++) {
        	if(list.get(i) == p1) {
        		answer[i] = 1;
        	}else if(list.get(i) == p2) {
        		answer[i] = 2;
        	}else if(list.get(i) == p3) {
        		answer[i] = 3;
        	}
        }
        return answer;
        
        }
        **/

    }
    
    public static void main(String[] args){
  	  
    	int[] answers = {1,3,2,4,2};
    	int[] a= solution(answers);
    	for(int i=0; i < a.length; i++) {
    		System.out.print(a[i] + ", ");
    	}
  
  }

}
