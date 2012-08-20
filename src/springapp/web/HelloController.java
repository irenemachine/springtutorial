package springapp.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;

@Controller
public class HelloController {
    protected final Log logger = LogFactory.getLog(getClass());

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = "charlie";
        logger.info("Returning hello view");

        ModelAndView modelAndView = new ModelAndView("hello.jsp");
        modelAndView.addObject("name", name);
        return modelAndView;
    }



}
