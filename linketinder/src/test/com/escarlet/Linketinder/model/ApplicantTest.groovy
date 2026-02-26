package com.escarlet.Linketinder.model

import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.*
import com.escarlet.Linketinder.model.entities.Applicant

class ApplicantTest {
    @Test
    void "Deve criar um candidato e armazenar seus atributos"() {
        List<String> competences = ["Harmony", "Flash"]

        Applicant applicant = new Applicant(
                name: "Pedro Teste",
                email: "pedro@pedro",
                cpf:"123.456.789-00",
                age: 34,
                state: "SP",
                cep: "01001-000",
                description: "Animador e diretor de animaçao",
                competences: competences
        )

        assertEquals("Pedro Teste", applicant.name)
        assertEquals("pedro@pedro", applicant.email)
        assertEquals(34, applicant.age)
        assertEquals("SP", applicant.state)
        assertEquals("01001-000", applicant.cep)
        assertEquals("Animador e diretor de animaçao", applicant.description)
        assertEquals(competences, competences)
        assertTrue(applicant.id > 0, "O ID deve ser gerado automaticamente")
    }

    @Test
    void "Montar toString corretamente no estilo de cartao"() {
        Applicant applicant = new Applicant(
                name: "Pedro Teste",
                email: "pedro@pedro",
                cpf:"123.456.789-00",
                age: 34,
                state: "SP",
                cep: "01001-000",
                description: "Animador e diretor de animaçao",
                competences: ["Harmony", "Flash"]
        )

        String cardFormat = applicant.toString()

        assertTrue(cardFormat.contains("Nome: Pedro Teste"))
        assertTrue(cardFormat.contains("E-mail: pedro@pedro"))
        assertTrue(cardFormat.contains("CPF: 123.456.789-00"))
        assertTrue(cardFormat.contains("Idade: 34"))
        assertTrue(cardFormat.contains("Estado: SP"))
        assertTrue(cardFormat.contains("Cep: 01001-000"))
        assertTrue(cardFormat.contains("Descrição: Animador e diretor de animaçao"))
        assertTrue(cardFormat.contains("Competências: [Harmony, Flash]"))
    }
}
