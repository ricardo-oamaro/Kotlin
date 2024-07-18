package br.com.alura.forum.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import java.time.LocalDateTime

@Entity
data class Resposta(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val mensagem: String,
    @ManyToOne
    val topico: Topico,
    @ManyToOne
    val autor: Usuario,
    val solucao: Boolean
) {
    constructor() : this(
        id = null,
        mensagem = "",
        topico = Topico(
            id = null,
            titulo = "",
            mensagem = "",
            curso = Curso(),
            autor = Usuario(),
            status = StatusTopico.NAO_RESPONDIDO,
            respostas = ArrayList(),
            dataCriacao = LocalDateTime.now()
        ),
        autor = Usuario(
            id = null,
            nome = "",
            email = ""
        ),
        solucao = false
    ) {

    }
}
