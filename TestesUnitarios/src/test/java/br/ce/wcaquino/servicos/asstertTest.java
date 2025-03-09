package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Test;
import br.ce.wcaquino.entidades.Usuario;

public class asstertTest {
	
	@Test
	public void test() {
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		
		
		//Assert.assertEquals("erro de comparacao de 2 numeros: ",1, 0);

		Assert.assertEquals(0, 0);
		
		int i= 3;
		Integer i2 = 3;
		
		Assert.assertEquals(Integer.valueOf(i), i2);
		
		Assert.assertEquals("bola", "bola");
		Assert.assertNotEquals("casa", "bola");

		Assert.assertTrue("bola".equalsIgnoreCase("bola"));
		
		Usuario u1= new Usuario("mathew");
		Usuario u2= new Usuario("mathew");
		Usuario u3= null;

		
		Assert.assertEquals(u1, u2);

		Assert.assertSame(u2, u2);
		Assert.assertNotSame(u1, u2);

		
		Assert.assertNull(u3);
		Assert.assertNotNull(u2);

	}

}
