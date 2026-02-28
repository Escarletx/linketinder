package com.escarlet.Linketinder.view

import com.escarlet.Linketinder.model.entities.Company
import com.escarlet.Linketinder.view.helpers.InputReader
import com.escarlet.Linketinder.controller.CompanyController

class MenuCLI {
    private InputReader inputReader
    private ApplicantView applicantView
    private CompanyController companyController

    MenuCLI() {
        this.inputReader = new InputReader()
        this.applicantView = new ApplicantView()
        this.companyController = new CompanyController()
    }

    void init() {
        while(true) {
            println "\n"+ "="*20 + "\n LINKETINDER \n" + "="*20
            println "1 - Listar Candidatos"
            println "2 - Listar Empresas"
            println "3 - Cadastrar-se como candidato"
            println "4 - Sair"
            println "="*20

            String option = inputReader.readStrings("Escolha uma opção: ")

            switch (option) {
            case "1":
                applicantView.listApplicants()
                break
            case "2":
                listCompany()
                break
            case "3":
                applicantView.registerApplicant()
                break
            case "4":
                println "\n Encerrado programa."
                return
            default:
                println "\n Opção inválida. Digite apenas as opções disponíveis no menu."
            }
        }
    }

    private void listCompany() {
        println "\n"+ "="*20 + "\n Lista de Empresas \n" + "="*20
        List<Company> companies = this.companyController.list()

        companies.each { c ->
            print c
        }
    }
}
