public interface WebDriverTester {
    public static void main(String[] args) throws InterruptedException {
        //WebDriver w=new ChromeDriver();

        //Using an array of webDriver subclasses to perform all the steps at once
        WebDriver[] browsers={new EdgeDriver(), new FirefoxDriver(), new ChromeDriver()};

        for(WebDriver w:browsers){
            w.manage().window().maximize();
            Thread.sleep(2000);
            w.navigate().to("https://amazon.com");
            Thread.sleep(2000);
            System.out.println(w.getTitle());
            Thread.sleep(2000);
            w.close();
        }

    }
}
