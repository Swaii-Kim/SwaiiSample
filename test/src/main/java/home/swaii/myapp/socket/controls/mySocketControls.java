package home.swaii.myapp.socket.controls;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import home.swaii.myapp.HomeController;

/**
 * Servlet implementation class mySocket
 */
@Controller
public class mySocketControls {
	private static final Logger logger = LoggerFactory.getLogger(mySocketControls.class);
	
	@RequestMapping(value="/mySocket")			
	public String home() {
		return "mySocket/mySocket";
	}
	
}
