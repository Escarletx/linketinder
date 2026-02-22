package com.escarlet.Linketinder.controller

import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.*

class ApplicantControllerTest {
    @Test
    void "Deve retornar a listagem com pelo menos 5 candidatos pré-cadastrados " () {
        def controller = new ApplicantController()
        def list = controller.list()

        assertNotNull(list, "A lista de candidatos não pode ser nula")
        assertTrue(list.size() >=5, "A lista deve conter pelo menos 5 candidatos pré-cadastrados")
    }

}
