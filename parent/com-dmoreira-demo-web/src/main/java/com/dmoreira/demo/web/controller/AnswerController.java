package com.dmoreira.demo.web.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dmoreira.demo.domain.Answer;
import com.dmoreira.demo.service.AnswerService;

@Controller
@RequestMapping(value="/answer")
public class AnswerController {
	
	@Inject
	AnswerService answerService;
	
	@RequestMapping(value="/answer", method = RequestMethod.POST)
	public @ResponseBody Answer showNewestAnswer() throws Exception {
		return  answerService.find().get(0);
	}
}
