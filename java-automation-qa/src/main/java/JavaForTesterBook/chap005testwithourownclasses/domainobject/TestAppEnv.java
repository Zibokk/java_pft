package JavaForTesterBook.chap005testwithourownclasses.domainobject;

public class TestAppEnv {

    public static final String DOMAIN = "192.123.0.3";
    public static final String PORT = "67";

    public static String getUrl() {
//        return "http://192.123.0.3:67";
        return "http://" + DOMAIN + ":" + PORT;
    }
}
