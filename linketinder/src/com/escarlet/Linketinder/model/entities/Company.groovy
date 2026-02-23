package com.escarlet.Linketinder.model.entities

class Company extends User{
    private static int counter = 1
    String cnpj
    String county

    Company() {
        this.id = counter++
    }

    @Override
    String toString() {
        return """
        +-------------------------------------------+
        | ID: %d
        | Nome: %s
        | E-mail: %s
        | CNPJ: %s
        | Pais: %s
        | Estado: %s
        | Cep: %s
        | Descrição: %s
        | Competências: %s
        +-------------------------------------------+
        """.stripIndent().formatted(id, name, email, cnpj, county, state, cep, description, competences)
    }
}
