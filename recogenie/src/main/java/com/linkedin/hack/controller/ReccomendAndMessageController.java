package com.linkedin.hack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReccomendAndMessageController
{

  public ReccomendAndMessageController()
  {
    // TODO Auto-generated constructor stub
  }

  @RequestMapping("/index")
  public @ResponseBody
  ModelAndView getIndex()
  {
    ModelAndView mv = new ModelAndView("index");
    mv.addObject("name", "Swetha");
    return mv;
  }

}
