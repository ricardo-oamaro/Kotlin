package br.com.alura.forum.model

import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany
import java.time.LocalDateTime

@Entity
data class Topico(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var titulo: String,
    var mensagem: String,
    @ManyToOne
    val curso: Curso,
    @ManyToOne
    val autor: Usuario,
    @Enumerated(value = EnumType.STRING)
    val status: StatusTopico = StatusTopico.NAO_RESPONDIDO,
    @OneToMany(mappedBy = "topico")
    val respostas: List<Resposta> = ArrayList(),
    val dataCriacao: LocalDateTime = LocalDateTime.now()
) {
    constructor() : this(
        id = null,
        titulo = "",
        mensagem = "",
        curso = Curso(
            id = null,
            nome = "",
            categoria = ""
        ),
        autor = Usuario(
            id = null,
            nome = "",
            email = ""
        ),
        status = StatusTopico.NAO_RESPONDIDO,
        respostas = ArrayList(),
        dataCriacao = LocalDateTime.now()
    ) {

    }

}