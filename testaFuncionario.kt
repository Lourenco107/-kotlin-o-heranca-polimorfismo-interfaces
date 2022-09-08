fun testaFuncionario() {
    val maryana = Analista(
        nome = "maryana",
        cpf = "151.062.067.23",
        salario = 1000.0,
    )
    val lourenco = Analista(
        nome = "lourenco",
        cpf = "11804929788",
        salario = 1600.0
    )

    println("nome ${maryana.nome}")
    println("cpf ${maryana.cpf}")
    println("salario ${maryana.salario}")
    println("bonificação ${maryana.boneficacao}")

    println()
    println("nome ${lourenco.nome}")
    println("cpf ${lourenco.cpf}")
    println("salario ${lourenco.salario}")
    println("bonificação ${lourenco.boneficacao}")

    val kaua = Gerente(
        nome = "kaua",
        cpf = "222.222.2222-22",
        salario = 2000.0,
        senha = 1234
    )

    println()
    println("nome ${kaua.nome}")
    println("cpf ${kaua.cpf}")
    println("salario ${kaua.salario}")
    println("bonificação ${kaua.boneficacao}")

    if (kaua.autentica(1234)) {
        println("autenticou com sucesso")
    } else {
        println("Falha na autenticação")
    }

    val lessandra = Diretor(
        nome = "lessandra",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 3321,
        plr = 200.0

    )
    println()
    println("nome ${lessandra.nome}")
    println("cpf ${lessandra.cpf}")
    println("salario ${lessandra.salario}")
    println("bonificação ${lessandra.boneficacao}")
    println("plr ${lessandra.plr}")

    if (lessandra.autentica(3321)) {
        println("autenticou com sucesso")
    } else {
        println("Falha na autenticação")
    }

    val armando = Analista(
        nome = "armando",
        cpf = "444.444.444--44",
        salario = 3000.0
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(maryana)
    calculadora.registra(lourenco)
    calculadora.registra(kaua)
    calculadora.registra(lessandra)
    calculadora.registra(armando)

    println("total de bonificação: ${calculadora.total}")
}