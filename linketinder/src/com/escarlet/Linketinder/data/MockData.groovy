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
                        description: "Estudante de Engenharia de software focada em backend.",
                        competences: ["Java", "Groovy", "Git", "Linux"]
                ),
                new Applicant(
                        name: "Pedro",
                        email: "pedro@email.com",
                        cpf: "045.823.765-10",
                        age: 34,
                        state: "SP",
                        cep: "0800-732",
                        description: "Estudante de Engenharia de software com foco em automação.",
                        competences: ["SQL", "R", "PowerBI", "Linux"]
                ),
                new Applicant(
                        name: "Luciana Oliveira",
                        email: "luciana.dev@email.com",
                        cpf: "123.456.789-00",
                        age: 28,
                        state: "MG",
                        cep: "30140-010",
                        description: "Desenvolvedora Fullstack entusiasta de metodologias ágeis.",
                        competences: ["C#", ".NET", "SQL", "Angular"]
                ),
                new Applicant(
                        name: "Marcos Vinícius",
                        email: "marcos.v@email.com",
                        cpf: "987.654.321-11",
                        age: 22,
                        state: "RJ",
                        cep: "20020-050",
                        description: "Focado em desenvolvimento mobile e UX Design.",
                        competences: ["Flutter", "Dart", "Firebase", "Git"]
                ),
                new Applicant(
                        name: "Beatriz Santos",
                        email: "bia.santos@email.com",
                        cpf: "555.444.333-22",
                        age: 26,
                        state: "SC",
                        cep: "88010-000",
                        description: "Desenvolvedora Backend com experiência em arquitetura de microsserviços.",
                        competences: ["Java", "Spring Boot", "Docker", "AWS"]
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
                ),
                new Company(
                        name: "Tech Solutions",
                        email: "rh@techsolutions.com",
                        cnpj: "33.333.333/0001-33",
                        county: "Brasil",
                        state: "SP",
                        cep: "04538-132",
                        description: "Consultoria especializada em transformação digital e outsourcing de TI."
                ),
                new Company(
                        name: "FinBank Digital",
                        email: "vagas@finbank.com",
                        cnpj: "44.444.444/0001-44",
                        county: "Brasil",
                        state: "PR",
                        cep: "80020-010",
                        description: "Banco digital focado em soluções de crédito para microempreendedores."
                ),
                new Company(
                        name: "Inova Tech",
                        email: "talentos@inovatech.io",
                        cnpj: "55.555.555/0001-55",
                        county: "Brasil",
                        state: "RS",
                        cep: "90010-001",
                        description: "Startup de IA voltada para otimização de logística e transporte de carga."
                )
        ]

    }
}
