package phonenixm103.demoEC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import phoenixm103.demoEC.ecMessage.ECMessage;


@RestController
public class ECController {
	
	
	@RequestMapping(method=RequestMethod.GET, value = "/ecmessage")
	public ECMessage eCMessage() {
		ECMessage ecmessage=new ECMessage("EC Says HI");
		
		return ecmessage;
		
	}

}

