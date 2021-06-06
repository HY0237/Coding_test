package 마라톤;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solution {

	public static void main(String[] args) {
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		System.out.print(solution(participant, completion));
		

	}
	
	public static boolean isContain(String a, List<String> list) {
		for(int i =0 ;i < list.size(); i++) {
			if(list.get(i).equals(a)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        List<String> list = new ArrayList<String>();
        
        for(int j = 0; j < completion.length; j++) {
        	list.add(completion[j]);
        }
         
        for(int i =0; i < participant.length; i++) {
        	if(isContain(participant[i], list)) {
        		list.remove(participant[i]);
        	}else {
        		answer = participant[i];
        	}
        }
        
        return answer;
    }
	
    public String solution1(String[] participant, String[] completion) {
    	String answer = "";
        int i; // [3] 때문에 전역변수로 선언

        // [1] 각 배열을 오름차순으로 정렬
        Arrays.sort(participant); // {"leo", "kiki", "eden"}; => {eden, kiki, leo}
        Arrays.sort(completion); // {"eden", "kiki"}; => {eden, kiki}

        // [2] 정렬된 배열을 앞에서부터 비교해서, 달라지는 순간(완주하지 못한 선수 발견) 참가자 이름 리턴
        // completion의 수 만큼 비교해야 index out 에러가 안남
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                answer = participant[i];
            }
        }
    answer= participant[i]; 
    return answer;
        // [3] 완주하지 못한 선수가 가장 끝에 있는 경우
    }
	
	
	

}
