package com.exemplo;

import com.exemplo.helper.RelatorioHelper;
import com.exemplo.model.Linha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    private static final String ENDERECO_ARQUIVOS = "c:\\temp\\";// Ruinwindows
    private static final String ENDERECO_IMAGEM = "src/main/resources/img/teste.PNG";

    public static void main(String[] args) {
//        geraRelatorio1();
//        geraRelatorio2();
        geraRelatorio3();
    }

    public static void geraRelatorio1() {
        List<Linha> dados = new ArrayList<>();
        Linha linha1 = new Linha(Arrays.asList("Razão Social: TRTRQ RPRSNTC LTD",               ""));
        Linha linha2 = new Linha(Arrays.asList("Inscrição: 1040000",                            "CNPJ: 08.000.976/0000-00"));
        Linha linha3 = new Linha(Arrays.asList("Tipo de Contribuinte: COMERCIANTE VAREJISTA",   ""));
        Linha linha4 = new Linha(Arrays.asList("Logradouro: AVENIDA J LS SPRT SNT",             ""));
        Linha linha5 = new Linha(Arrays.asList("Número: LT 4/5",                                "Bairro: JRDM CLFRN"));
        Linha linha6 = new Linha(Arrays.asList("Complemento: QDR K",                            ""));
        Linha linha7 = new Linha(Arrays.asList("Cidade: FORMOSA",                               "UF: GO"));
        Collections.addAll(dados, linha1, linha2, linha3, linha4, linha5, linha6, linha7);

        //INICIA A GERAÇÃO DO RELATORIO COM QUADROS E TEXTOS
        String arquivo = RelatorioHelper.criaPdf(ENDERECO_ARQUIVOS, "Relatorio1/2020", new int[]{20, 20, 20, 20});
        RelatorioHelper.adicionaNome("Relatorio1/2020");
        RelatorioHelper.adicionaCabecalhoImagem(ENDERECO_IMAGEM, "ESTADO DO BRASIL\n\nRELATORIO DE TESTE",
                "RELATORIO DE TESTE ESPECIAL\n\nSOLICITAÇÃO Nº 1/2020");
        RelatorioHelper.adicionaLinhaEmBranco();
        RelatorioHelper.adicionaQuadroTitulo("DADOS DO REQUERENTE", true, true);
        RelatorioHelper.adicionaQuadroTexto(2, dados);
        RelatorioHelper.adicionaLinhaEmBranco();
        RelatorioHelper.adicionaQuadroTitulo("OBSERVAÇÕES", true, true);
        RelatorioHelper.adicionaQuadroTexto(1,
                Collections.singletonList(new Linha(Collections.singletonList("Solicito um novo TESTE baseado em..."))));
        RelatorioHelper.adicionaLinhaEmBranco();
        RelatorioHelper.adicionaQuadroTitulo("IDENTIFICAÇÃO DO RESPONSÁVEL LEGAL", true, true);
        RelatorioHelper.adicionaQuadroTexto(1, Arrays.asList(
                new Linha(Collections.singletonList("Solicitado por: FULANO FREITAS DOS SANTOS")),
                new Linha(Collections.singletonList("CPF/CNPJ: 000.827.000-10")),
                new Linha(Collections.singletonList("Cargo: CONTADOR"))
        ));
        RelatorioHelper.adicionaLinhaEmBranco();
        RelatorioHelper.adicionaTexto("Goiânia, 11 de Fevereiro de 2020", true);
        RelatorioHelper.adicionaLinhaEmBranco();
        RelatorioHelper.adicionaTextoADireita("*Documento deve ser assinado digitalmente.");
        RelatorioHelper.concluiPdf();
    }

    public static void geraRelatorio2() {
        //INICIA A GERAÇÃO DO RELATORIO TEXTUAL
        String arquivo = RelatorioHelper.criaPdf(ENDERECO_ARQUIVOS, "Relatorio3/2020", new int[]{40, 40, 20, 30});
        RelatorioHelper.adicionaNome("Relatorio3/2020");
        RelatorioHelper.adicionaImagemCentro(ENDERECO_IMAGEM);
        RelatorioHelper.adicionaLinhaEmBranco();
        RelatorioHelper.adicionaTextoTimeNews("ESTADO DO BRASIL\nSECRETARIA DE RELATORIOS\nGERÊNCIA DE RELATORIOS ESPECIAIS", true);
        RelatorioHelper.adicionaLinhaEmBranco();
        RelatorioHelper.adicionaLinhaEmBranco();
        RelatorioHelper.adicionaTextoTimeNews("Processo: 2020000000000\nNome: FULANO ALIMENTOS LTDA\n" +
                "Assunto: SOLICITAÇÃO DE TESTE DE ACORDO", false);
        RelatorioHelper.adicionaLinhaEmBranco();
        RelatorioHelper.adicionaTextoTimeNews("RELATORIO DE TESTE - Nº 0001/2020", true);
        RelatorioHelper.adicionaLinhaEmBranco();
        RelatorioHelper.adicionaParagrafoTimeNews("Nos autos, a empresa denominada FULANO ALIMENTOS LTDA, estabelecida na " +
                "Rodovia GO 000, S/N, km 00,1, Zona Rural, município de Santa Pereba de Goiás (GO), CEP 00.000-000, " +
                "inscrita no CNPJ/MF sob o nº 00.000.000/0000-40 e no CCE sob o nº 10.000.000-4, requer a celebração " +
                "de Termo de Acordo para usufruir dos benefícios do programa TESTE, em " +
                "decorrência da expansão desta unidade industrial, conforme Resolução nº 0.000//TESTE de 16 " +
                "de fevereiro de 2019.");
        RelatorioHelper.adicionaParagrafoTimeNews("As Resoluções supracitadas aprovaram, para os efeitos do Programa, o " +
                "projeto de expansão da empresa requerente, concedendo o financiamento no valor de até " +
                "000.000.000,84.");
        RelatorioHelper.adicionaParagrafoTimeNews("Consta no Relatório de Auditoria de Investimentos, expedido pelo Grupo de " +
                "Trabalho de Controle de Benefícios e Incentivos Fiscais, que a empresa comprovou 100% (cem por cento), " +
                "dos investimentos fixos projetados, relacionados no Relatório de Análise.");
        RelatorioHelper.adicionaParagrafoTimeNews("A partir do dia 1º de abril de 2020, a fruição do benefício está " +
                "condicionada à celebração de novo Termo de Acordo, na forma do parágrafo único do " +
                "mesmo dispositivo legal.");
        RelatorioHelper.adicionaParagrafoTimeNews("Diante do exposto, tendo em vista que o processo chegou nesta gerência na data de " +
                "04/03/2020 e apresentou a documentação completa, período a partir da qual a empresa supriu as " +
                "exigências legais feita por este Órgão. E, estando o pedido instruído em conformidade com as exigências " +
                "legais, entendemos que a requerente faz jus à celebração do Acordo.");
        RelatorioHelper.adicionaParagrafoTimeNews("É o TESTE!.");
        RelatorioHelper.adicionaParagrafoTimeNews("Gabinete do Gerente da parada toda, aos 06 dias do mês de março de 2020.");
        RelatorioHelper.adicionaLinhaEmBranco();
        RelatorioHelper.concluiPdf();
    }

    public static void geraRelatorio3() {
        //INICIO DA CRIAÇÃO DO RELATORIO INCLUINDO UM HTML PRE FORMATADO (UTIL PARA CASOS EM QUE EXISTEM PALAVRAS EM NEGRITO NO MEIO DO TEXO, POR EXEMPLO)
        String arquivo = RelatorioHelper.criaPdf(ENDERECO_ARQUIVOS, "Relatorio com HTML/2020", new int[]{90, 70, 30, 50});
        RelatorioHelper.adicionaNome("HTML em PDF/2020");
        RelatorioHelper.adicionaImagemCentro(ENDERECO_IMAGEM);
        RelatorioHelper.adicionaTextoTimeNews("FORMATE O HTML COM TAGS\nINSIRA ELE CONFORME ABAIXO", true);
        RelatorioHelper.adicionaLinhaEmBranco();
        RelatorioHelper.adicionaLinhaEmBranco();
        RelatorioHelper.adicionaHtmlFonteTimeNews(
                "<p style=\"text-align: justify; text-indent:4em\">As Resoluções supracitadas aprovaram, para os efeitos do Programa\n" +
                "    <b>PRODUZIR</b>, o projeto de expansão da empresa requerente, concedendo o financiamento do Produzir no valor de \n" +
                "    até R$000.000.000,04, data base julho de 2015, com vencimento em 31 de dezembro de 2040. \n" +
                "    O valor foi atualizado pelo Contrato nº 000/2020, para R$ 510.000.000,74 (quinhentos e dez milhões, \n" +
                "    e setenta e quatro centavos), data base novembro de 2019.</p>\n" +
                "<p>\n" +
                "<p style=\"text-align: justify; text-indent:4em\">Por sua vez, conforme determina o Decreto nº 0.000/1707,  ...</p>\n" +
                "<p>\n" +
                "<p style=\"text-align: justify; text-indent:4em\"><font color=\"#3984c6\"><b>É o RELATIRIO DE TESTE.</b></font></p>");
        RelatorioHelper.adicionaLinhaEmBranco();
        RelatorioHelper.adicionaTextoTimeNews("ESSE É UM HTML FORMATADO E ENVIADO PARA PDF\n" +
                "Fulano Antônio Testemunha Junior                                    Cicrano Soares de Testemunha\n" +
                "Diretor                                                                         Gerente", true);
        RelatorioHelper.adicionaLinhaEmBranco();
        RelatorioHelper.adicionaLinhaEmBranco();
        RelatorioHelper.adicionaTextoTimeNews("TESTEMUNHAS: 1ª ---------------------------------------  2ª -------------------------------------", true);
        RelatorioHelper.adicionaLinhaEmBranco();
        RelatorioHelper.concluiPdf();
    }
}
