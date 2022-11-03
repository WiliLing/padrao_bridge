package org.bridge;

import org.junit.jupiter.api.Test;

import javax.swing.plaf.basic.BasicGraphicsUtils;

import static org.junit.jupiter.api.Assertions.*;

class MagoTest {

    @Test
    void deveRetornarDanoComoArchMage() {
        ChallengeRating cr = new ArchMage();
        Mago mago = new Mago(20.0f);
        mago.setRank(cr);
        mago.setInteligencia(20);
        assertEquals(1400.0f, mago.calcularDano(), 0.01f);
    }
}