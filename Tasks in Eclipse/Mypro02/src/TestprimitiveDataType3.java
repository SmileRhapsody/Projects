/**
 * �����ַ�����
 * boolean����
 * @author Administrator
 *
 */
public class TestprimitiveDataType3 {
	public static void main(String[] args) {
		char a = 'T';
		char b = 'Ц';
		char c = '\u0061';//��ʾ�ַ�a
		// ǰ׺Ϊu��ʾUnicode ��'\u0000'��'\uFFFF'
		System.out.println(c);
		
		//ת���ַ�
		System.out.println('a'+'b');
		//ֱ�Ӽӻ�ת�������� ��Ҫǰ��ӡ�����ʾ�ַ���
		System.out.println(""+'a'+'\n'+'b');//���� =\u000a
		/*
		 \b = \u0008	�˸�backspace
		 \r = \u000d	�س�
		 \t = \u0009	�Ʊ��tab
		 \" = \u0022	˫����
		 \' = \u0027	������
		 \\ = \u005c	��б��
		 */
		String d = "abc";//String���ַ�����
		
		
		//���Բ�������
		boolean man = true;
		
		if(man) {	//����д�ɣ�man = true����Ϊ���Ǹ�ֵ
			System.out.println("����");
		}else {
			System.out.println("Ů��");
		}
		
	}

}
