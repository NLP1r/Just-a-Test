package cba.test;//������
//���Եݹ��㷨
/**
 * �����˵ݹ��㷨��д�˽׳˵�����
 * @author admin
 *@version 1.0
 *
 */


public class testrecursion {
	static int a = 0;
	/**
	 * ceshisss
	 */
	public static void test01(){
		a++;
		System.out.println("ttt:"+a);
		if(a<=10){//�ݹ�ͷ
			test01();
		}else{//�ݹ���
			System.out.println("over");
		}
		
	}
	public static void test02(){
		System.out.println("testrecursion.test02()");
	}
	/**
	 * �������
	 * @param n�׳˵������
	 * @return �׳˴�Ľ��ֵ
	 */
	public static long fac(int n){
		if(n==1){
			return 1;
		}else{
			return n*fac(n-1);
		}
	}
	
	public static void main(String[] args){
		test01();
	System.out.println(fac(5));
	}

}
