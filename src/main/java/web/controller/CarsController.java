package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.fakeDB.CarDB;
import web.service.CarFakeDBService;
import web.service.CarService;

@Controller
public class CarsController {

    CarService serivce = new CarFakeDBService();

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count,
                            ModelMap model) {
        int carsCount;
        if (count == null || count >= 5){
            carsCount = 5;
        } else {
            carsCount = count;
        }
        model.addAttribute("cars", serivce.getFirstNCars(carsCount));
        return "cars";
    }

}