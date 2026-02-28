package com.escarlet.Linketinder.view

import com.escarlet.Linketinder.view.helpers.InputReader

class MenuCLI {
    private InputReader inputReader
    private ApplicantView applicantView
    private CompanyView companyView

    MenuCLI() {
        this.inputReader = new InputReader()
        this.applicantView = new ApplicantView()
        this.companyView = new CompanyView()
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
                applicantView.list()
                break
            case "2":
                companyView.list()
                break
            case "3":
                applicantView.register()
                break
            case "4":
                companyView.register()
                break
            case "5":
                println "\n Encerrado programa."
                return
            default:
                println "\n Opção inválida. Digite apenas as opções disponíveis no menu."
            }
        }
    }
}
