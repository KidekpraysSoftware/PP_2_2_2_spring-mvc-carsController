package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "index";
	}

	@GetMapping(value = "/cars")
	public String printHello(ModelMap model, @RequestParam(value = "count", required = false) String sCount) {

		//Cars DataBase
		List<Car> cars_DB = new ArrayList<>();
		cars_DB.add(new Car("Black", "Honda", 111));
		cars_DB.add(new Car("White", "Lada", 222));
		cars_DB.add(new Car("Red", "Toyota", 333));
		cars_DB.add(new Car("Red", "Kia", 444));
		cars_DB.add(new Car("Black", "Audi", 555));


		List<String> cars = new ArrayList<>();

		int count = cars_DB.size();
		if (sCount != null)  count = Integer.parseInt(sCount);
		if (count>cars_DB.size()) { count = cars_DB.size();}

		for (int i = 0; i < count; i++) {
			cars.add(cars_DB.get(i).toString());
		}
		model.addAttribute("cars", cars);
		return "cars";
	}
	
}