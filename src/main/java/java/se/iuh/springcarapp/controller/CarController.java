package java.se.iuh.springcarapp.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.web.multipart.MultipartFile;
import java.se.iuh.springcarapp.dao.CarDAO; 
import java.se.iuh.springcarapp.model.Car;

@Controller
public class CarController {
	@Autowired
	private CarDAO carDAO;
	@RequestMapping(value={"/home","/"},method=RequestMethod.GET)
	public String showCars (Model model) {
		List<Car> carList = carDAO.getAllCars();
		model.addAttribute("danhsach",carList);
		return "danhsach";
	}
	
	@RequestMapping(value={"/add-new-car"},method=RequestMethod.GET)
	public String showAddNewCarForm(Model model) {
		model.addAttribute("car", new Car()); 
		return "addNewCarForm";
		}
		@RequestMapping(value={"/addCar"},method=RequestMethod.POST) 
		public String addCar (@ModelAttribute(name="car") Car car) {
			//.....
			return "danhsach";
		}
}
