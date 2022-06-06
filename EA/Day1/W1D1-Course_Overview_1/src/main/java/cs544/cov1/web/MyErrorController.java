/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs544.cov1.web;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author mzijlstra
 */
@Controller
public class MyErrorController implements ErrorController  {

    private static final String PATH = "/error";
    
    @RequestMapping("/accessDenied")
    public String accessDenied() {
        return "accessDenied";
    }

    @RequestMapping(value = PATH)
    public String error() {
        return "error";
    }

    public String getErrorPath() {
        return PATH;
    }
}
