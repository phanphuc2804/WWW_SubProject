package milkShop.MVC.Service;

import java.util.List;

import milkShop.MVC.Entity.Supplier;

public interface SupplierService {
	public List<Supplier> getAllSupplier();
	public Supplier getSupplierByID(int supplierID);
	public int addSupplier(Supplier supplier);
	public boolean deleteSupplier(int supplierID);
	public boolean editSupplier(Supplier supplier);
	public List<Supplier> searchSupplier(String input);
}
