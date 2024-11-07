package com.example.demo;

public class Question {
	
	public int[] multipleSorted(int[] no) {
		int len=no.length;
		int[] ans = new int[len];
		ans[0]=1;
		for(int i=1;i< len;i++) {
			
			ans[i] =ans[i-1] * ans[i-1];
		}
		
		int count=1;
		
		for(int j= len - 1; j >= 0; j--) {
			ans[j] *=count;
			count *=no[j];
			
		}
		return ans;
	}
	public String closeChar(StringBuilder s) {
		
		StringBuilder sAll = new StringBuilder(s);
		
		for(char data:sAll.toCharArray()) {
			if(data == "*") {
				sAll.deleteChar(sAll.length()-1);
			}else {
				sAll.append(data);
			}
		}
		return sAll.toString();
		
		
	}
	
	
	public static void main() {
		Question q=new Question();
		int[] no= {1,2,3,4};
		int[] allNo= q.multipleSorted(no);
		System.out.print(allNo.toString());
		
		StringBuilder s = new StringBuilder("leet**cod*e");
		   String charData=q.closeChar(s);
		   System.out.print(charData);
		
	}
	
	
	

}
