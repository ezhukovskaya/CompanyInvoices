package application.constants;

import framework.utils.PropertiesRead;

import java.nio.file.Paths;

public class UrlConstants {
    public static final String WEB_URL = PropertiesRead.read("url", PathsConstants.TEST_PROPERTY);
}
