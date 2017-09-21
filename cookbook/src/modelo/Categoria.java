package modelo;

import java.util.List;

public class Categoria {

    private Integer id;
    private String nome;
    private String descricao;
    private List<Receita> receitas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Receita> getReceitas() {
        return receitas;
    }

    public void setReceitas(List<Receita> receitas) {
        this.receitas = receitas;
    }
    
    public void setReceita(Receita r){
        if(r.getCategoria().equals(this)){
            this.receitas.add(r);
        }
    }

}
