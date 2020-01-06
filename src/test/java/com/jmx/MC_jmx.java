package com.jmx;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.testng.annotations.Test;

public class MC_jmx {

	// String TASKLIST = "tasklist";
	// private String summaryFileName = "Summary-" + new
	// SimpleDateFormat("ddMMyyyyy-HHmm").format(new Date()).toString();
	@Test
	public void runJmeterFile(String jmxFilePat) throws Exception {
		try {
			boolean errorOccurred = false;
			StringBuffer errorLog = new StringBuffer();

			// String cmd = "cmd.exe /c cd C:/apache-jmeter-4.0/bin && c: &&
			// jmeter -n -t " + jmxFilePath;
			// String cmd = "cmd.exe /c jmeter -n -t " + jmxFilePath + " -l
			// "+System.getProperty("user.dir") + "\\"+summaryFileName+".csv";
			String cmd = "cmd.exe /c jmeter -n -t "
					+ "C:/Users/jgupta/Desktop/Jayant SOTI/apache-jmeter-3.3/bin/jmeter.bat";
			System.out.println(cmd);
			Process p = Runtime.getRuntime().exec(cmd);
			p.waitFor();
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(" " + line);
				if (line.contains("Exception")) {
					errorLog.append(line);
					errorOccurred = true;
				}
			}

			while ((line = stdError.readLine()) != null) {
				System.out.println(" " + line);
				errorLog.append(line);
				errorOccurred = true;
			}

			if (errorOccurred) {
				throw new Exception(errorLog.toString());
			}
			p.destroy();

			testProperties.getProperty("DBServer");

		} catch (Exception e) {
			System.out.println("Exception occured while executing Jmx File. " + e.getMessage());
			throw e;
		}
	}

}