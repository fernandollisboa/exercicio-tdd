package projeto;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

public class FiltroFaturas {

	public void filtrarFaturas(List<Fatura> faturas) {
		
		LocalDate umMesAtras = LocalDate.now().minusMonths(1);
        LocalDate doisMesesAtras = LocalDate.now().minusMonths(2);
        List<String> estadosSul = List.of("RS", "SC", "PR");
        
        Iterator<Fatura> iterator = faturas.iterator();
        while (iterator.hasNext()) {
        	Fatura fatura = iterator.next();
        	
        	if (fatura.getValor() < 2000) {
                iterator.remove();
            } else if (fatura.getValor() >= 2000 && fatura.getValor() < 2500 && fatura.getData().isBefore(umMesAtras)) {
            	iterator.remove();
            } else if (fatura.getValor() >= 2500 && fatura.getValor() < 3000 && fatura.getCliente().getDataInclusao().isBefore(doisMesesAtras)) {
            	iterator.remove();
            } else if (fatura.getValor() > 4000 && estadosSul.contains(fatura.getCliente().getEstado())) {
            	iterator.remove();
            }
        }
	}
}
