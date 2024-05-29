package com.springbootprojectinitialize.projectinitialize.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springbootprojectinitialize.projectinitialize.Model.Employee;
import com.springbootprojectinitialize.projectinitialize.Services.EmpServices;

import jakarta.validation.Valid;

@Controller
public class EmpController {
    @Autowired
    private EmpServices empserv;
    @GetMapping("/getdashboard")
	public String getDashboard() {
		return "dashboard";
		
	}
    @GetMapping("/newEmp")
    public String addEmp(Model model) {
        model.addAttribute("newEmp", new Employee());
        return "newEmp";
    }

    @PostMapping("/empAdded")
    public String registerEmp(@Valid @ModelAttribute("newEmp") Employee emp, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "newEmp";
        }

        empserv.getSave(emp);
        model.addAttribute("message", "Employee successfully registered.");
        return "newEmp";
    }

    @GetMapping("/existingEmp")
    public String getExistingEmp(Model model) {
        List<Employee> existingEmp = empserv.gerAllEmp();
        model.addAttribute("emp", existingEmp);
        return "existingEmp";
    }

    @PostMapping("/emp/delete")
    public String getDelete(@RequestParam("id") long id) {
        empserv.getdelete(id);
        return "redirect:/existingEmp";
    }

    @GetMapping("/emp/update")
    public String getUpdate(@RequestParam("id") long id, Model model) {
        Employee emp = empserv.getfindById(id);
        model.addAttribute("emp", emp);
        return "updateEmp";
    }

    @PostMapping("/emp/edit")
    public String updateEmp(@Valid @ModelAttribute("emp") Employee emp, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "updateEmp";
        }
        empserv.getSave(emp);
        return "redirect:/existingEmp";
    }
}
