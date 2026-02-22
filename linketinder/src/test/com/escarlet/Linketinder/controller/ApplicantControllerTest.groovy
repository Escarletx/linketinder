package com.escarlet.Linketinder.controller

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.BeforeEach
import static org.junit.jupiter.api.Assertions.*
import com.escarlet.Linketinder.model.entities.Applicant

class ApplicantControllerTest {
    private ApplicantController controller

    @BeforeEach
    void setUp() { this.controller = new ApplicantController() }

    @Test
    void "Deve retornar a listagem com pelo menos 5 candidatos pré-cadastrados " () {
        def list = controller.list()

        assertNotNull(list, "A lista de candidatos não pode ser nula")
        assertTrue(list.size() >=5, "A lista deve conter pelo menos 5 candidatos pré-cadastrados")
    }

    @Test
    void "Deve adicionar um novo candidato a lista com sucesso"() {
        int initSize = controller.list().size()

        def applicantMock = new Applicant(
                name: "Candidato1",
                email: "candidato1@email.com",
                cpf: "032.123.332-43",
                age: 26,
                state: "SP",
                cep: "8300-127",
                description: "Estudante de Engenharia de software focada em backend.",
                competences: ["Groovy", "Git", "Linux"]
        )
        controller.register(applicantMock)

        assertEquals(initSize + 1, controller.list().size())
        assertTrue(controller.list().contains(applicantMock))
    }
}
