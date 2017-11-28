/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataperturbation;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;

/**
 * foi necessario incluir este XmlElement para definir no XSD que o produto nao era opcional.
 */
public class Carrinho {
    
    private List<Produto> produto;

    public List<Produto> getProduto() {
        return produto;
    }

    @XmlElement(required = true, nillable = false)
    public void setProduto(List<Produto> produtos) {
        this.produto = produtos;
    }
    
    
}
