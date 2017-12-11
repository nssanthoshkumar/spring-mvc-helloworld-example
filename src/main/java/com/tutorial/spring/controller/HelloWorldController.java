package com.tutorial.spring.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author nssanthoshkumar
 */
@Controller
public class HelloWorldController {
   
	@Autowired private RedisTemplate< String, Object > template;

   @RequestMapping(path={"/"},method=RequestMethod.GET)
   public String sayHello(Model model) {
      model.addAttribute("message","Hello Spring MVC!");
     
      //Java 8 LocalDate
      SimpleDateFormat formatter = new SimpleDateFormat("DD/MM/YYYY hh:mm:ss");
      String formattedDate = formatter.format(new Date());
      model.addAttribute("date", formattedDate);
      model.addAttribute("lastRequestTime", template.opsForValue().get( "lastRequestTime" ));
      
      template.opsForValue().set( "lastRequestTime", formattedDate);
      
      return "index";
   }
   
}
