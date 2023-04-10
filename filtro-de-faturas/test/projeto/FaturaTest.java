package projeto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FaturaTest {

	private Cliente cliente;
	
	@BeforeEach
	public void criarCliente() {
		cliente = new Cliente("João", LocalDate.now(), "Paraiba");
	}
	
	@Test
	public void testCriarFatura() {
	    Fatura fatura = new Fatura("FAT001", 100.0, LocalDate.now(), cliente);
	    assertNotNull(fatura);
	}

	@Test
	public void testGetCodigoFatura() {
	    Fatura fatura = new Fatura("FAT001", 100.0, LocalDate.now(), cliente);
	    assertEquals("FAT001", fatura.getCodigo());
	}

	@Test
	public void testGetValorFatura() {
	    Fatura fatura = new Fatura("FAT001", 100.0, LocalDate.now(), cliente);
	    assertEquals(100.0, fatura.getValor(), 0.0);
	}

	@Test
	public void testGetDataFatura() {
	    LocalDate data = LocalDate.of(2021, 9, 30);
	    Fatura fatura = new Fatura("FAT001", 100.0, data, cliente);
	    assertEquals(data, fatura.getData());
	}

	@Test
	public void testGetClienteFatura() {
	    Fatura fatura = new Fatura("FAT001", 100.0, LocalDate.now(), cliente);
	    assertEquals(cliente, fatura.getCliente());
	}

	@Test
	public void testSetCodigoFatura() {
	    Fatura fatura = new Fatura("FAT001", 100.0, LocalDate.now(), cliente);
	    fatura.setCodigo("FAT002");
	    assertEquals("FAT002", fatura.getCodigo());
	}

	@Test
	public void testSetValorFatura() {
	    Fatura fatura = new Fatura("FAT001", 100.0, LocalDate.now(), cliente);
	    fatura.setValor(150.0);
	    assertEquals(150.0, fatura.getValor(), 0.0);
	}

	@Test
	public void testSetDataFatura() {
	    Fatura fatura = new Fatura("FAT001", 100.0, LocalDate.now(), cliente);
	    LocalDate data1 = LocalDate.of(2021, 9, 30);
	    fatura.setData(data1);
	    assertEquals("2021-09-30", fatura.getData().toString());
	}

	
}
