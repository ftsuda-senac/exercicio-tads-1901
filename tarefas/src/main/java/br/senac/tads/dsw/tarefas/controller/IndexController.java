/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.dsw.tarefas.controller;

import org.springframework.stereotype.Controller;

/**
 *
 * @author fernando.tsuda
 */
@Controller
public class IndexController {
    
    public String abrirIndex() {
        return "index";
    }
    
}
