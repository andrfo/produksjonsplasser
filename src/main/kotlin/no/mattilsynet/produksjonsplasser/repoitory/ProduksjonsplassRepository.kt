package no.mattilsynet.produksjonsplasser.repoitory

import no.mattilsynet.produksjonsplasser.model.Produksjonsplass
import org.springframework.data.jpa.repository.JpaRepository

interface ProduksjonsplassRepository : JpaRepository<Produksjonsplass, Int> {
    fun findByProduksjonsplassid(produksjonsplassid: Int): Produksjonsplass
}