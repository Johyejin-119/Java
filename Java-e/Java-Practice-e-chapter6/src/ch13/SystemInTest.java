package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {

	public static void main(String[] args) {

		System.out.println("���ĺ� �ϳ��� ���� [Enter]�� ��������");
		int i;
		try {
			
			InputStreamReader irs = new InputStreamReader(System.in); // ������Ʈ������ byte�� ���ڷ�
			while((i = irs.read()) != '\n') { 
				System.out.print((char)i);	
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}