package hello_world.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import hello_world.service.HelloWorldService;

@Controller
public class WelcomeController {


  @Autowired
  private HelloWorldService service;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String index(Map<String, Object> model) {
    return "index";
  }


  @RequestMapping(value = "/getContent", method = RequestMethod.POST)
  @ResponseBody
  public String getContent(Map<String, Object> model) {
    return service.getContent();
  }


}
