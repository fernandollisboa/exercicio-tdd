 package projeto;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FiltroFaturasTestTabelaDecisao {

	private Fatura fatura1, fatura7;
	private Cliente cliente;
	private List<Fatura> faturas;
	private FiltroFaturas filtro;
	
	@BeforeEach
	public void criarFaturas() {
		cliente = new Cliente("João", LocalDate.of(2022, 3, 1), "PB");
		faturas = new ArrayList<>();
		filtro = new FiltroFaturas();
		
		fatura1 = new Fatura("FAT001", 1000.0, LocalDate.of(2023, 4, 10), cliente);//
		fatura7 = new Fatura("FAT007", 2000.0, LocalDate.of(2023, 3, 10), cliente);//
	}
	
	@Test
	public void regra1() {
		faturas.add(fatura1);
		
		assertTrue(faturas.size() == 1);
		assertTrue(faturas.contains(fatura1));
		
		filtro.filtrarFaturas(faturas);

		assertTrue(faturas.size() == 0);
		assertFalse(faturas.contains(fatura1));
	}
	
	@Test
	public void regra2() {
		faturas.add(fatura7);
		
		assertTrue(faturas.size() == 1);
		assertTrue(faturas.contains(fatura7));
		
		filtro.filtrarFaturas(faturas);

		assertTrue(faturas.size() == 0);
		assertFalse(faturas.contains(fatura7));
	}
	
	@Test
	public void regra3() {
		Cliente raphael = new Cliente("Raphael", LocalDate.of(2023, 1, 17), "PB");
		Fatura f1 = new Fatura("FAT008", 2700.0, LocalDate.of(2023, 3, 10), raphael);//
		
		faturas.add(f1);
		
		assertTrue(faturas.size() == 1);
		assertTrue(faturas.contains(f1));
		
		filtro.filtrarFaturas(faturas);

		assertTrue(faturas.size() == 0);
		assertFalse(faturas.contains(f1));
	}
	
	@Test
	public void regra4() {
		Cliente pedro = new Cliente("Pedro", LocalDate.now(), "SC");
		Fatura f1 = new Fatura("FAT009", 5000.0, LocalDate.now(), pedro);//
		
		faturas.add(f1);
		
		assertTrue(faturas.size() == 1);
		assertTrue(faturas.contains(f1));
		
		filtro.filtrarFaturas(faturas);

		assertTrue(faturas.size() == 0);
		assertFalse(faturas.contains(f1));
	}
}
