package com.jlearn.survey.SuveryApp.survey;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SurveyResource {
	private SurveyService surveyService;
	
	public SurveyResource(SurveyService surveyServices ) {
		super();
		this.surveyService = surveyServices;
	}
	
	//Surveys
	@RequestMapping(path = {"/surveys", "/surveys/"})
	public List<Survey> retrieveAllSurveys(){
		return surveyService.retrieveAllSurveys();
	}
}
