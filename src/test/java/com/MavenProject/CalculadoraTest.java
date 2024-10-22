package com.MavenProject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    private  Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    void suma() {
        assertEquals(5,calculadora.suma(3,2));
    }

    @Test
    void resta() {
        assertEquals(10,calculadora.resta(20,10));
    }
}