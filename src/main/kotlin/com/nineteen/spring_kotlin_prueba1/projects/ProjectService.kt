package com.nineteen.spring_kotlin_prueba1.projects

import org.springframework.stereotype.Service

@Service
class ProjectService(val projectRepository: ProjectRepository) {
    fun findAll(): Iterable<Project> = projectRepository.findAll()
    fun create(project: Project) {
        projectRepository.save(project)
    }
}