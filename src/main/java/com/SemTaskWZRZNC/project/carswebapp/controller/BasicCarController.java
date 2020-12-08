package com.SemTaskWZRZNC.project.carswebapp.controller;

import com.SemTaskWZRZNC.project.carswebapp.domain.CarBrand;
import com.SemTaskWZRZNC.project.carswebapp.domain.entity.BasicCar;
import com.SemTaskWZRZNC.project.carswebapp.service.IBasicCarDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
public class BasicCarController {

    @Autowired
    private IBasicCarDAO carDAO;


    @RequestMapping(value = "/saveCar", method = RequestMethod.POST)
    public String saveCars(@ModelAttribute("basicCar") BasicCar basicCar){
        carDAO.SaveBasicCar(basicCar);
        return "redirect:showSave";
    }

    @RequestMapping(value = "/showSave", method = RequestMethod.GET)
    public String showCars(Model model){
        List<CarBrand> brands = Arrays.asList(CarBrand.values());
        model.addAttribute("brands", brands);
        return "saveBasicCar";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/listCars")
    public String getAllCars(Model cars){
        cars.addAttribute("cars", carDAO.ShowCars());
        return "carsList";
    }

    @RequestMapping("/getCarDetails")
    public String getCarDetails(@RequestParam Long carId, Model carDetails){
        carDetails.addAttribute("carDetails", carDAO.getDetails(carId));
        return "carDetails";
    }

    @PostMapping("/modifyCar")
    public String modifyCarDetails(@ModelAttribute("carDetails") BasicCar basicCar){
        carDAO.SaveBasicCar(basicCar);
        return "redirect:listCars";
    }

    @PostMapping("/deleteCar")
    public String deleteCar(@RequestParam Long carId){
        carDAO.DeleteBasicCar(carId);
        return "redirect:listCars";
    }
}
