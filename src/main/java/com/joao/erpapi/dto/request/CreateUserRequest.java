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
public class CreateUserRequest {
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private Cargo cargo;
}
