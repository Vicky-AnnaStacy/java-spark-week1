package exams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CipherTest {

    private Cipher enCryptor;

    @BeforeEach
    void setUp() {
        enCryptor = new Cipher();
    }


    @Test
    void encrypt() {
        enCryptor.setSteps(23);
        assertEquals("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", enCryptor.encrypt("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
        enCryptor.setSteps(1);
        assertEquals("B@#", enCryptor.encrypt("A@#"));
        assertEquals("", enCryptor.encrypt(""));
        assertEquals("B", enCryptor.encrypt("B"));
        assertEquals(null, enCryptor.encrypt(null));
    }

    @Test
    void decrypt() {
        enCryptor.setSteps(23);
        assertEquals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", enCryptor.descrypt("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD"));
        enCryptor.setSteps(1);
        assertEquals("", enCryptor.descrypt(""));
        assertEquals("-", enCryptor.descrypt("-"));
        assertEquals(null, enCryptor.encrypt(null));

    }
}

