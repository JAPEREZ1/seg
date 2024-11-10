package com.example.demo.controller

import com.example.demo.dto.UsuarioDTO
import com.example.demo.service.UsuarioService
import com.example.demo.util.JSendResponse
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/usuarios")
class UsuarioController(private val usuarioService: UsuarioService) {

    @PostMapping
    fun crearUsuario(@Validated @RequestBody usuarioDTO: UsuarioDTO): ResponseEntity<JSendResponse> {
        val usuario = usuarioService.crearUsuario(usuarioDTO)
        return ResponseEntity.ok(JSendResponse.success(usuario))
    }

    @GetMapping
    fun obtenerUsuarios(): ResponseEntity<JSendResponse> {
        val usuarios = usuarioService.obtenerUsuarios()
        return ResponseEntity.ok(JSendResponse.success(usuarios))
    }
}
