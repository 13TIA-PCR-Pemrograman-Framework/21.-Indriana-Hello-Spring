/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


/**
 *
 * @author LabGSG-3
 */
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import service.HelloService;

public class HelloController extends SimpleFormController {
    
    public HelloController() {
        
        //Initialize controller properties here or 
        //in the Web Application Context

        setCommandClass(Name.class);
        setCommandName("name");
        setSuccessView("helloView");
        setFormView("nameView");
    }
   
    private HelloService helloService;
        
    public void setHelloService(HelloService helloService){
        this.helloService=helloService;
    }
    
    //when you need access to the Request, Response, or BindException objects
    
    @Override
     protected ModelAndView onSubmit(
        HttpServletRequest request, 
        HttpServletResponse response, 
        Object command, 
        BindException errors) throws Exception {
         
        Name ObjekClassName = (Name) command;
        ModelAndView mv = new ModelAndView(getSuccessView());
        mv.addObject("name", HelloService.YourName(ObjekClassName.getname()+"<br>"));
        mv.addObject("nim", HelloService.YourNim(ObjekClassName.getnim()+"<br>"));
        mv.addObject("address", HelloService.YourAddress(ObjekClassName.getaddress()+"<br>"));
        return mv;
     }
    
}
