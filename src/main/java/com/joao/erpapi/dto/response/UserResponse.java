package com.joao.erpapi.dto.response;

import com.joao.erpapi.enums.Cargo;

import java.time.LocalDateTime;

public record UserResponse(Long id, String nome, String email, String telefone, Cargo cargo, boolean ativo, LocalDateTime createdAt) {}
