package com.autumnstudio.other;

import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.Properties;

/*
 * System ϵͳ�࣬��Ҫ���ڻ�ȡϵͳ������ֵ
 * -- arrayCopy���� arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
 * -- currentTimeMillis() �����Ժ���Ϊ��λ�ĵ�ǰʱ��
 * -- exit(int status) ��ֹ��ǰ�������е� Java �������
 * -- gc() ����������������  *** ����JVM������������������
 * -- getenv() ����һ�������޸ĵĵ�ǰϵͳ�������ַ���ӳ����ͼ��
 * -- getProperties() ȷ����ǰ��ϵͳ���ԡ�
 */
public class Demo1 {
	public static void main(String[] args) {
		int[] src = {10, 20, 30, 40, 50, 60, 70};
		int[] dest = new int[4];
		
		System.arraycopy(src, 1, dest, 0, 4);
		System.out.println(Arrays.toString(dest));
		
		System.out.println(System.currentTimeMillis());
		System.out.println(new Date(System.currentTimeMillis()));
		
		new Demo();
		System.gc();
		
		String paths = System.getenv("path");
		String[] arrPaths = paths.split(";");
		File[] files = new File[arrPaths.length];
		for (int i = 0; i < arrPaths.length; i ++) {
			files[i] = new File(arrPaths[i]);
			System.out.println(files[i].getAbsolutePath());
		}
		
		Properties props = System.getProperties();
		props.list(System.out);
	}
}

class Demo {
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("��������");
	}
}