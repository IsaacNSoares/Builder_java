package org.example;

import java.util.Date;

public class NotaFiscal {

    private int numero;
    private String chaveAcesso;
    private Date dataEmissao;
    private String cnpjEmissor;
    private String razaoSocialEmissor;
    private String cnpjDestinatario;
    private String razaoSocialDestinatario;
    private double valorTotal;
    private double valorIcms;
    private String transportadora;
    private String placaVeiculo;
    private String enderecoLogradouro;
    private int enderecoNumero;
    private String enderecoBairro;
    private String enderecoCidade;
    private String enderecoUF;
    private String emailDestinatario;

    public NotaFiscal() {
        this.numero = 0;
        this.chaveAcesso = "";
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getChaveAcesso() { return chaveAcesso; }
    public void setChaveAcesso(String chaveAcesso) { this.chaveAcesso = chaveAcesso; }

    public Date getDataEmissao() { return dataEmissao; }
    public void setDataEmissao(Date dataEmissao) { this.dataEmissao = dataEmissao; }

    public String getCnpjEmissor() { return cnpjEmissor; }
    public void setCnpjEmissor(String cnpjEmissor) { this.cnpjEmissor = cnpjEmissor; }

    public String getRazaoSocialEmissor() { return razaoSocialEmissor; }
    public void setRazaoSocialEmissor(String razaoSocialEmissor) { this.razaoSocialEmissor = razaoSocialEmissor; }

    public String getCnpjDestinatario() { return cnpjDestinatario; }
    public void setCnpjDestinatario(String cnpjDestinatario) { this.cnpjDestinatario = cnpjDestinatario; }

    public String getRazaoSocialDestinatario() { return razaoSocialDestinatario; }
    public void setRazaoSocialDestinatario(String razaoSocialDestinatario) { this.razaoSocialDestinatario = razaoSocialDestinatario; }

    public double getValorTotal() { return valorTotal; }
    public void setValorTotal(double valorTotal) { this.valorTotal = valorTotal; }

    public double getValorIcms() { return valorIcms; }
    public void setValorIcms(double valorIcms) { this.valorIcms = valorIcms; }

    public String getTransportadora() { return transportadora; }
    public void setTransportadora(String transportadora) { this.transportadora = transportadora; }

    public String getPlacaVeiculo() { return placaVeiculo; }
    public void setPlacaVeiculo(String placaVeiculo) { this.placaVeiculo = placaVeiculo; }

    public String getEnderecoLogradouro() { return enderecoLogradouro; }
    public void setEnderecoLogradouro(String enderecoLogradouro) { this.enderecoLogradouro = enderecoLogradouro; }

    public int getEnderecoNumero() { return enderecoNumero; }
    public void setEnderecoNumero(int enderecoNumero) { this.enderecoNumero = enderecoNumero; }

    public String getEnderecoBairro() { return enderecoBairro; }
    public void setEnderecoBairro(String enderecoBairro) { this.enderecoBairro = enderecoBairro; }

    public String getEnderecoCidade() { return enderecoCidade; }
    public void setEnderecoCidade(String enderecoCidade) { this.enderecoCidade = enderecoCidade; }

    public String getEnderecoUF() { return enderecoUF; }
    public void setEnderecoUF(String enderecoUF) { this.enderecoUF = enderecoUF; }

    public String getEmailDestinatario() { return emailDestinatario; }
    public void setEmailDestinatario(String emailDestinatario) { this.emailDestinatario = emailDestinatario; }
}