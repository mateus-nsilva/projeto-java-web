package br.com.impacta.javaweb.servlets.projetojavaweb.model;

import lombok.*;

import java.beans.ConstructorProperties;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@NonNull
public class Usuario {

    private String nome;
    private String login;
    private String senha;
    private String email;

}
