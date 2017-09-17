package KeywordDriven.Selenium.ReportUtils;

import KeywordDriven.Selenium.Utility.TestUtils;

public class ReportTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String startTime = TestUtils.now("dd.MMMM.yyyy hh.mm.ss aaa");
		ReportUtil.startTesting(System.getProperty("user.dir")+"//src//main//java//KeywordDriven//Selenium//Reports//index.html", startTime, "Test", "1.5");

		ReportUtil.startSuite("Suite1");

		ReportUtil.addKeyword("Navigate to page", "Navigate", "Pass", null);
		ReportUtil.addKeyword("Navigate to page", "Navigate", "Pass", null);
		ReportUtil.addKeyword("Navigate to page", "Navigate", "Pass", null);
		ReportUtil.addKeyword("Navigate to page", "Navigate", "Pass", null);
		ReportUtil.addKeyword("Navigate to page", "Navigate", "Pass", null);
		ReportUtil.addKeyword("Navigate to page", "Navigate", "Pass", null);

		ReportUtil.addTestCase("TopNavigation", startTime, TestUtils.now("dd.MMMM.yyyy hh.mm.ss aaa"), "Pass");

		ReportUtil.endSuite();
		ReportUtil.updateEndTime(TestUtils.now("dd.MMMM.yyyy hh.mm.ss aaa"));

	}
}
