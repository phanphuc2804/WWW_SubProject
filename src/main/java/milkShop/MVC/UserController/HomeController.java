package milkShop.MVC.UserController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import milkShop.MVC.Entity.Category;
import milkShop.MVC.Entity.Product;
import milkShop.MVC.Entity.Supplier;
import milkShop.MVC.Service.BaseService;
import milkShop.MVC.Service.CategoryService;
import milkShop.MVC.Service.ProductService;
import milkShop.MVC.Service.SupplierService;

@Controller
public class HomeController{
	@Autowired
	private BaseService baseService;
	@Autowired
	private ProductService productService;

	@RequestMapping(value = {"/"})
	public String showHomepage(Model model) {
		model.addAttribute("listSuppliers", baseService.getSupplierMenu());
		model.addAttribute("listCategories", baseService.getCategoryMenu());
		model.addAttribute("listProductsByNumber", productService.getFeatureItems(9));
		return "user/index";
	}
	
	@RequestMapping(value = {"/about-us"})
	public String showAboutUs(Model model) {
		model.addAttribute("listSuppliers", baseService.getSupplierMenu());
		model.addAttribute("listCategories", baseService.getCategoryMenu());
		return "user/about_us";
	}
	
	
	
	
}
