package com.escarlet.Linketinder.controller

import com.escarlet.Linketinder.data.MockData
import com.escarlet.Linketinder.model.entities.Company

class CompanyController {
    private List<Company> companyList = []

    CompanyController() {
        this.companyList = MockData.loadCompanies()
    }

    void register (String name, String email, String cnpj, String country, String state, String cep, String description, List<String> competences ) {
        boolean invalidCompetences = competences == null || competences.isEmpty()
        boolean invalidStrings = name == (null) || name.isBlank() || email == null || email.isBlank()

        if (invalidStrings || invalidCompetences)
            throw new IllegalArgumentException("Nome, email e competências são campos obrigatórios.")

        Company company = new Company(
                name: name,
                email: email,
                cnpj: cnpj,
                county: country,
                state: state,
                cep: cep,
                description: description,
                competences: competences
        )

        this.companyList.add(company )
    }

    List<Company> list() {
        return this.companyList
    }
}
