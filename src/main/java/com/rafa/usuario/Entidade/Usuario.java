package com.rafa.usuario.Entidade;

import jakarta.persistence.*;


@Entity
@Table(name = "usuarios")

public class Usuario {

    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)


      private long id;
      private String nome;
      private String email;

        public String getEmail() {
            return this.email;
        }

        public void setEmail(final String email) {
            this.email = email;
        }

        public String getNome() {
            return this.nome;
        }

        public void setNome(final String nome) {
            this.nome = nome;
        }

        public long getId() {
            return this.id;
        }

        public void setId(final long id) {
            this.id = id;
        }
    }





