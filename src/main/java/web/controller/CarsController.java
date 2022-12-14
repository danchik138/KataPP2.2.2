package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsController {

    private CarService service;
    @Autowired
    public void setService(CarService service) {
        this.service = service;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count,
                            ModelMap model) {
        int carsCount;
        if (count == null || count >= 5){
            carsCount = 5;
        } else {
            carsCount = count;
        }
        model.addAttribute("cars", service.getFirstNCars(carsCount));
        return "cars";
    }

}