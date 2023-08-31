package com.ericsson.fdp.controller;

import com.ericsson.fdp.dao.dto.DMSyncDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*@RestController
@RequestMapping("/api")*/
public class DMController {

    //@PostMapping("/initObj")
    public DMSyncDTO initDMSyncDTO(@RequestBody DMSyncDTO dmSyncDTO){
        //System.out.println(dmSyncDTO.getBaseNodeDTO().getChildList().get(0).getAddInfo().getAddInfoMap());
        return  dmSyncDTO;
    }

}
