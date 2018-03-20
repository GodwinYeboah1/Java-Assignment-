
package com.codingDojo.controllerpractice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class HomeController {
        @RequestMapping("/")
        public String home() {
        		System.out.println("i am here");
//        		forward : /index.html render it on browser
                return "forward:/index.html";
        }
        
    
       
}
