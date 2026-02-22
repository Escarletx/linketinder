package com.escarlet.Linketinder.controller

import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.*

class CompanyControllerTest {
    @Test
    void "Deve retornar a listagem com pelo menos 5 empresas pré-cadastradas" () {
        def controller = new CompanyController()
        def list = controller.list()

        assertNotNull(list, "A lista de empresas não pode ser nula")
        assertTrue(list.size() >= 5, "A lista deve conter pelo menos 5 empresas pré-cadastradas")
    }
}
