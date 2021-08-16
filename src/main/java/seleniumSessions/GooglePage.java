package seleniumSessions;

public class GooglePage {

	public static void main(String[] args) {
		String browser;

		BrowserUtil br = new BrowserUtil();
		br.launchBrowser("chrome");
		br.launchUrl("https://www.cricbuzz.com");

		String title=br.getPageTitle();
		System.out.println("title is : " + title);
		if(title.equals("IPL 2021 Cricket Score, Schedule, Latest News, Stats & Videos | Cricbuzz.com")){
			System.out.println("Correct title");
		}
		else{
			System.out.println("Wrong title");
		}
		System.out.println(br.getPageUrl());
		br.closeBrowser();
	}


}
