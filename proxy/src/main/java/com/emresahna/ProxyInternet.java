package com.emresahna;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    private final Internet internet = new RealInternet();
    private static final List<String> bannedSites;
    private static List<String> cachedSites;

    static {
        bannedSites = new ArrayList<>();
        cachedSites = new ArrayList<>();

        bannedSites.add("www.facebook.com");
        bannedSites.add("www.twitter.com");
        bannedSites.add("www.instagram.com");
    }

    @Override
    public void connectTo(String serverHost) {
        if (isBanned(serverHost)) {
            System.out.println("Access denied to "+serverHost);
        } else if (isCached(serverHost)) {
            System.out.println("Connecting to "+serverHost+" (from cache)");
        } else {
            internet.connectTo(serverHost);
            cachedSites.add(serverHost);
        }
    }

    public boolean isBanned(String serverHost) {
        return bannedSites.contains(serverHost);
    }

    public boolean isCached(String serverHost) {
        return cachedSites.contains(serverHost);
    }
}
