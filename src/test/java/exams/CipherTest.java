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
