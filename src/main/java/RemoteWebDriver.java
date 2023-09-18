public interface RemoteWebDriver extends WebDriver,TakesScreenShort{
    void navigate();
}

class ChromeDriver implements RemoteWebDriver{

    @Override
    public void navigate() {

    }

    @Override
    public void getScreenShort() {

    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }
}

class FirefoxDriver implements RemoteWebDriver{


    @Override
    public void navigate() {

    }

    @Override
    public void getScreenShort() {

    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }
}

class SafariDriver implements RemoteWebDriver{

    @Override
    public void navigate() {

    }

    @Override
    public void getScreenShort() {

    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }
}
