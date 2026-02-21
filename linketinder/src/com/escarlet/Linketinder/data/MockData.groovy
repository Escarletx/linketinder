package com.escarlet.Linketinder.data

import com.escarlet.Linketinder.model.entities.Applicant
import com.escarlet.Linketinder.model.entities.Company

class MockData {
    static List<Applicant> loadApplicants() {
        return [
                new Applicant(
                        name: "Escarlet",
                        email: "escarlet@email.com",
                        cpf: "034.833.682-99",
                        age: 24,
                        state: "RO",
                        cep: "76830-727",
                        description: "Estudante de Engenharia de software.",
                        competences: ["Java", "Groovy", "Git", "Linux"]
                ),
                new Applicant(
                        name: "Pedro",
                        email: "pedro@email.com",
                        cpf: "045.823.765-10",
                        age: 34,
                        state: "SP",
                        cep: "0800-732",
                        description: "Estudante de Engenharia de software.",
                        competences: ["Java", "Groovy", "Git", "Linux"]
                )
        ]
    }

    static List<Company> loadCompanies() {
        return [
                new Company(
                        name: "ZG solucoes",
                        email: "zg@email.com",
                        cnpj: "11.111.111/0001-11",
                        county: "Brasil",
                        state: "GO",
                        cep: "02000-000",
                        description: "A ZG Soluções é uma empresa referência no desenvolvimento de sistemas para a gestão automatizada do ciclo de recebíveis de hospitais, clínicas e laboratórios"
                ),
                new Company(
                        name: "Acelera ZG",
                        email: "acelerazg@email.com",
                        cnpj: "22.222.222/0001-22",
                        county: "Brasil",
                        state: "GO",
                        cep: "74000-000",
                        description: "O Acelera ZG é um treinamento 100% online e gratuito para estudantes de tecnologia que querem desbloquear seu próximo nível no mundo da programação"
                )
        ]

    }
}
