package com.example.demo.service

import com.example.demo.dto.UsuarioDTO
import com.example.demo.model.Usuario
import com.example.demo.repository.UsuarioRepository
import org.springframework.stereotype.Service

@Service
class UsuarioService(private val usuarioRepository: UsuarioRepository) {

    fun crearUsuario(usuarioDTO: UsuarioDTO): Usuario {
        val usuario = Usuario(nombre = usuarioDTO.nombre, correo = usuarioDTO.correo)
        return usuarioRepository.save(usuario)
    }

    fun obtenerUsuarios(): List<Usuario> = usuarioRepository.findAll()
}
