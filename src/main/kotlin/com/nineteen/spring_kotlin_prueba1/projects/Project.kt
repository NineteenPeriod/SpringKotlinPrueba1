@file:Suppress("unused", "unused")

package com.nineteen.spring_kotlin_prueba1.projects

import javax.persistence.*
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

@Entity
@Table(name = "projects")
data class Project(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int = 0,

    @Column(name = "name")
    @field:NotEmpty(message = "El campo nombre no debe estar vacío")
    var name: String,

    @Column(name = "description")
    @field:NotEmpty(message = "El campo descripcion no debe estar vacío")
    var description: String,

    ) {

    override fun toString(): String {
        return "Product(id='$id', name=$name, description=$description)"
    }
}



