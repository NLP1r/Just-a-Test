package cba.test;//打包语句
//测试递归算法
/**
 * 测试了递归算法，写了阶乘的例子
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
		if(a<=10){//递归头
			test01();
		}else{//递归体
			System.out.println("over");
		}
		
	}
	public static void test02(){
		System.out.println("testrecursion.test02()");
	}
	/**
	 * 计算叉叉叉
	 * @param n阶乘的最大数
	 * @return 阶乘大的结果值
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
