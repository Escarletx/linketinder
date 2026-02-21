package com.escarlet.Linketinder.model.entities

abstract class User {
    String name
    String email
    String state
    String cep
    String description
    List<String> competences = []
}
