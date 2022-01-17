package sg.nus.edu.day16project.controller;

import java.io.Console;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.print.attribute.standard.Media;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.nus.edu.day16project.model.TaskModel;



@Controller
@RequestMapping(path="/task", produces = MediaType.TEXT_HTML_VALUE)
public class TaskController {

    private final Logger logger = Logger.getLogger(TaskController.class.getName());

    @GetMapping("/addTask")
    public String showForm(Model model) {
        TaskModel ftask = new TaskModel();
        model.addAttribute("task", ftask);
        return "index";


    }
    


}

