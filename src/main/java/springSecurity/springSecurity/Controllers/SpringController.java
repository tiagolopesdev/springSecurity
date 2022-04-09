/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package springSecurity.springSecurity.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
     * @author tiagolopes
 */
@Controller
public class SpringController {
    
    @RequestMapping(method = RequestMethod.GET, path = "/entrar")
    public String entrar() {
        return "entrar";
    }
    
    @RequestMapping(method = RequestMethod.GET, path = "/user")
    public String user() {
        return "user";
    }
    
}
