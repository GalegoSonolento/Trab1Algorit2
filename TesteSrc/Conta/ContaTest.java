package Conta;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    @Test
    void getNome() {
        Conta c1 = new Conta("Roberto");
        assertEquals("Roberto", c1.getNome());
    }

    @Test
    void depositar() {
    }

    @Test
    void sacar() {
    }

    @Test
    void testToString() {
        Conta c2 = new Conta("Alemão");
        assertEquals("Conta de "+c2.getNome()+"{" +
                "saldo atual = " + c2.getSaldo() +
                '}', c2.toString());
    }
}