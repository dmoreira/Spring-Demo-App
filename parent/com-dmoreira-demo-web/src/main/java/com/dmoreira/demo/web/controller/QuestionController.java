package com.dmoreira.demo.web.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dmoreira.demo.domain.Question;
import com.dmoreira.demo.service.PersonService;
import com.dmoreira.demo.service.QuestionService;

@Controller
@RequestMapping(value="/question")
public class QuestionController {
	
	@Inject
	private QuestionService questionService;
	
	@Inject 
	private PersonService personService;
	
	@RequestMapping(value = "/auth/create", method = RequestMethod.POST)
	public @ResponseBody String create(Question q, HttpServletRequest req) {
//		System.out.println(req.getParameter("username"));
//		Person p = new Person();
//		p.setUserName(req.getParameter("username"));
//		personService.persist(p);
//		q.setAsker(p);
//		questionService.persist(q);
		return "Success";
	}
}
