package com.escarlet.Linketinder.controller

import com.escarlet.Linketinder.data.MockData
import com.escarlet.Linketinder.model.entities.Applicant

class ApplicantController {
    private List<Applicant> applicantsList = []

    ApplicantController() {
        this.applicantsList = MockData.loadApplicants()
    }

    List<Applicant> list() {
        return this.applicantsList
    }

    void register (String name, String email, String cpf, int age, String state, String cep, String description, List<String> competences ) {
        boolean invalidAge = age <= 0
        boolean invalidCompetences = competences == null || competences.isEmpty()
        boolean invalidStrings = name == (null) || name.isBlank() || email == null || email.isBlank()

        if (invalidStrings || invalidCompetences)
            throw new IllegalArgumentException("Nome, email e competências são campos obrigatórios.")

        if (invalidAge)
            throw  new IllegalArgumentException("A idade não pode ser menor ou igual a 0")

        Applicant newApplicant = new Applicant(
                name: name,
                email: email,
                cpf: cpf,
                age: age,
                state: state,
                cep: cep,
                description: description,
                competences: competences
        )

        this.applicantsList.add(newApplicant)
    }
}
