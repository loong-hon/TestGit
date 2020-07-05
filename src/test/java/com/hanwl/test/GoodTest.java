package com.hanwl.test;

import java.io.File;
import org.junit.Test;
import com.hanwl.git.Apple;

public class GoodTest {	
		
	@Test
	public  void test() {
		File file = new File("d:/");
		String freeSpace = Apple.FormetFileSize(file.getFreeSpace());
		String totalSpace = Apple.FormetFileSize(file.getTotalSpace());
		String usableSpace = Apple.FormetFileSize(file.getTotalSpace()-file.getFreeSpace());		
		double percentage = Apple.percentageUtil(Double.parseDouble(usableSpace.substring(0, usableSpace.length()-1)),
				Double.parseDouble(totalSpace.substring(0, totalSpace.length()-1)));
		
		System.out.println("可用空间:"+freeSpace);
		System.out.println("总空间:"+totalSpace);
		System.out.println("磁盘使用百分比："+percentage);
	}

}
