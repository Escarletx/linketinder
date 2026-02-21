package com.escarlet.Linketinder.view

import com.escarlet.Linketinder.model.entities.Company
import com.escarlet.Linketinder.model.entities.Applicant
import com.escarlet.Linketinder.controller.CompanyController
import com.escarlet.Linketinder.controller.ApplicantController

class MenuCLI {
    private Scanner input
    private CompanyController companyController
    private ApplicantController applicantController

    MenuCLI() {
        this.input = new Scanner(System.in)
        this.companyController = new CompanyController()
        this.applicantController = new ApplicantController()
    }

    void init() {
        while(true) {
            println "\n"+ "="*20 + "\n LINKETINDER \n" + "="*20
            println "1 - Listar Candidatos"
            println "2 - Listar Empresas"
            println "3 - Sair"
            println "="*20
            println "Escolha uma opção: "

            String option = input.nextLine()

            switch (option) {
            case "1":
                listApplicants()
                break
            case "2":
                listCompany()
                break
            case "3":
                println "\n Encerrado programa."
                return
            default:
                println "\n Opção inválida. Digite apenas as opções disponíveis no menu."
            }
        }
    }

    private void listApplicants() {
        println "\n"+ "="*20 + "\n Lista de Candidatos \n" + "="*20
        List<Applicant> applicants = this.applicantController.list()

        applicants.each {a ->
            println a
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
