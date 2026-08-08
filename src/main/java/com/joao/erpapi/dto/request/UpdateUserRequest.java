package com.joao.erpapi.dto.request;

import com.joao.erpapi.enums.Cargo;

public record UpdateUserRequest (String nome, String telefone, Cargo cargo, boolean ativo) {}
