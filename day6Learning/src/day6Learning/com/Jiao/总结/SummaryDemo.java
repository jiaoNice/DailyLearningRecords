package day6Learning.com.Jiao.总结;
/*
 * 1.Date类：
 * 	构造：
 * 		public Date();//代表当前系统时间的Date对象
 * 		public Date(long time);//代表距离标准时间time毫秒值的Date对象
 * 	成员方法：
 * 		public String toString();//Date重写Object类的toString方法
 * 		public long getTime();//获取当前Date对象的毫秒值
 * 2.DateFormat：日期格式化类，他是一个抽象类
 * 	具体的子类：SimpleDateFormat
 * 	构造：
 * 		public SimpleDateFormat(String pattern);//以指定的模式创建格式化对象
 * 	成员方法：
 * 		public String format(Date d);//把Date对象按照指定的模式转成字符串
 * 		public Date parse(String s);//把字符串转成Date对象，如果字符串有问题，则会抛出ParseException异常
 * 3.Calendar：日历类
 * 	3.1获取Calendar对象
 * 		public static Calendar getInstance();//返回的是抽象类Calendar的某一个子类
 * 	3.2成员方法
 * 		pubic int get(int field);//获取指定字段的值
 * 		public void add(int field,int amount);//给指定的字段增加值
 * 		public void set(int field,int value);//修改指定字段的值
 * 		public Date getTime();//把Calendar对象转成Date对象
 * 4.System：系统类
 * 		public static void exit(0);//结束SVM
 * 		public static void gc();//通知垃圾回收器过来收垃圾
 * 		public static getProperty(String key);//根据键 获取值
 * 		public static long currentTimeMillis();//获取当前系统的毫秒值
 * 5.Math:数学类
 * 	1.求最大值 max  2.求最小值min  3.求绝对值abs
 * 	4.求随机数random  5.求四舍五入round  6.向上取整ceil
 * 	7.向下取整floor  8.求次幂pow
 * 6.基本数据类型包装类
 * 	（8种基本类对应的包装类型）
 * 	（自动拆箱装箱）
 * 7.正则表达式
 * 	boolean b = “普通字符串”.matches（“正则表达式”）；//判断字符串是否匹配正则表达式规则
 * 	String[] strs = "普通字符串".split("正则表达式");//将字符串按正则表达式切割
 * 
 */
public class SummaryDemo {

}
