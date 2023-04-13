package project;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FuncionarioTest {

    public Funcionario funcionario =
        new Funcionario("Fernando", "fernando@email.com", 3500.00, Cargo.DESENVOLVEDOR);

    @Test
    public void testNome() {
        assertEquals("Fernando", this.funcionario.getNome());
    }

    @Test
    public void testEmail() {
        assertEquals("fernando@email.com", funcionario.getEmail());
    }

    @Test
    public void testSalarioBase() {
        double salarioBase = funcionario.getSalarioBase();
        assertEquals(3500, salarioBase, 0.1);
    }

    @Test
    public void testCargo() {
        Cargo cargo = funcionario.getCargo();
        assertEquals(Cargo.DESENVOLVEDOR, cargo);
    }

}
