package com.escarlet.Linketinder.view.helpers

class InputReader {
    private Scanner input

    InputReader() {
        this.input = new Scanner(System.in)
    }

    String readStrings (String label) {
        print(label)
        return input.nextLine().trim()
    }

    int readAge(String label) {
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

    List<String> readListCompetences(String label) {
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
