package project;

public class Calculadora {
    public double calculaSalarioLiquido(Funcionario funcionario) {
        Cargo cargoFuncionario = funcionario.getCargo();
        double salarioBase = funcionario.getSalarioBase();

        double desconto = 0.0;
        if (cargoFuncionario.equals(Cargo.DESENVOLVEDOR)) {
            if (salarioBase >= 3000)
                desconto = 0.2;
            else
                desconto = 0.1;

        } else if (cargoFuncionario.equals(Cargo.DBA) || cargoFuncionario.equals(Cargo.TESTADOR)) {
            if (salarioBase >= 2000)
                desconto = 0.25;
            else
                desconto = 0.15;

        } else if (cargoFuncionario.equals(Cargo.GERENTE)) {
            if (salarioBase >= 5000)
                desconto = 0.3;
            else
                desconto = 0.2;

        }

        return salarioBase * (1 - desconto);

    }
}
