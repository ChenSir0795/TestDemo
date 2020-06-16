package Test1;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] answers= {
				 { 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				 { 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
				 { 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'E' },
				 { 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
				 { 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' } };
	 char[] keys = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };
		
		for(int i=0;i<answers.length;i++) {
			int correctcount=0;
			int falsecount=0;
			for(int j=0;j<answers[i].length;j++) {
				if(answers[i][j]==keys[j]) {
					correctcount++;
				}else
					falsecount++;
			}
			System.out.println("学生"+(i+1)+"答对的个数为："+correctcount+"个"+" "+"错了"+(falsecount++)+"个");
			//System.out.println("学生"+(i+1)+"答错的个数为："+(falsecount++)+"个");
		}
		
	}

}
