package br.com.fiap.pokedex.model

import com.google.gson.annotations.SerializedName

data class Pokemon(@SerializedName("number") val numero: String,
                   @SerializedName("name") val nome: String,
                   @SerializedName("imageURL") val urlImagem: String,
                   @SerializedName("attack") val ataque: Int,
                   @SerializedName("defense") val defesa: Int,
                   @SerializedName("generation") val geracao: Int,
                   @SerializedName("ps") val ps: Int,
                   @SerializedName("velocity") val velocidade: Int,
                   @SerializedName("id") val id: Int)