package com.escarlet.Linketinder.controller

import spock.lang.Subject
import spock.lang.Specification

class ApplicantControllerTest extends Specification {
    @Subject
    ApplicantController controller = new ApplicantController()

    def "Deve listar os candidatos carregados pelo MockData"() {
        when: "Pedimos a lista de candidatos"
        def list = controller.list()

        then: "A lista não deve ser nula"
        list != null
    }

    def "Deve registrar um novo candidato com sucesso quando os dados são válidos"() {
        given: "Dados válidos de um candidato"
        String name = "Escarlet"
        String email = "escarlet@teste.com"
        String cpf = "123.456.789-00"
        int age = 25
        String state = "RO"
        String cep = "76800-000"
        String description = "Estudante java"
        List<String> competences = ["Java", "Groovy"]
        int size = controller.list().size()

        when: "Chamamos o método register"
        controller.register(name, email, cpf, age, state, cep, description, competences)

        then: "A lista deve ter aumentado em 1"
        controller.list().size() == size + 1

        and: "O último candidato da lista deve ter o email correto"
        controller.list().last().email == email
    }
}
