/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infnet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Marcelo Vergara <http://marcelo-vergara.codes/>
 */
@Controller
public class MainController {

    @GetMapping("/")
    public String produto(Model model) {

        return "index";

    }
}
