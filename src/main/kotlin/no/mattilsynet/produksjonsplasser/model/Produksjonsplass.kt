package no.mattilsynet.produksjonsplasser.model
import jakarta.persistence.*
import java.sql.Timestamp


@Entity
@Table(name = "produksjonsplass")
data class Produksjonsplass(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val produksjonsplassid: Int = 0,

    val kommunenummer: String = "",
    val gaardsnummer: Int = 0,
    val bruksnummer: Int = 0,
    val bygningsnummer: Int = 0,
    val koordinater: String? = null,
    val koordinatsystem: String? = null,
    val opprettetdato: Timestamp = Timestamp(0),
    val lastchanged: Timestamp = Timestamp(0)
)