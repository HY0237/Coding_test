package ������;

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
        int i; // [3] ������ ���������� ����

        // [1] �� �迭�� ������������ ����
        Arrays.sort(participant); // {"leo", "kiki", "eden"}; => {eden, kiki, leo}
        Arrays.sort(completion); // {"eden", "kiki"}; => {eden, kiki}

        // [2] ���ĵ� �迭�� �տ������� ���ؼ�, �޶����� ����(�������� ���� ���� �߰�) ������ �̸� ����
        // completion�� �� ��ŭ ���ؾ� index out ������ �ȳ�
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                answer = participant[i];
            }
        }
    answer= participant[i]; 
    return answer;
        // [3] �������� ���� ������ ���� ���� �ִ� ���
    }
	
	
	

}
