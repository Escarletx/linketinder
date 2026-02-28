package com.escarlet.Linketinder.view

import com.escarlet.Linketinder.model.entities.Applicant
import com.escarlet.Linketinder.view.helpers.InputReader
import com.escarlet.Linketinder.controller.ApplicantController

class ApplicantView {
    private ApplicantController controller
    private InputReader inputReader

    ApplicantView(ApplicantController controller, InputReader inputReader) {
        this.controller = controller
        this.inputReader = inputReader
    }

    void registerApplicant() {
        while(true) {
            try {
                println "\n"+ "="*20 + "\n Informe seus dados para cadastro \n" + "="*20
                String name = inputReader.readStrings("\nNome completo (digite 'sair' para cancelar o cadastro): ")

                if(name.toLowerCase() == "sair") {
                    println "Cadastro cancelado. Retornando ao menu principal."
                    break
                }

                String email = inputReader.readStrings("E-mail: ")
                String cpf = inputReader.readStrings("CPF: ")
                int age = inputReader.readAge("Idade: ")
                String state = inputReader.readStrings("Estado: ")
                String cep = inputReader.readStrings("CEP: ")
                String description = inputReader.readStrings("Descrição: ")
                List<String> competences = inputReader.readListCompetences("Competências (separadas por vírgula): ")

                controller.register(name, email, cpf, age, state, cep, description, competences)
                println "\n Candidato '${name}' cadastrado com sucesso!"
                break
            } catch (IllegalArgumentException e) {
                println "\n Erro ao cadastrar: ${e.message}"
            }
        }
    }

    void listApplicants() {
        println "\n"+ "="*20 + "\n Lista de Candidatos \n" + "="*20
        List<Applicant> applicants = this.controller.list()

        applicants.each {a ->
            println a
        }
    }
}
