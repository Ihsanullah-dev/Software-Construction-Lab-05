package Lab05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AuthenticatorTest {

    @Test
    public void testInsecureMethodCanCorruptCachedId() {

        Authenticator authenticator = new Authenticator();

        char[] id =
                authenticator.getMitId("Sameer");

        for (int i = 0; i < 5; i++) {
            id[i] = '*';
        }

        char[] cachedId =
                authenticator.getMitId("Sameer");

        assertEquals(
                "*****6789",
                new String(cachedId)
        );
    }

    @Test
    public void testSecureMethodReturnsImmutableString() {

        Authenticator authenticator = new Authenticator();

        String id =
                authenticator.getMitIdSecure("Sameer");

        assertEquals("123456789", id);
    }
}