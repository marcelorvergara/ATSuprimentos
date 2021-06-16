/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infnet.produtos.web;

import edu.infnet.cotacoes.web.CotacaoController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Marcelo Vergara <http://marcelo-vergara.codes/>
 */
@Controller
public class ProdutoController {

    private static final Logger log = LoggerFactory.getLogger(CotacaoController.class);

    @GetMapping({"/produto", "/produto.html"})
    public String produto(Model model) {
        return "produto";
    }

}
