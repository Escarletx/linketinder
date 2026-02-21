package com.escarlet.Linketinder.model.entities

abstract class User {
    private static int counter = 1
    final int id
    String name
    String email
    String state
    String cep
    String description
    List<String> competences = []

    User() {
        this.id = counter++
    }
}
