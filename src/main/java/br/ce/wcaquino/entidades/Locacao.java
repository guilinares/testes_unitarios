package br.ce.wcaquino.entidades;

import java.util.Date;
import java.util.List;

public class Locacao {

	private Usuario usuario;
	private Date dataLocacao;
	private Date dataRetorno;
	private Double valor;
	
	private List<Filme> filmes;
	
	public Locacao() {
	}
	
	public Locacao(Usuario usuario, Double valor, List<Filme> filmes, Date dataLocacao) {
		super();
		this.usuario = usuario;
		this.valor = valor;
		this.filmes = filmes;
		this.dataLocacao = dataLocacao;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Date getDataLocacao() {
		return dataLocacao;
	}
	public void setDataLocacao(Date dataLocacao) {
		this.dataLocacao = dataLocacao;
	}
	
	public Date getDataRetorno() {
		return dataRetorno;
	}
	public void setDataRetorno(Date dataRetorno) {
		this.dataRetorno = dataRetorno;
	}
	
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}
	
	public List<Filme> getFilmes() {
		return filmes;
	}
	
	public void addFilme(Filme filme) {
		filmes.add(filme);
	}
	
	public double getTotalValue() {
		return filmes.stream().mapToDouble(x -> x.getPrecoLocacao()).sum();
	}
	
	
}