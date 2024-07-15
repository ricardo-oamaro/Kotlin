package br.com.alura.forum.dto

import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull

data class NovoTopicoForm (
    @field:NotEmpty(message = "Titulo nao pode ser em branco")
    @field:NotEmpty
    val titulo: String,
    @field:NotEmpty
    @field:NotEmpty(message = "Mensagem nao pode ser em branco")
    val mensagem: String,
    @field:NotNull
    val idCurso: Long,
    @field:NotNull
    val idAutor: Long
)