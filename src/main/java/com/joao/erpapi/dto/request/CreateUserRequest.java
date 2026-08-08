package com.joao.erpapi.dto.request;

import com.joao.erpapi.enums.Cargo;

public record CreateUserRequest (String nome, String email, String senha, String telefone, Cargo cargo) {}
