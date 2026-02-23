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
            println "3 - Cadastrar-se como candidato"
            println "4 - Sair"
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
                registerApplicant()
                break
            case "4":
                println "\n Encerrado programa."
                return
            default:
                println "\n Opção inválida. Digite apenas as opções disponíveis no menu."
            }
        }
    }

    private void registerApplicant() {
        while(true) {
            try {
                println "\n"+ "="*20 + "\n Informe seus dados para cadastro \n" + "="*20
                String name = readString("\nNome completo (digite 'sair' para cancelar o cadastro): ")

                if(name.toLowerCase() == "sair") {
                    println "Cadastro cancelado. Retornando ao menu principal."
                    break
                }

                String email = readString("E-mail: ")
                String cpf = readString("CPF: ")
                int age = readAge("Idade: ")
                String state = readString("Estado: ")
                String cep = readString("CEP: ")
                String description = readString("Descrição: ")
                List<String> competences = readList("Competências (separadas por vírgula): ")

                applicantController.register(name, email, cpf, age, state, cep, description, competences)
                println "\n Candidato '${name}' cadastrado com sucesso!"
                break
            } catch (IllegalArgumentException e) {
                println "\n Erro ao cadastrar: ${e.message}"
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

    // Helpers
    private String readString(String label) {
        println (label)
        return input.nextLine().trim()
    }

    private int readAge(String label) {
        while(true) {
            println(label)
            try {
                int inputAge = input.nextLine().toInteger()
                if(inputAge > 0){
                    return inputAge
                } else {
                    println "Informe uma idade maior que zero"
                }

            } catch (NumberFormatException ignore) {
                println "Idade inválida. Digite apenas números maiores que 0"
            }
        }
    }

    private List<String> readList(String label) {
        while(true) {
            try {
                println(label)
                String input = input.nextLine()
                if (!input.isEmpty()) {
                    return input.split(',').collect {it.trim()}.findAll(){!it.isEmpty()}
                } else {
                    println "Cadastre pelo menos uma competência"
                }
            } catch(IllegalArgumentException ignore) {
                print "Competências inválidas. Cadastre as competências separadas por vírgula"
            }
        }
    }
}
