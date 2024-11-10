package com.example.demo.dto

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank

data class UsuarioDTO(
    @field:NotBlank(message = "El nombre es obligatorio")
    val nombre: String,

    @field:Email(message = "El correo debe ser válido")
    val correo: String
)
