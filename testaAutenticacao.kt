fun testaAutencicacao() {
    val gerente = Gerente(
        nome = "lourenco",
        cpf = "118.049.297-88",
        salario = 1600.0,
        senha = 12345
    )
    val diretora = Diretor(
        nome = "lessandra",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 2000,
        plr = 200.0
    )

    val cliente = Cliente(
        nome = "joao",
        cpf = "333.333.333-33",
        senha = 1234
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 12345)
    sistema.entra(diretora, 2000)
    sistema.entra(cliente, 1234)

}