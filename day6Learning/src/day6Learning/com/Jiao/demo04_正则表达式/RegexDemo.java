package day6Learning.com.Jiao.demo04_������ʽ;
/*
 * ������ʽ��
 * 	����java�ģ������б�����Ի�������֧�ֵ�
 * 1.������ʽ��ʲô��
 * 	��һ���ַ�������������ʽ���ݡ�
 * 	����ͨ���ַ���������������ݾ�������
 * 	��������ʽ���ݡ�������д�˹���
 * ��ͨ�ַ�������������ݣ���������ʽ��ʾ����
 * 2.������ʽ��ʲô�ã�
 * 	����ƥ����ͨ�ַ�����
 * 	boolean b = ����ͨ�ַ�����ƥ�䡰������ʽ����
 * 3.����ʵ�֣�
 * 	��String����
 * 	public boolean matches(String regex)
 * 	boolean b = "��ͨ�ַ���".matches("������ʽ");
 * 4.��ϰ1��У��qq����
 * 	  ��ϰ2��У���ֻ�����
 * 5.��д������ʽ�ļ��ɣ�������ʽ��Ҫһλһλ���ж�
 * 6.��String������һ������
 * 		public String[] split(String regex);//�и��ַ����������и����ַ�������
 * 
 */
public class RegexDemo {
	public static void main(String[] args) {
		System.out.println(phoneNumber("18465685555"));
		split02();
		
	}
	/*
	 * qq����������Ĺ���
	 * 1.0-9������
	 * 2.��ͷ������1-9�е�һ������
	 * 3.λ������5-12λ
	 */
	public static boolean qq(String qq) {
		boolean b = qq.matches("[1-9][0-9]{4,11}");
		return b;
	}
	/*
	 * У���ֻ����룺
	 * 1.Ҫ��Ϊ11λ0-9������
	 * 2.��1λΪ1����2λΪ3��4��5��7��8�е�һ��������9λΪ0-9֮�����������
	 */
	public static boolean phoneNumber(String pN) {
		return pN.matches("1[34578][0-9]{9}");
	}

	/*
	 * �������и�绰
	 */
	public static void split01() {
		String str = "1-452-51---152";
		//�и�phoneNumber���Ѻ����и����
		//��+����������ʽ�б�ʾһ������
		String[] pN = str.split("-+");
		for(int i = 0;i<pN.length;i++) {
			System.out.println(pN[i]);
		}
		
	}
	/*
	 * �������и�ip
	 */
	public static void split02() {
		String ip = "198.168.123.110";
		//��.����������ʽ�б�ʾ�����ַ�
		//ת���ַ�
		//\t  ˮƽ�Ʊ��
		//\n  ���з�
		//\r  �س���
		//��������ʽ�С�\\������һ����\��
		String[] ipStrings = ip.split("\\.");
		for(int i = 0;i<ipStrings.length;i++) {
			System.out.println(ipStrings[i]);
		}
	}
}
