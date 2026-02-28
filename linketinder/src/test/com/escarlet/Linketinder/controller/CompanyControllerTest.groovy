package com.escarlet.Linketinder.controller

import spock.lang.Subject
import spock.lang.Specification

class CompanyControllerTest extends Specification {
    @Subject
    CompanyController controller = new CompanyController()

    def "Deve listar as empresas carregados pelo MockData"() {
        when: "Pedimos a lista de empresas"
        def lista = controller.list()

        then: "A lista não deve ser nula"
        lista != null
    }

    def "Deve registrar uma nova empresa com sucesso quando os dados são válidos"() {
        given: "Dados válidos de uma empresa"
        String name = "Company Teste"
        String email = "company@teste.com"
        String cnpj = "35.546.683/0001-61"
        String country = "Brasil"
        String state = "SP"
        String cep = "76800-000"
        String description = "Empresa teste"
        List<String> competences = ["Testes", "Groovy"]
        int size = controller.list().size()

        when: "Chamamos o método register"
        controller.register(name, email, cnpj, country, state, cep, description, competences)

        then: "A lista deve ter aumentado em 1"
        controller.list().size() == size + 1

        and: "A ultima empresa da lista deve ter o email correto"
        controller.list().last().email == email
    }
}
