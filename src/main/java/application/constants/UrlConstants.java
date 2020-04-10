package application.constants;

import framework.utils.PropertiesRead;

public class UrlConstants {
    public static final String WEB_URL = System.getProperty("user.dir") + PropertiesRead.read("url", PathsConstants.TEST_PROPERTY);
}
