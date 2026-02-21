package com.escarlet.Linketinder.model.entities

class Company extends User{
    String cnpj
    String county

    @Override
    String toString() {
        return """
        +-------------------------------------------+
        | ID: %d
        | name: %s
        | E-mail: %s
        | cep: %s
        | state: %s
        | county: %s
        | Descrição: %s
        | Competências: %s
        +-------------------------------------------+
        """.stripIndent().formatted(null, name, email, cep, state, county, description, competences)
    }
}
