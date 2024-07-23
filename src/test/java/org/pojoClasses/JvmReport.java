package org.pojoClasses;

import java.awt.List;
import java.io.File;
import java.util.ArrayList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void generateJvmReport(String jsonfilepath) {
		
		File loc = new File(System.getProperty("user.dir")+"\\target\\Reports\\Jvm report");
		
		Configuration con = new Configuration(loc, "Facebook Project");
		con.addClassifications("BrowserName", "Chrome");
		con.addClassifications("Browser Version", "81");
		con.addClassifications("Sprint", "13");
		con.addClassifications("OS", "Windows");
		
		ArrayList<String> li = new ArrayList<String>();
		li.add(jsonfilepath);
		
		ReportBuilder r = new ReportBuilder(li,con);
		r.generateReports();
	}

}
