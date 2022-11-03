package org.bridge;

import org.junit.jupiter.api.Test;

import javax.swing.plaf.basic.BasicGraphicsUtils;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    @Test
    void deveRetornarDanoDePaladino() {
        ChallengeRating cr = new Paladin();
        Warrior warrior = new Warrior(10.0f);
        warrior.setRank(cr);
        warrior.setForca(10);
        assertEquals(180.0f, warrior.calcularDano(), 0.01f);
    }

}