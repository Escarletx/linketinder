package com.escarlet.Linketinder.model.entities

class Applicant extends User{
    String cpf
    int age

    @Override
    String toString() {
        return """
        +-------------------------------------------+
        | ID: %d
        | name: %s
        | E-mail: %s
        | Idade: %d
        | state: %s
        | cep: %s
        | Descrição: %s
        | Competências: %s
        +-------------------------------------------+
           """.stripIndent().formatted(null, name, email, age, state, cep, description, competences)
    }
}
