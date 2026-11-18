package org.example;

import java.util.Date;

public class NotaFiscalBuilder {

    private NotaFiscal notaFiscal;

    public NotaFiscalBuilder() {
        notaFiscal = new NotaFiscal();
    }

    public NotaFiscal build() {
        if (notaFiscal.getNumero() == 0) {
            throw new IllegalArgumentException("Número da nota fiscal inválido");
        }
        if (notaFiscal.getChaveAcesso().equals("")) {
            throw new IllegalArgumentException("Chave de acesso inválida");
        }
        return notaFiscal;
    }

    public NotaFiscalBuilder setNumero(int numero) {
        notaFiscal.setNumero(numero);
        return this;
    }

    public NotaFiscalBuilder setChaveAcesso(String chaveAcesso) {
        notaFiscal.setChaveAcesso(chaveAcesso);
        return this;
    }

    public NotaFiscalBuilder setDataEmissao(Date dataEmissao) {
        notaFiscal.setDataEmissao(dataEmissao);
        return this;
    }

    public NotaFiscalBuilder setCnpjEmissor(String cnpjEmissor) {
        notaFiscal.setCnpjEmissor(cnpjEmissor);
        return this;
    }

    public NotaFiscalBuilder setRazaoSocialEmissor(String razaoSocialEmissor) {
        notaFiscal.setRazaoSocialEmissor(razaoSocialEmissor);
        return this;
    }

    public NotaFiscalBuilder setCnpjDestinatario(String cnpjDestinatario) {
        notaFiscal.setCnpjDestinatario(cnpjDestinatario);
        return this;
    }

    public NotaFiscalBuilder setRazaoSocialDestinatario(String razaoSocialDestinatario) {
        notaFiscal.setRazaoSocialDestinatario(razaoSocialDestinatario);
        return this;
    }

    public NotaFiscalBuilder setValorTotal(double valorTotal) {
        notaFiscal.setValorTotal(valorTotal);
        return this;
    }

    public NotaFiscalBuilder setValorIcms(double valorIcms) {
        notaFiscal.setValorIcms(valorIcms);
        return this;
    }

    public NotaFiscalBuilder setTransportadora(String transportadora) {
        notaFiscal.setTransportadora(transportadora);
        return this;
    }

    public NotaFiscalBuilder setPlacaVeiculo(String placaVeiculo) {
        notaFiscal.setPlacaVeiculo(placaVeiculo);
        return this;
    }

    public NotaFiscalBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        notaFiscal.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public NotaFiscalBuilder setEnderecoNumero(int enderecoNumero) {
        notaFiscal.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public NotaFiscalBuilder setEnderecoBairro(String enderecoBairro) {
        notaFiscal.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public NotaFiscalBuilder setEnderecoCidade(String enderecoCidade) {
        notaFiscal.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public NotaFiscalBuilder setEnderecoUF(String enderecoUF) {
        notaFiscal.setEnderecoUF(enderecoUF);
        return this;
    }

    public NotaFiscalBuilder setEmailDestinatario(String emailDestinatario) {
        notaFiscal.setEmailDestinatario(emailDestinatario);
        return this;
    }
}