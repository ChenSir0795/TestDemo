package Test1;
class Mythr2 implements Runnable{
public void run(){
           System.out.print(" thread ");
    }}
public class Thr2 {
    public static void main(String[] args) {
       // TODO 自动生成的方法存根
       Mythr2  t20=new Mythr2();
       Thread  t30=new Thread(t20);
       t30.start();
       }}