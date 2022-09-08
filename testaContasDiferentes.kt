fun testaContasDiferente() {
    val contaCorrente = ContaCorrente(
        titular = "lourenco",
        numero = 1600
    )
    val contaPoupanca = ContaPoupanca(
        titular = "Maryana",
        numero = 1000
    )


    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente ${contaCorrente.saldo}")
    println("saldo poupança ${contaPoupanca.saldo}")

    contaPoupanca.saca(100.0)
    contaCorrente.saca(100.0)

    println("saldo após saque corrente ${contaCorrente.saldo}")
    println("saldo após saque poupança ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo corrente após receber transferência: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaCorrente)

    println("saldo poupança após transferir para corrente: ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferência: ${contaCorrente.saldo}")
}