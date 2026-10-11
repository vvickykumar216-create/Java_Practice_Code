package Default_Constructor;

import java.sql.SQLOutput;

public class Router {
    String ssid;

    Router() {
        ssid = "Default Wifi";
    }

    Router(String ssid) {
        this.ssid = ssid;
    }

    static void main(String[] args) {
        Router r1 = new Router();
        Router r2 = new Router("MyWiFi");

        System.out.println(r1.ssid);
        System.out.println(r2.ssid);
    }
}
