class Analista(
    nome: String,
    cpf: String,
    salario: Double,

    ) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override val boneficacao: Double
        get() {
            return salario * 0.10
        }
}