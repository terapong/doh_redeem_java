package aec.doh.redeem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DohRedeemController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/load_form")
	public String loadForm() {
		return "add";
	}
	
	@GetMapping("/edit_form")
	public String editForm() {
		return "edit";
	}
}
