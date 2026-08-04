package com.joao.erpapi.dto.request;

import com.joao.erpapi.enums.Cargo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserRequest {
    private String nome;
    private String telefone;
    private Cargo cargo;
    private boolean ativo;
}
