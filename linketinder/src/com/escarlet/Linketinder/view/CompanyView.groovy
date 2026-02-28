package com.escarlet.Linketinder.view

import com.escarlet.Linketinder.model.entities.Company
import com.escarlet.Linketinder.view.helpers.InputReader
import com.escarlet.Linketinder.controller.CompanyController

class CompanyView {
    private InputReader inputReader
    private CompanyController controller

    CompanyView(CompanyController controller, InputReader inputReader) {
        this.inputReader = inputReader
        this.controller = controller
    }

    void register() {
        while(true) {
            try {
                println "\n"+ "="*20 + "\n Informe seus dados para cadastro \n" + "="*20
                String name = inputReader.readStrings("\nNome completo da empresa (digite 'sair' para cancelar o cadastro): ")

                if(name.toLowerCase() == "sair") {
                    println "Cadastro cancelado. Retornando ao menu principal."
                    break
                }

                String email = inputReader.readStrings("E-mail: ")
                String cnpj = inputReader.readStrings("CNPJ: ")
                String country = inputReader.readStrings("Pais: ")
                String state = inputReader.readStrings("Estado: ")
                String cep = inputReader.readStrings("CEP: ")
                String description = inputReader.readStrings("Descrição: ")
                List<String> competences = inputReader.readListCompetences("Competências (separadas por vírgula): ")

                controller.register(name, email, cnpj, country, state, cep, description, competences)
                println "\n Empresa '${name}' cadastrada com sucesso!"
                break
            } catch (IllegalArgumentException e) {
                println "\n Erro ao cadastrar: ${e.message}"
            }
        }
    }

    void list() {
        println "\n"+ "="*20 + "\n Lista de Empresas \n" + "="*20
        List<Company> companies = this.controller.list()

        companies.each { c ->
            print c
        }
    }
}
