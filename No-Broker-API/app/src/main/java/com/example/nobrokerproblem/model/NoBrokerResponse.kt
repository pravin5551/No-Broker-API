package com.example.nobrokerproblem.model

import com.google.gson.annotations.SerializedName

data class NoBrokerResponse(

	@field:SerializedName("NoBrokerResponse")
	val noBrokerResponse: List<NoBrokerResponseItem?>? = null
)

data class NoBrokerResponseItem(

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("subTitle")
	val subTitle: String? = null,

	@field:SerializedName("title")
	val title: String? = null
)
