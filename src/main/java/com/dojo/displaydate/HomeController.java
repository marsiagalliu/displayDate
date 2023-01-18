package com.dojo.displaydate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(){
        return "index.jsp";
    }

    @RequestMapping("/date")
    public String date(Model model){
       Date date = new Date();
       SimpleDateFormat newDate = new SimpleDateFormat("EEEE, MMM d, yyyy");
       model.addAttribute("simpleDate", newDate.format(date));
       return "date.jsp";
    }

    @RequestMapping("/time")
    public String time(Model model){
        Date date = new Date();
        SimpleDateFormat newDate = new SimpleDateFormat("h:mm a");
        model.addAttribute("time", newDate.format(date));
        return "time.jsp";
    }
}
