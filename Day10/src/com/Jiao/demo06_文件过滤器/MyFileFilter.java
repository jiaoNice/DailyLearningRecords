package com.Jiao.demo06_ÎÄ¼ş¹ıÂËÆ÷;

import java.io.File;
import java.io.FileFilter;

public class MyFileFilter implements FileFilter {

	@Override
	public boolean accept(File pathname) {
		if(pathname.getName().matches(".+\\.txt"))
			return true;
		if(pathname.getName().endsWith(".docx"))
			return true;
		return false;
	}

}
