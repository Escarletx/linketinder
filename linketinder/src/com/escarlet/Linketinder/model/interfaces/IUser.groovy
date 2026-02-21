package com.escarlet.Linketinder.model.interfaces

// sera usado posteriormente para implementar login, por exemplo.
interface IUser {
    String getName()
    String getEmail()
    String getDescription()
    List<String> getCompetences()
}
