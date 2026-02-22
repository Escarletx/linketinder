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

    void register (Applicant newApplicant) {
        if (newApplicant == null) {
            throw new IllegalArgumentException("O candidato não pode ser nulo")
        }

        boolean invalidAge = newApplicant.age <= 0
        boolean invalidCompetences = newApplicant.competences == null || newApplicant.competences.isEmpty()
        boolean invalidStrings = newApplicant.name == (null) || newApplicant.name.isBlank() || newApplicant.email == null || newApplicant.email.isBlank()

        if (invalidStrings || invalidCompetences)
            throw new IllegalArgumentException("Nome, email e competências são campos obrigatórios.")

        if (invalidAge)
            throw  new IllegalArgumentException("A idade não pode ser menor ou igual a 0")

        this.applicantsList.add(newApplicant)
    }
}
