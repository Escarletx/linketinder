package com.escarlet.Linketinder.model.entities

import spock.lang.Specification

class CompanyTest extends Specification {
    def "Deve validar todos os getters e setters herdados de User"() {
        given:"Um novo objeto Company"
        def company = new Company()

        when: "Atribuímos valores aos campos da classe pai (User)"
        company.name = "Company Teste"
        company.email = "company@teste.com"
        company.state = "RO"
        company.cep = "76800-000"
        company.description = "Company de teste"
        company.competences = ["Testes", "vagas"]

        then:"Os getters devem retornar os valores exatos"
        company.getName() == "Company Teste"
        company.getEmail() == "company@teste.com"
        company.getState() == "RO"
        company.getCep() == "76800-000"
        company.getDescription() == "Company de teste"
        company.getCompetences() == ["Testes", "vagas"]
    }

    def "Deve validar os getters e setters específicos da classe Company"() {
        given: "Um novo objeto Company"
        def company = new Company()

        when: "Atribuimos valores aos campos do objeto"
        company.cnpj = "35.546.683/0001-61"
        company.county = "Brasil"

        then: "Os getters devem retornar os valores exatos"
        company.getCnpj() == "35.546.683/0001-61"
        company.getCounty() == "Brasil"
    }

    def "Deve garantir o ID gerado automaticamente"() {
        given: "Duas novas empresas"
        def company1 = new Company()
        def company2 = new Company()

        expect: "O ID deve ser populado pelo construtor e ser sequencial"
        company1.id != null
        company2.id == company1.id + 1
    }

    def "Deve criar uma empresa com todos os atributos herdados e próprios"() {
        given: "Uma lista de competências"
        def listaCompetencias = ["Testes", "Vagas"]

        when: "Instanciamos uma Company com o mapa de propriedades do Groovy"
        def company = new Company(
                name: "Company Teste",
                email: "company@teste.com",
                cnpj: "35.546.683/0001-61",
                county: "Brasil",
                state: "SP",
                cep: "01001-000",
                description: "Empresa teste",
                competences: listaCompetencias
        )

        then: "Os atributos devem ser armazenados corretamente"
        company.name == "Company Teste"
        company.email == "company@teste.com"
        company.cnpj == "35.546.683/0001-61"
        company.county == "Brasil"
        company.state == "SP"
        company.cep == "01001-000"
        company.description == "Empresa teste"
        company.competences == listaCompetencias

        and: "O ID deve ter sido incrementado automaticamente pelo construtor"
        company.id > 0
    }

    def "Deve formatar o toString no estilo de cartão corretamente"() {
        given: "Um objeto Company populado"
        def company = new Company(
                name: "Company Teste",
                email: "company@teste.com",
                cnpj: "35.546.683/0001-61",
                county: "Brasil",
                state: "SP",
                cep: "01001-000",
                description: "Empresa teste",
                competences: ["Java", "Flash"]
        )

        when: "Chamamos o método toString"
        String card = company.toString()

        then: "O texto retornado deve conter as informações formatadas"
        card.contains("Nome: Company Teste")
        card.contains("E-mail: company@teste.com")
        card.contains("CNPJ: 35.546.683/0001-61")
        card.contains("Pais: Brasil")
        card.contains("Estado: SP")
        card.contains("Cep: 01001-000")
        card.contains("Competências: [Java, Flash]")
    }
}
