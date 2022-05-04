package milkShop.MVC.Service;

import java.util.List;

import milkShop.MVC.Entity.Category;
import milkShop.MVC.Entity.Supplier;

public interface BaseService {
	public List<Category> getCategoryMenu();
	public List<Supplier> getSupplierMenu();
}
