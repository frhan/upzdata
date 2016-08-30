package com.bd.up.web.controllers;

import com.bd.up.domain.entity.Citizen;
import com.bd.up.services.CitizenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;


@Controller
@RequestMapping(value = "citizen")
public class CitizenController {

    private static final Logger logger = LoggerFactory.getLogger(CitizenController.class);

    @Autowired
    private CitizenService citizenService;

    @RequestMapping(method = RequestMethod.GET)
    public String getArticles(Model model){
        return "citizen/index";
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public String createArticle(@ModelAttribute Citizen citizen, BindingResult result, RedirectAttributes redirectAttrs){
        logger.trace("***citizen****"+citizen.getNameInEng());
        Citizen savedCitizen = citizenService.create(citizen);
        redirectAttrs.addAttribute("id", savedCitizen.getId()).addFlashAttribute("message", "Citizen created!");
        return "redirect:/citizen/{id}";
    }

    @RequestMapping(value = "/new",method = RequestMethod.GET)
    public String newArticle(Model model){
        model.addAttribute("citizen",new Citizen());
        return "citizen/new";
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String showArticle(@PathVariable("id") Long id){
        return "citizen/show";
    }

}
