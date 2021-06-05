package 크레인인형;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class solution {
	
    public static void main(String[] args){
  	  
    	int[][] a = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
    	int[] b = {1,5,3,5,1,2,1,4};
    	
    	System.out.print(solution(a, b));
    }
    
    public int solution1(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][move - 1] != 0) {
                    if (stack.isEmpty()) {
                        stack.push(board[j][move - 1]);
                        board[j][move - 1] = 0;
                        break;
                    }
                    if (board[j][move - 1] == stack.peek()) {
                        stack.pop();
                        answer += 2;
                    } else
                        stack.push(board[j][move - 1]);
                    board[j][move - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
    
    
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i < moves.length; i ++) {
        	for(int j =0; j <5; j ++) {
        		if(board[j][moves[i]-1] > 0) {
        	    	if(list.size() < 1) {
        	    		list.add(board[j][moves[i]-1]);
        	    	}else {
        	    		if(list.get(list.size()-1) == board[j][moves[i]-1]) {
        	    			list.remove(list.size()-1);
        	    			answer += 2;
        	    		}else {
        	    			list.add(board[j][moves[i]-1]);
        	    		}
        	    	}
        			board[j][moves[i]-1] = 0;
        			break;
        		}
        	}
        }
        
        
        return answer;
    }


}
