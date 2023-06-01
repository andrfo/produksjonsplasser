package no.mattilsynet.produksjonsplasser.controller

import no.mattilsynet.produksjonsplasser.repoitory.ProduksjonsplassRepository
import org.springframework.web.bind.annotation.*

@RestController
class ProduksjonsplassController(private val repository: ProduksjonsplassRepository) {

    @GetMapping("/produksjonsplass/{id}")
    fun findByProduksjonsplassid(@PathVariable id: Int) =
        repository.findByProduksjonsplassid(id)
}
