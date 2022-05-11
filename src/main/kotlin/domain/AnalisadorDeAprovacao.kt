package domain
import domain.criterios.CriterioDeAprovacao
import domain.Boletim
import domain.BoletimFechado

class AnalisadorDeAprovacao {
    lateinit var criterio : CriterioDeAprovacao


    fun defineCriterio(criterio: CriterioDeAprovacao) {
        this.criterio = criterio
    }

    fun fechaBoletim(boletim: Boletim) : BoletimFechado {
        var aprovado = criterio.estaAprovado(boletim)
        var mediaFinal = criterio.mediaFinal(boletim)
        return BoletimFechado(boletim.mediaEPs, boletim.mediaMiniEPs, mediaFinal, aprovado)
    }
}