
package com.jamr.medicalsysweb.controller;


import com.jamr.medicalsysweb.entities.Paciente;
import com.jamr.medicalsysweb.services.PacienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
     @Autowired
    private PacienteService pacienteService;
    
   
    
    @RequestMapping(value = "/")
    public ModelAndView home(Model model) {
        
        ModelAndView modelAndView=new ModelAndView("home");
        
        String message="Medical Sys Web coming soon!!!";
        modelAndView.addObject("message",message);
        
        return modelAndView;
    }
    
    
    @RequestMapping(value = "product/crear", method=RequestMethod.GET)
    public ModelAndView crear() {
        ModelAndView modelAndView=new ModelAndView("product-crear");
        Paciente paciente =new Paciente();
        
        
        Paciente pacienteFound=pacienteService.findPacienteById(2L);
        List<Paciente> pacienteList=pacienteService.findPacienteAll();
        
        modelAndView.addObject("paciente",paciente);
        
        return modelAndView;
    }
    
    
    @RequestMapping(value="paciente/crear", method=RequestMethod.POST)
    public ModelAndView crearPost(Paciente paciente) {
        ModelAndView modelAndView=new ModelAndView("confirm");       
        
        pacienteService.savePaciente(paciente);
        List<Paciente> pacienteList=pacienteService.findPacienteAll();
        modelAndView.addObject("paciente",paciente);
        modelAndView.addObject("pacientes",pacienteList);
        
        return modelAndView;
    }
    
    
    @RequestMapping(value = "/fragments/paciente/requestparamPath",method=RequestMethod.GET)
    public ModelAndView requestParamPath(@RequestParam(name = "name") String name) {
        ModelAndView modelAndView=new ModelAndView("redirect:/paciente/crear");
        System.out.println("Parameter:: "+ name);
        
        return modelAndView;
        
    }
    
    
    @RequestMapping(value = "/fragments/paciente/pathvariable/{name}",method=RequestMethod.GET)
    public ModelAndView pathVariablePath(@PathVariable String name) {
        ModelAndView modelAndView=new ModelAndView("redirect:/");
        System.out.println("Parameter:: "+ name);
        
        return modelAndView;
        
    }
    
    @RequestMapping(value = "product/pathFromHtml",method=RequestMethod.GET)
    public ModelAndView confirmParam(@RequestParam(name = "name") String name) {
        ModelAndView modelAndView= new ModelAndView("redirect:/");
        
        
        System.out.println("Name value:: "+ name);
        
        return modelAndView;
    } 
}
