package aec.doh.redeem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import aec.doh.redeem.entity.*;
import aec.doh.redeem.repository.*;
import jakarta.servlet.http.HttpSession;

@Controller
public class DohRedeemController {
	
	@Autowired
	private ProductRepository productRepo;
	
	@Autowired
	private CampaignTypeRepository campaignTypeRepo;
	
	@Autowired
	private CampaignGoodsRepository campaignGoodsRepo;
	
	@Autowired
	private CampaignHealthRegionRepository campaignHealthRegionRepo;
	
	@Autowired
	private CampaignGoodsQtyRepository campaignGoodsQtyReo;
	
	@Autowired
	private CampaignRepository campaignRepo;
	
	@GetMapping("/")
	public String home(Model m) {		
		List<Products> list = productRepo.findAll();
		m.addAttribute("all_products", list);
		return "index";
	}
	
	@GetMapping("/load_form")
	public String loadForm() {
		return "add";
	}
	
	@GetMapping("/edit_form/{id}")
	public String editForm(@PathVariable(value = "id") long id, Model m) {
		Optional<Products> products = productRepo.findById(id);
		Products pro = products.get();
		m.addAttribute("product", pro);
		return "edit";
	}
	
	@PostMapping("/save_product")
	public String saveProducts(@ModelAttribute Products products, HttpSession session) {
		productRepo.save(products);
		session.setAttribute("msg", "Product Added Sucessfully..");
		return "redirect:/load_form";
	}
	
	@PostMapping("/update_product")
	public String updateProducts(@ModelAttribute Products products, HttpSession session) {
		productRepo.save(products);
		session.setAttribute("msg", "Product Update Sucessfully..");
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteProducts(@PathVariable(value = "id") long id, HttpSession session) {
		productRepo.deleteById(id);
		session.setAttribute("msg", "Product Delete Sucessfully..");
		return "redirect:/";
	}
	
	///campaign_goods
	@GetMapping("/campaign_goods")
	public String campaign_goods(Model m) {
		List<CampaignGoods> list = campaignGoodsRepo.findAll();
		m.addAttribute("all_campaign_good", list);
		return "campaign_goods";
	}
	
	@GetMapping("/campaign_goods_load_form_add")
	public String campaignGoodsLoadForm() {
		return "campaign_goods_load_form_add";
	}
	
	@PostMapping("/save_campaign_goods")
	public String saveCampaignGoods(@ModelAttribute CampaignGoods campaignGoods, HttpSession session) {
		campaignGoodsRepo.save(campaignGoods);
		session.setAttribute("msg", "campaign goods Added Sucessfully..");
		//return "redirect:/campaign_type_load_form_add";
		return "redirect:/campaign_goods";
	}
	
	@GetMapping("/campaign_goods_load_form_edit/{id}")
	public String campaignGoodsLoadFormEdit(@PathVariable(value = "id") long id, Model m) {
		Optional<CampaignGoods> campaignGood = campaignGoodsRepo.findById(id);
		CampaignGoods pro = campaignGood.get();
		m.addAttribute("campaignGoods", pro);
		return "campaign_goods_load_form_edit";
	}
	
	@PostMapping("/update_campaign_goods")
	public String updateCampaignGoods(@ModelAttribute CampaignGoods campaignGoods, HttpSession session) {
		campaignGoodsRepo.save(campaignGoods);
		session.setAttribute("msg", "Campaign goods Update Sucessfully..");
		return "redirect:/campaign_goods";
	}
	
	@GetMapping("/delete_campaign_goods/{id}")
	public String DeleteCampaignGoods(@PathVariable(value = "id") long id, HttpSession session) {
		campaignGoodsRepo.deleteById(id);
		session.setAttribute("msg", "Campaign goods Delete Sucessfully..");
		return "redirect:/campaign_goods";
	}
	
	///campaign_health_region
	@GetMapping("/campaign_health_region")
	public String campaign_health_region(Model m) {
		List<CampaignHealthRegion> list = campaignHealthRegionRepo.findAll();
		m.addAttribute("all_products_health_region", list);
		return "campaign_health_region";
	}
	
	@GetMapping("/campaign_health_region_load_form_add")
	public String campaignHealthRegionLoadForm() {
		return "campaign_health_region_load_form_add";
	}
	
	@PostMapping("/save_campaign_health_region")
	public String savecampaignHealthRegion(@ModelAttribute CampaignHealthRegion campaignHealthRegion, HttpSession session) {
		campaignHealthRegionRepo.save(campaignHealthRegion);
		session.setAttribute("msg", "campaign health region Added Sucessfully..");
		return "redirect:/campaign_health_region";
	}
	
	@GetMapping("/campaign_health_region_load_form_edit/{id}")
	public String campaignHealtRregionLoadFormEdit(@PathVariable(value = "id") long id, Model m) {
		Optional<CampaignHealthRegion> campaignHealthRegion = campaignHealthRegionRepo.findById(id);
		CampaignHealthRegion pro = campaignHealthRegion.get();
		m.addAttribute("campaignHealthRegion", pro);
		return "campaign_health_region_load_form_edit";
	}
	
	@PostMapping("/update_campaign_health_region")
	public String updatecampaignHealthRegion(@ModelAttribute CampaignHealthRegion campaignHealthRegion, HttpSession session) {
		campaignHealthRegionRepo.save(campaignHealthRegion);
		session.setAttribute("msg", "Campaign Health Region Update Sucessfully..");
		return "redirect:/campaign_health_region";
	}
	
	@GetMapping("/delete_campaign_health_region/{id}")
	public String DeleteCampaignHealthRegion(@PathVariable(value = "id") long id, HttpSession session) {
		campaignHealthRegionRepo.deleteById(id);
		session.setAttribute("msg", "Campaign Health Region Delete Sucessfully..");
		return "redirect:/campaign_health_region";
	}
	
	///campaign_type
	@GetMapping("/campaign_type")
	public String campaign_type(Model m) {
		List<CampaignType> list = campaignTypeRepo.findAll();
		m.addAttribute("all_campaign_type", list);
		return "campaign_type";
	}
	
	@GetMapping("/campaign_type_load_form_add")
	public String campaignTypeLoadForm() {
		return "campaign_type_load_form_add";
	}
	
	@PostMapping("/save_campaign_type")
	public String saveCampaignType(@ModelAttribute CampaignType campaignType, HttpSession session) {
		campaignTypeRepo.save(campaignType);
		session.setAttribute("msg", "campaign type Added Sucessfully..");
		//return "redirect:/campaign_type_load_form_add";
		return "redirect:/campaign_type";
	}
	
	@GetMapping("/campaign_type_load_form_edit/{id}")
	public String campaignTypeLoadFormEdit(@PathVariable(value = "id") long id, Model m) {
		Optional<CampaignType> campaignType = campaignTypeRepo.findById(id);
		CampaignType pro = campaignType.get();
		m.addAttribute("campaignType", pro);
		return "campaign_type_load_form_edit";
	}
	
	@PostMapping("/update_campaign_type")
	public String updateCampaignType(@ModelAttribute CampaignType campaignType, HttpSession session) {
		campaignTypeRepo.save(campaignType);
		session.setAttribute("msg", "Campaign type Update Sucessfully..");
		return "redirect:/campaign_type";
	}
	
	@GetMapping("/delete_campaign_type/{id}")
	public String DeleteCampaignType(@PathVariable(value = "id") long id, HttpSession session) {
		campaignTypeRepo.deleteById(id);
		session.setAttribute("msg", "Campaign type Delete Sucessfully..");
		return "redirect:/campaign_type";
	}
	
	///campaign
	@GetMapping("/campaign")
	public String campaign(Model m) {
		List<Campaign> list = campaignRepo.findAll();
		m.addAttribute("all_campaign", list); //ส่ง list all_campaign ไปที่ หน้า web วิธีใช้ <th scope="row">[[${p.id}]]</th>
		return "campaign";
	}
	
	@GetMapping("/campaign_load_form_add")
	public String campaignLoadForm(Model m) {
		List<CampaignType> campaignType = campaignTypeRepo.findAll();
		m.addAttribute("all_campaign_type", campaignType);
		return "campaign_load_form_add";
	}
	
	///campaign_goods_qtys
	@GetMapping("/campaign_goods_qtys")
	public String campaignGoodsQtys(Model m) {
		List<CampaignGoodsQty> list = campaignGoodsQtyReo.findAll();
		m.addAttribute("all_campaign_goods_qtys", list); //ส่ง list all_campaign_goods_qtys ไปที่ หน้า web
		return "campaign_goods_qtys";
	}
	
	@GetMapping("/campaign_goods_qty_load_form_add")
	public String campaignGoodsQtysLoadForm(Model m) {
		List<Campaign> campaign = campaignRepo.findAll();
		List<CampaignType> campaignType = campaignTypeRepo.findAll();
		List<CampaignGoods> campaignGoodsd = campaignGoodsRepo.findAll();
		
		m.addAttribute("all_campaign", campaign);
		m.addAttribute("all_campaign_type", campaignType);
		m.addAttribute("all_campaign_goods", campaignGoodsd);
		return "campaign_goods_qty_load_form_add";
	}
	
	@PostMapping("/save_campaign_goods_qty")
	public String saveCampaignGoodsQty(@ModelAttribute CampaignGoodsQty campaignGoodsQty, HttpSession session) {
		campaignGoodsQtyReo.save(campaignGoodsQty);
		session.setAttribute("msg", "campaign goods qty Added Sucessfully..");
		//return "redirect:/campaign_type_load_form_add";
		return "redirect:/campaign_goods_qtys";
	}
	
	
	@GetMapping("/campaign_goods_qty_load_form_edit/{id}")
	public String campaignGoodsQtyLoadFormEdit(@PathVariable(value = "id") long id, Model m) {
		Optional<CampaignGoodsQty> campaignGoodsQty = campaignGoodsQtyReo.findById(id);
		CampaignGoodsQty pro = campaignGoodsQty.get();
		m.addAttribute("campaignGoodsQty", pro);
		return "campaign_goods_qty_load_form_edit";
	}
	
	
	@PostMapping("/update_campaign_goods_qty")
	public String updateCampaignType(@ModelAttribute CampaignGoodsQty campaignGoodsQty, HttpSession session) {
		campaignGoodsQtyReo.save(campaignGoodsQty);
		session.setAttribute("msg", "Campaign goods qty Update Sucessfully..");
		return "redirect:/campaign_type";
	}

	
	@GetMapping("/delete_campaign_goods_qty/{id}")
	public String DeleteCampaignGoodsQty(@PathVariable(value = "id") long id, HttpSession session) {
		campaignGoodsQtyReo.deleteById(id);
		session.setAttribute("msg", "Campaign goods qty Delete Sucessfully..");
		return "redirect:/campaign_goods_qtys";
	}
	 
}
