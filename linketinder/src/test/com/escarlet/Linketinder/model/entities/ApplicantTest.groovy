package com.escarlet.Linketinder.model.entities

import spock.lang.Specification

class ApplicantTest extends Specification {
    def "Deve validar todos os getters e setters herdados de User"() {
        given:"Um novo objeto Applicant"
        def applicant = new Applicant()

        when: "Atribuímos valores aos campos da classe pai (User)"
        applicant.name = "Escarlet"
        applicant.email = "escarlet@teste.com"
        applicant.state = "RO"
        applicant.cep = "76800-000"
        applicant.description = "Estudante de Java"
        applicant.competences = ["Java", "Groovy"]

        then:"Os getters devem retornar os valores exatos"
        applicant.getName() == "Escarlet"
        applicant.getEmail() == "escarlet@teste.com"
        applicant.getState() == "RO"
        applicant.getCep() == "76800-000"
        applicant.getDescription() == "Estudante de Java"
        applicant.getCompetences() == ["Java", "Groovy"]
    }

    def "Deve validar os getters e setters específicos da classe Applicant"() {
        given: "Um novo objeto Applicant"
        def applicant = new Applicant()

        when: "Atribuimos valores aos campos do objeto"
        applicant.cpf = "035.863.682-19"
        applicant.age = 24

        then: "Os getters devem retornar os valores exatos"
        applicant.getCpf() == "035.863.682-19"
        applicant.getAge() == 24
    }

    def "Deve garantir o ID gerado automaticamente"() {
        given: "Dois novos candidatos"
        def apply1 = new Applicant()
        def apply2 = new Applicant()

        expect: "O ID deve ser populado pelo construtor e ser sequencial"
        apply1.id != null
        apply2.id == apply1.id + 1
    }

    def "Deve criar um candidato com todos os atributos herdados e próprios"() {
        given: "Uma lista de competências"
        def listaCompetencias = ["Harmony", "Flash"]

        when: "Instanciamos um Applicant com o mapa de propriedades do Groovy"
        def applicant = new Applicant(
                name: "Pedro Teste",
                email: "pedro@pedro",
                cpf: "123.456.789-00",
                age: 34,
                state: "SP",
                cep: "01001-000",
                description: "Animador e diretor de animaçao",
                competences: listaCompetencias
        )

        then: "Os atributos devem ser armazenados corretamente"
        applicant.name == "Pedro Teste"
        applicant.email == "pedro@pedro"
        applicant.cpf == "123.456.789-00"
        applicant.age == 34
        applicant.state == "SP"
        applicant.cep == "01001-000"
        applicant.description == "Animador e diretor de animaçao"
        applicant.competences == ["Harmony", "Flash"]

        and: "O ID deve ter sido incrementado automaticamente pelo construtor"
        applicant.id > 0
    }

    def "Deve formatar o toString no estilo de cartão corretamente"() {
        given: "Um objeto Applicant populado"
        def applicant = new Applicant(
                name: "Pedro Teste",
                email: "pedro@pedro",
                cpf: "123.456.789-00",
                age: 34,
                state: "SP",
                cep: "01001-000",
                description: "Animador e diretor de animaçao",
                competences: ["Harmony", "Flash"]
        )

        when: "Chamamos o método toString"
        String card = applicant.toString()

        then: "O texto retornado deve conter as informações formatadas"
        card.contains("Nome: Pedro Teste")
        card.contains("E-mail: pedro@pedro")
        card.contains("CPF: 123.456.789-00")
        card.contains("Idade: 34")
        card.contains("Estado: SP")
        card.contains("Cep: 01001-000")
        card.contains("Competências: [Harmony, Flash]")
    }
}
