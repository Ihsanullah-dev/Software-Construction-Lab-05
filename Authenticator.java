package Lab05;

import java.util.HashMap;
import java.util.Map;

public class Authenticator {

    private final Map<String, char[]> cachedIds = new HashMap<>();

    public Authenticator() {

        cachedIds.put("Sameer", "123456789".toCharArray());
        cachedIds.put("student", "987654321".toCharArray());
    }

    public char[] getMitId(String username) {

        return cachedIds.get(username);
    }

    public String getMitIdSecure(String username) {

        char[] id = cachedIds.get(username);

        if (id == null) {
            return null;
        }

        return new String(id);
    }
}