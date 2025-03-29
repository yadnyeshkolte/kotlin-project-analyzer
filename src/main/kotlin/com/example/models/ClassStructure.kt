package com.example

data class ClassStructure(
    val name: String,
    val isData: Boolean,
    val methods: List<FunctionStructure>,
    val properties: List<PropertyStructure>
)
