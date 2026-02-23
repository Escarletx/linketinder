package com.escarlet.Linketinder.model.entities

abstract class User {
    int id
    String name
    String email
    String state
    String cep
    String description
    List<String> competences = []
}
