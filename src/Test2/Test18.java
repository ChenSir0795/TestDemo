package Test2;

public class Test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=null,b=null,c=null;
		String[] racer= {"x","y","z"};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
					if(i!=j&&i!=k&&j!=k) {
						a=racer[i];
						b=racer[j];
						c=racer[k];
						if(!a.equals("x")&&!c.equals("x")&&!c.equals("z")) {
							if(a.equals(racer[i])&&b.equals(racer[j])&&c.equals(racer[k])) {
								System.out.println("a的对手是："+racer[i]+"  b的对手是："+racer[j]+"  c的对手是："+racer[k]);
							}
						}
					}
				}
			}
		}
	}

}
