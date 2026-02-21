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
}
