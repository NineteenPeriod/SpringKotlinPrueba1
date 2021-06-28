package com.nineteen.spring_kotlin_prueba1.projects

import org.springframework.validation.Errors
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import javax.validation.Valid


@RestController
@Validated
@RequestMapping("/api/v1/project")
class ProjectController(val projectRepository: ProjectRepository) {

    @GetMapping
    fun findAll(): Iterable<Project> = projectRepository.findAll()

    @PostMapping
    fun create(@Valid @RequestBody project: Project, errors: Errors): Any {
        return view(projectRepository.save(project))
    }

    fun view(project: Project) = mapOf("project" to project)

}