package src;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComunicadorInterplanetarioTest {
    private ComunicadorInterplanetario comunicador;

    @BeforeEach
    void setUp() {
        comunicador = new ComunicadorInterplanetario();
    }

    @Test
    void testSendMessage() {
        comunicador.sendMessage("Hello, Mars!");
        assertEquals("Hello, Mars!", comunicador.receiveMessage());
    }

    @Test
    void testReceiveMessage() {
        comunicador.sendMessage("Hello, Venus!");
        String receivedMessage = comunicador.receiveMessage();
        assertEquals("Hello, Venus!", receivedMessage);
    }
}