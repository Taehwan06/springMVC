package edu.study.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.study.service.BoardService;
import edu.study.vo.BoardVO;

/**
 * Handles requests for the application home page.
 */
@RequestMapping(value="/board")
@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * @throws Exception 
	 */
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	public String list(Locale locale, Model model) throws Exception {
		
		List<BoardVO> list = boardService.list();
		
		model.addAttribute("list",list);
		
		return "board/list";
	}
	
	@RequestMapping(value = "/view.do", method = RequestMethod.GET)
	public String view(Locale locale, Model model, int bidx) throws Exception {
		
		System.out.println(bidx);
		
		BoardVO vo = boardService.detail(bidx);
		
		model.addAttribute("vo", vo);
		
		return "board/view";
	}
	
	@RequestMapping(value = "/update.do", method = RequestMethod.GET)
	public String update(Locale locale, Model model, int bidx) throws Exception {
		
		System.out.println(bidx);
		
		BoardVO vo = boardService.detail(bidx);
		
		model.addAttribute("vo", vo);
		
		return "board/update";
	}

	
}
