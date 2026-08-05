package com.joao.erpapi.service;

import com.joao.erpapi.entity.Usuario;
import com.joao.erpapi.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public Usuario salvarUsuario(Usuario usuario) {
            emailExiste(usuario.getEmail());
            usuario.setSenha(bCryptPasswordEncoder.encode(usuario.getSenha()));
            return usuarioRepository.save(usuario);
    }

    public void emailExiste(String email){
            boolean existe = usuarioRepository.existsByEmail(email);
            if(existe){
                throw new RuntimeException("Email já cadastrado: " + email);
            }
    }

    public Usuario findByEmail(String email) {
        return usuarioRepository
                .findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Email não encontrado: " + email));
    }

    public void deleteByEmail(String email) {
        usuarioRepository.deleteByEmail(email);
    }
}
