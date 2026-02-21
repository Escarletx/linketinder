package com.escarlet.Linketinder.controller

import com.escarlet.Linketinder.data.MockData
import com.escarlet.Linketinder.model.entities.Company

class CompanyController {
    private List<Company> companyList = []

    CompanyController() {
        this.companyList = MockData.loadCompanies()
    }

    List<Company> list() {
        return this.companyList
    }
}
