/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infnet.cotacoes.service;

import edu.infnet.cotacoes.repository.CotacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Marcelo Vergara <http://marcelo-vergara.codes/>
 */
public class CotacaoServiceImpl implements CotacaoService {

    @Autowired
    CotacaoRepository cotacaoRepository;

}
