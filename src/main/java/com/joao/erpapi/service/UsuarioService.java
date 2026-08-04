package com.joao.erpapi.service;

import com.joao.erpapi.entity.Usuario;
import com.joao.erpapi.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;


@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public Usuario salvarUsuario(Usuario usuario) {
        try {
            emailExiste(usuario.getEmail());
            usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
        } catch {

        }
    }

    public void emailExiste(String email){
        try {
            boolean existe = usuarioRepository.existsByEmail(email);
            if(existe){
                throw new ConflictException("Email já cadastrado: " + email)
            }
        } catch () {

        }
    }

//    public boolean verificaEmailExistente(String email) {
//        return usuarioRepository.existsByEmail(email);
//    }

    public Usuario findByEmail(String email) {
        return usuarioRepository.findByEmail(email).orElseThrow(
                () -> new ResourceNotFoundException("Email não encontrado: " + email)
        );
    }

    public void deleteByEmail(String email) {
        usuarioRepository.delete(findByEmail(email));
    }
}
