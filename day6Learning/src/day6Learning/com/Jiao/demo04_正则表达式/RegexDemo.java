package day6Learning.com.Jiao.demo04_正则表达式;
/*
 * 正则表达式：
 * 	不是java的，是所有编程语言基本都会支持的
 * 1.正则表达式是什么？
 * 	是一个字符串，“正则表达式内容”
 * 	“普通的字符串”：里面的内容就是内容
 * 	“正则表达式内容”：里面写了规则
 * 普通字符串仅仅表达内容，而正则表达式表示规则
 * 2.正则表达式有什么用？
 * 	用来匹配普通字符串的
 * 	boolean b = “普通字符串”匹配“正则表达式”；
 * 3.代码实现：
 * 	在String类中
 * 	public boolean matches(String regex)
 * 	boolean b = "普通字符串".matches("正则表达式");
 * 4.练习1：校验qq号码
 * 	  练习2：校验手机号码
 * 5.书写正则表达式的技巧：正则表达式需要一位一位的判断
 * 6.在String类中有一个方法
 * 		public String[] split(String regex);//切割字符串，返回切割后的字符串数组
 * 
 */
public class RegexDemo {
	public static void main(String[] args) {
		System.out.println(phoneNumber("18465685555"));
		split02();
		
	}
	/*
	 * qq号码需满足的规则：
	 * 1.0-9的数字
	 * 2.开头必须是1-9中的一个数字
	 * 3.位数必须5-12位
	 */
	public static boolean qq(String qq) {
		boolean b = qq.matches("[1-9][0-9]{4,11}");
		return b;
	}
	/*
	 * 校验手机号码：
	 * 1.要求为11位0-9的数字
	 * 2.第1位为1，第2位为3、4、5、7、8中的一个，后面9位为0-9之间的任意数字
	 */
	public static boolean phoneNumber(String pN) {
		return pN.matches("1[34578][0-9]{9}");
	}

	/*
	 * 案例：切割电话
	 */
	public static void split01() {
		String str = "1-452-51---152";
		//切割phoneNumber，把号码切割出来
		//“+”在正则表达式中表示一个或多个
		String[] pN = str.split("-+");
		for(int i = 0;i<pN.length;i++) {
			System.out.println(pN[i]);
		}
		
	}
	/*
	 * 案例：切割ip
	 */
	public static void split02() {
		String ip = "198.168.123.110";
		//“.”在正则表达式中表示任意字符
		//转译字符
		//\t  水平制表符
		//\n  换行符
		//\r  回车符
		//在正则表达式中“\\”代表一个“\”
		String[] ipStrings = ip.split("\\.");
		for(int i = 0;i<ipStrings.length;i++) {
			System.out.println(ipStrings[i]);
		}
	}
}
