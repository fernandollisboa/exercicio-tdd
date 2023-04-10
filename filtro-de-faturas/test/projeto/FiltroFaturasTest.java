package projeto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FiltroFaturasTest {
	
	private Fatura fatura1, fatura2, fatura3, fatura4, fatura5, fatura6, fatura7;
	private Cliente cliente;
	private List<Fatura> faturas;
	
	@BeforeEach
	public void criarFaturas() {
		cliente = new Cliente("João", LocalDate.of(2022, 3, 1), "PB");
		faturas = new ArrayList<>();
		
		fatura1 = new Fatura("FAT001", 1000.0, LocalDate.of(2023, 4, 10), cliente);//
		fatura2 = new Fatura("FAT002", 1500.0, LocalDate.of(2023, 4, 5), cliente);//
		fatura3 = new Fatura("FAT003", 2000.0, LocalDate.of(2023, 4, 10), cliente);
		fatura4 = new Fatura("FAT004", 3000.0, LocalDate.of(2023, 2, 10), cliente);
		fatura5 = new Fatura("FAT005", 4000.0, LocalDate.of(2023, 1, 10), cliente);
		fatura6 = new Fatura("FAT006", 900.0, LocalDate.of(2023, 4, 10), cliente);//
		fatura7 = new Fatura("FAT007", 2000.0, LocalDate.of(2023, 3, 10), cliente);//
		
		faturas.add(fatura1);
		faturas.add(fatura2);
		faturas.add(fatura3);
		faturas.add(fatura4);
		faturas.add(fatura5);
		faturas.add(fatura6);
		faturas.add(fatura7);
	}
	
	@Test
	public void testFiltroFaturas() {
		FiltroFaturas filtro = new FiltroFaturas();
		filtro.filtrarFaturas(faturas);
		
		assertTrue(faturas.contains(fatura3));
		assertTrue(faturas.contains(fatura4));
		assertTrue(faturas.contains(fatura5));
		
		assertFalse(faturas.contains(fatura1));
		assertFalse(faturas.contains(fatura2));
		assertFalse(faturas.contains(fatura6));
		assertFalse(faturas.contains(fatura7));
	}
}