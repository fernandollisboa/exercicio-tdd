package projeto;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FiltroFaturasTestAVL {

	private Fatura fatura1;
	private Cliente cliente;
	private List<Fatura> faturas;
	private FiltroFaturas filtro;
	
	@BeforeEach
	public void criarFaturas() {
		cliente = new Cliente("João", LocalDate.of(2022, 3, 1), "PB");
		faturas = new ArrayList<>();
		filtro = new FiltroFaturas();
		
	}
	
	@Test
	public void testAVL1() {
		fatura1 = new Fatura("FAT001", 1999.0, LocalDate.of(2023, 4, 10), cliente);//
		
		faturas.add(fatura1);
		
		assertTrue(faturas.size() == 1);
		assertTrue(faturas.contains(fatura1));
		
		filtro.filtrarFaturas(faturas);

		assertTrue(faturas.size() == 0);
		assertFalse(faturas.contains(fatura1));
	}
	
	@Test
	public void testAVL2() {
		LocalDate date29diasAtras = LocalDate.now().minusDays(29);
		fatura1 = new Fatura("FAT001", 2000.0, date29diasAtras, cliente);//
		
		faturas.add(fatura1);
		
		assertTrue(faturas.size() == 1);
		assertTrue(faturas.contains(fatura1));
		
		filtro.filtrarFaturas(faturas);

		assertTrue(faturas.size() == 1);
		assertTrue(faturas.contains(fatura1));
	}
	
	@Test
	public void testAVL3() {
		LocalDate date32diasAtras = LocalDate.now().minusDays(32);
		fatura1 = new Fatura("FAT001", 2000.0, date32diasAtras, cliente);//
		
		faturas.add(fatura1);
		
		assertTrue(faturas.size() == 1);
		assertTrue(faturas.contains(fatura1));
		
		filtro.filtrarFaturas(faturas);

		assertTrue(faturas.size() == 0);
		assertFalse(faturas.contains(fatura1));
	}
	
	@Test
	public void testAVL4() {
		LocalDate date29diasAtras = LocalDate.now().minusDays(29);
		fatura1 = new Fatura("FAT001", 2499.0, date29diasAtras, cliente);//
		
		faturas.add(fatura1);
		
		assertTrue(faturas.size() == 1);
		assertTrue(faturas.contains(fatura1));
		
		filtro.filtrarFaturas(faturas);

		assertTrue(faturas.size() == 1);
		assertTrue(faturas.contains(fatura1));
	}
	
	@Test
	public void testAVL5() {
		LocalDate date32diasAtras = LocalDate.now().minusDays(32);
		fatura1 = new Fatura("FAT001", 2000.0, date32diasAtras, cliente);//
		
		faturas.add(fatura1);
		
		assertTrue(faturas.size() == 1);
		assertTrue(faturas.contains(fatura1));
		
		filtro.filtrarFaturas(faturas);

		assertTrue(faturas.size() == 0);
		assertFalse(faturas.contains(fatura1));
	}
	
	@Test
	public void testAVL6() {
		LocalDate umMesAtras = LocalDate.now().minusMonths(1);
		cliente = new Cliente("João", umMesAtras, "PB");
		fatura1 = new Fatura("FAT001", 2500.0, LocalDate.of(2023, 4, 10), cliente);//
		
		faturas.add(fatura1);
		
		assertTrue(faturas.size() == 1);
		assertTrue(faturas.contains(fatura1));
		
		filtro.filtrarFaturas(faturas);

		assertTrue(faturas.size() == 1);
		assertTrue(faturas.contains(fatura1));
	}
	
	@Test
	public void testAVL7() {
        LocalDate doisMesesAtras = LocalDate.now().minusDays(62);
        cliente = new Cliente("João", doisMesesAtras, "PB");
		fatura1 = new Fatura("FAT001", 2500.0, LocalDate.of(2023, 4, 10), cliente);//
		
		faturas.add(fatura1);
		
		assertTrue(faturas.size() == 1);
		assertTrue(faturas.contains(fatura1));
		
		filtro.filtrarFaturas(faturas);

		assertTrue(faturas.size() == 0);
		assertFalse(faturas.contains(fatura1));
	}
	
	@Test
	public void testAVL8() {
		LocalDate umMesAtras = LocalDate.now().minusMonths(1);
		cliente = new Cliente("João", umMesAtras, "PB");
		fatura1 = new Fatura("FAT001", 2999.0, LocalDate.of(2023, 4, 10), cliente);//
		
		faturas.add(fatura1);
		
		assertTrue(faturas.size() == 1);
		assertTrue(faturas.contains(fatura1));
		
		filtro.filtrarFaturas(faturas);

		assertTrue(faturas.size() == 1);
		assertTrue(faturas.contains(fatura1));
	}
	
	@Test
	public void testAVL9() {
        LocalDate doisMesesAtras = LocalDate.now().minusDays(62);
        cliente = new Cliente("João", doisMesesAtras, "PB");
		fatura1 = new Fatura("FAT001", 2999.0, LocalDate.of(2023, 4, 10), cliente);//
		
		faturas.add(fatura1);
		
		assertTrue(faturas.size() == 1);
		assertTrue(faturas.contains(fatura1));
		
		filtro.filtrarFaturas(faturas);

		assertTrue(faturas.size() == 0);
		assertFalse(faturas.contains(fatura1));
	}
	
	@Test
	public void testAVL10() {
		cliente = new Cliente("João", LocalDate.of(2022, 3, 1), "SC");
		fatura1 = new Fatura("FAT001", 4001.0, LocalDate.of(2023, 4, 10), cliente);//
		
		faturas.add(fatura1);
		
		assertTrue(faturas.size() == 1);
		assertTrue(faturas.contains(fatura1));
		
		filtro.filtrarFaturas(faturas);

		assertTrue(faturas.size() == 0);
		assertFalse(faturas.contains(fatura1));
	}
	
	@Test
	public void testAVL11() {
		fatura1 = new Fatura("FAT001", 4000.0, LocalDate.of(2023, 4, 10), cliente);//
		
		faturas.add(fatura1);
		
		assertTrue(faturas.size() == 1);
		assertTrue(faturas.contains(fatura1));
		
		filtro.filtrarFaturas(faturas);

		assertTrue(faturas.size() == 1);
		assertTrue(faturas.contains(fatura1));
	}
}
