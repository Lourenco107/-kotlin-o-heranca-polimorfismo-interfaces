class CalculadoraBonificacao {
    var total: Double = 0.0
        private set


    fun registra(funcionario: Funcionario) {
        this.total += funcionario.boneficacao
    }
//
//    fun registra(gerente: Gerente){
//        this.total += gerente.boneficacao
//    }
//
//    fun registra(diretor: Diretor){
//        this.total += diretor.boneficacao
//    }

}