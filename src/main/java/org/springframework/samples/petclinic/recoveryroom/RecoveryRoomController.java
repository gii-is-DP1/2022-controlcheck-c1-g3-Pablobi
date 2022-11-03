package org.springframework.samples.petclinic.recoveryroom;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/recoveryroom")
public class RecoveryRoomController {
	
	 private final RecoveryRoomService recoveryRoomService;
	 
	 private final String CREATE_OR_UPDATE_RECOVERY_ROOM_FORM = "recoveryroom/“createOrUpdateRecoveryRoomForm";

	    @Autowired
	    public RecoveryRoomController(RecoveryRoomService recoveryRoomService) {
	        this.recoveryRoomService = recoveryRoomService;
	    }
	    
	    /*@GetMapping("/create")
	    public String initRecoveryRoom(@PathVariable("id") int id, Map<String, Object> model) {
	        RecoveryRoom rr = this.recoveryRoomService.;
	        model.put("recoveryroom", rr);
	        return CREATE_OR_UPDATE_RECOVERY_ROOM_FORM;
	    }*/

}
