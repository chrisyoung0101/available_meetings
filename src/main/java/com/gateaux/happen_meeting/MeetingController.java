package com.gateaux.happen_meeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MeetingController {

    @Autowired
    private MeetingService meetingService;


    @GetMapping("/meeting")
    public String meetingView(Model model) {

        ///////////////////
        //FOR INPUT FORM///
        ///////////////////
        model.addAttribute("meeting", new Meeting());

        ///////////////////////
        //FOR LIST FROM DB/////
        //USED IN HTML TABLE///
        ///////////////////////
        model.addAttribute("meetings", meetingService.getAllMeetings());

        return "meeting";
    }

    //POST FORM DATA TO DATABASE
    @PostMapping("/meeting")
    public String meetingSubmit(@ModelAttribute Meeting meeting) {

        ///////////////////////////////
        //ADD NEW MEETING DATA TO DB///
        ///////////////////////////////
        meetingService.addMeeting(meeting);

        ///////////////////////////////
        //REDIRECT SO FORM AND TABLE///
        //CAN WORK ON SAME PAGE////////
        ///////////////////////////////
        return "redirect:/meeting";
    }


}
