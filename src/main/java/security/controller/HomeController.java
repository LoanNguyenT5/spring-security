package security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView visitHome() {
		return new ModelAndView("index");
	}
		
	@RequestMapping(value="/admin", method = RequestMethod.GET)
	public ModelAndView visitAdmin() {
		ModelAndView model = new ModelAndView("admin");
		model.addObject("title", "Admministrator222 Control Panel");
		model.addObject("message", "This page demonstrates how to use Spring security.");
		
		return model;
	}

	@RequestMapping(value="/user", method = RequestMethod.GET)
	public ModelAndView visitUser() {
		ModelAndView model = new ModelAndView("admin");
		model.addObject("title", "Hello User Test CI/CD");
		model.addObject("message", "This page demonstrates how to use Spring security.");

		return model;
	}
}
