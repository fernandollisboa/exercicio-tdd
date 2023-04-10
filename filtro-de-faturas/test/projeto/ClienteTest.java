package projeto;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTest {

	private Cliente cliente;
	
	@BeforeEach
	public void criarCliente() {
	    LocalDate dataInclusao = LocalDate.of(2023, 4, 10);
	    cliente = new Cliente("João", dataInclusao, "PB");
	}
	
	@Test
	public void testGetNome() {
	    assertEquals("João", cliente.getNome());
	}
	
	@Test
	public void testSetNome() {
	    String nomeNovo = "Maria";
	    cliente.setNome(nomeNovo);
	    assertEquals(nomeNovo, cliente.getNome());
	}
	
	@Test
	public void testGetDataInclusao() {
	    assertEquals("2023-04-10", cliente.getDataInclusao().toString());
	}
	
	@Test
	public void testSetDataInclusao() {
	    LocalDate dataNova = LocalDate.of(2023, 4, 5);
	    cliente.setDataInclusao(dataNova);
	    assertEquals("2023-04-05", cliente.getDataInclusao().toString());
	}
	
	@Test
	public void testGetEstado() {
	    assertEquals("PB", cliente.getEstado());
	}
	
	@Test
	public void testSetEstado() {
	    cliente.setEstado("SP");
	    assertEquals("SP", cliente.getEstado());
	}

}
