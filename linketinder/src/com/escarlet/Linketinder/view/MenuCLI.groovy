package com.escarlet.Linketinder.view

class MenuCLI {
    private Scanner input

    MenuCLI() {
        this.input = new Scanner(System.in)
    }

    void init() {
        while(true) {
        println "\n"+ "="*20
        println " LINKETINDER "
        println "="*20
        println "1 - Listar Candidatos"
        println "2 - Listar Empresas"
        println "3 - Sair"
        println "="*20
        println "Escolha uma opção: "

        String option = input.nextLine()

            switch (option) {
            case "1":
                println "Comming soon"
                break
            case "2":
                println "Comming soon"
                break
            case "3":
                println "\n Encerrado programa."
                return
            default:
                println "\n Opção inválida. Digite apenas as opções disponíveis no menu."
            }
        }
    }
}
