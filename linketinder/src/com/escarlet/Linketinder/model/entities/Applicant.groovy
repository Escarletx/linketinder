package com.escarlet.Linketinder.model.entities

class Applicant extends User{
    private static int counter = 1
    String cpf
    int age

    Applicant() {
        this.id = counter++
    }

    @Override
    String toString() {
        return """
        +-------------------------------------------+
        | ID: %d
        | Nome: %s
        | E-mail: %s
        | CPF: %s
        | Idade: %d
        | Estado: %s
        | Cep: %s
        | Descrição: %s
        | Competências: %s
        +-------------------------------------------+
        """.stripIndent().formatted(id, name, email, cpf, age, state, cep, description, competences)
    }
}
