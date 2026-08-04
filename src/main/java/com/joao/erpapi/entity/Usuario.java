package com.joao.erpapi.entity;

import com.joao.erpapi.enums.Cargo;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String nome;
    @Column(length = 100, nullable = false, unique = true)
    private String email;
    @Column(length = 20, nullable = false)
    private String senha;
    private String telefone;
    @Column(nullable = false)
    private String token;
    @Column(nullable = false)
    private Cargo cargo;
    @Column(nullable = false)
    private boolean ativo;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    @Column(precision = 5, scale = 2)
    private BigDecimal comissao;

}