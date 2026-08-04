package com.joao.erpapi.dto.response;

import com.joao.erpapi.enums.Cargo;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private Cargo cargo;
    private boolean ativo;
    private LocalDateTime createdAt;
}
