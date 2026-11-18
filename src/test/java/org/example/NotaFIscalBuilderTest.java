package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotaFiscalBuilderTest {

    @Test
    void deveRetornarExcecaoParaNotaFiscalSemNumero() {
        try {
            NotaFiscalBuilder builder = new NotaFiscalBuilder();
            NotaFiscal nf = builder
                    .setChaveAcesso("31261012345678000199550010001234561001234567")
                    .setCnpjEmissor("12.345.678/0001-99")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número da nota fiscal inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaNotaFiscalSemChaveAcesso() {
        try {
            NotaFiscalBuilder builder = new NotaFiscalBuilder();
            NotaFiscal nf = builder
                    .setNumero(123456)
                    .setCnpjEmissor("12.345.678/0001-99")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Chave de acesso inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarNotaFiscalValida() {
        NotaFiscalBuilder builder = new NotaFiscalBuilder();
        NotaFiscal nf = builder
                .setNumero(123456)
                .setChaveAcesso("31261012345678000199550010001234561001234567")
                .setCnpjEmissor("12.345.678/0001-99")
                .setRazaoSocialEmissor("Microvix Tecnologia")
                .setValorTotal(1500.50)
                .build();

        assertNotNull(nf);
    }
}