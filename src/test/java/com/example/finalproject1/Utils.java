package com.example.finalproject1;

import java.util.concurrent.TimeUnit;

public class Utils {
    final static String BASE_URL = "https://www.saucedemo.com/";
    final static String INVENTORY_URL = "https://www.saucedemo.com/inventory.html";
    final static String CHECKOUT2_URL = "https://www.saucedemo.com/checkout-step-two.html";
    final static String TWITTER_URL = "https://twitter.com/saucelabs";
    final static String FACEBOOK_URL = "https://www.facebook.com/saucelabs";
    final static String LINKEDIN_URL = "https://www.linkedin.com/authwall?trk=gf&trkInfo=AQE2-d6CVedwaQAAAX-OsBIQak-kwwGj09Bd3F70R_hq96pjzvKPv0XEoIJYDwzzPjW1qPZm3k-H1fQSvKm8wo1F46VdrRcBHXAUjMGZOExwmS2XxWUB6Z9dnbSwSehMDu5nDng=&originalReferer=&sessionRedirect=https%3A%2F%2Fwww.linkedin.com%2Fcompany%2Fsauce-labs%2F";
    final static String LINKEDIN_URL2 = "https://www.linkedin.com/checkpoint/challengesV2/AQFdqXVK2vqq0gAAAX-OsL4A8FWPmRhxtgMqmoKOj_ETzCufHJWVPBHQ-VI7_Dxtw3NKMw_F6LeopLz4xkMBntE-GtabjGvRCw";
    final static String LINKEDIN_URL3 ="https://www.linkedin.com/";
    public static void WaitForElement(int timeUnit) {
        try {
            TimeUnit.SECONDS.sleep(timeUnit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
