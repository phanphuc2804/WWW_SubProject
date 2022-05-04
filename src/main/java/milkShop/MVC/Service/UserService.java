package milkShop.MVC.Service;

import java.util.List;

import milkShop.MVC.DTO.UserDTO;
import milkShop.MVC.Entity.Customer;
import milkShop.MVC.Entity.User;

public interface UserService {
	public User findByUserName(String username);
	public Customer findByCustomerID(int id);
	public int addCustomer(Customer customer);
	public String addUser(User user);
	public List<User> getOnlyUserRole();
	public List<User> getAllUsers();
	public boolean editUser(User user);
	public boolean deleteUser(String username);
	public List<User> searchUser(String input);
	public boolean updateUser(User user);
	public List<Customer> getAllCustomer();
}
