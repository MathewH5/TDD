package br.ce.wcaquino.servicos;



import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.utils.DataUtils;

public class LocacaoServiceTest {
	
	@Test
	public void test() {
		
		//cenario
		LocacaoService service = new LocacaoService();
		Usuario usuario = new Usuario("mathew");
		Filme filme = new Filme("gente grande", 2 ,10.0);
		
		
		//acao
		Locacao locacao = service.alugarFilme(usuario, filme);
		
		//verfiacao
		Assert.assertTrue(locacao.getValor() == 10.0);
		Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
		Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1))); 

		
	}
}
