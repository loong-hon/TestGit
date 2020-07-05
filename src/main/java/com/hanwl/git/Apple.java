package com.hanwl.git;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Apple {
	
	//计算磁盘大小
		public static String FormetFileSize(long fileS) {
			DecimalFormat df = new DecimalFormat("#.00");
			String fileSizeString = "";
			if (fileS < 1024) {
				fileSizeString = df.format((double) fileS) + "B";
			} else if (fileS < 1048576) {
				fileSizeString = df.format((double) fileS / 1024) + "K";
			} else if (fileS < 1073741824) {
				fileSizeString = df.format((double) fileS / 1048576) + "M";
			} else if (fileS < 1099511627776L){
				fileSizeString = df.format((double) fileS / 1073741824) + "G";
			} else {
				fileSizeString = df.format((double) fileS / 1099511627776L) + "T";
			}
			return fileSizeString;
		}
		
		//计算磁盘使用百分比
		public static double percentageUtil(double num1,double num2) {
			NumberFormat numberFormat = NumberFormat.getInstance();
			numberFormat.setMaximumFractionDigits(2);
			String result = numberFormat.format(num1 / num2 * 100);
			return Double.parseDouble(result);
		}

}
