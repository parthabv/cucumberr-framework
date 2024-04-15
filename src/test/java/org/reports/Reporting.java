package org.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	
	public static void jvmReports(String jsonfile) {
		File file = new File("C:\\Users\\Mr.Dharan Chotu\\eclipse-workspace\\eclipse\\work out\\Cucumber\\target");
		Configuration configuration = new Configuration(file, "Omr automation");
		configuration.addClassifications("OS", "Windows10");
		configuration.addClassifications("browser", "chrome");
		configuration.addClassifications("version", "11.2");
		List<String> jsonfiles = new ArrayList<String>();
		jsonfiles.add(jsonfile);
		ReportBuilder builder = new ReportBuilder(jsonfiles, configuration);
		builder.generateReports();

	}

}
