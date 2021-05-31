package org.generation.blogPessoal.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_login")
public class UserLogin {
	
	private String nome;
	private String usuario;
	private String  senha;
	private String token;
	private String foto;
	private String tipo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}
	
}
