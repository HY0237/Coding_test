package 신규아이디;

public class solution {
	
    public static void main(String[] args){
    	  
    	String a = "...!@BaT#*..y.abcdefghijklm";
    	System.out.print(solution(a));
    }
 


	private static String solution(String new_Id) {
				
        
		new_Id = new_Id.toLowerCase();
		new_Id = new_Id.replaceAll("[^a-z\\d\\-_.]", "");
		new_Id = new_Id.replaceAll("[.]{2,}", ".");
		new_Id = new_Id.replaceAll("^[.]|[.]$", "");
		if(new_Id.isEmpty()) {
			new_Id = new_Id + "a";
		}
		if(new_Id.length() >= 16) {
			new_Id = new_Id.substring(0,15);
			
		}
		new_Id = new_Id.replaceAll("^[.]|[.]$", "");
		
		while(new_Id.length() <= 2) {
			
			if(new_Id.length() == 0) {
				new_Id = new_Id + new_Id.substring(new_Id.length());
			}else {
			new_Id = new_Id + new_Id.substring(new_Id.length()-1);
			}
		}

    	return new_Id;
    	
    	
    }
    	
	
	

}
