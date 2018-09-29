package br.com.fernando.blocodenotas.repository

import br.com.fernando.blocodenotas.model.Nota
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface NotaRepository: MongoRepository<Nota, String>{

    //fun findByTitulo(titulo:String) : Nota

    //fun findByTituloContaining(titulo:String) : Nota

    fun findByTituloContainingIgnoreCase(titulo:String) : List<Nota>

}