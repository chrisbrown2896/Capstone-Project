package com.vegasTracker;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StatsController {
	@Autowired
	private StatsService service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Stats> listStats = service.listAll();
		model.addAttribute("listStats", listStats);
		return "index";
	}
	
	@RequestMapping("/new")
	public String createNewGame(Model model) {
		Stats game = new Stats();
		model.addAttribute("stats", game);
		
		return "new_game";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveGame(@ModelAttribute("game") Stats game) {
		service.save(game);
		
		return "redirect:/";
		
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView editNewGame(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_game");
		Stats game = service.get(id);
		mav.addObject("game", game);
		return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteGame(@PathVariable(name = "id") Long id) {
		service.delete(id);
		return "redirect:/";
	}
	
	

}
