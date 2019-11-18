package com.gateaux.happen_meeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MeetingService {

    @Autowired
    private MeetingRepository meetingRepository;

    //////////////////////////////////////////////////
    ///SAVE FORM INPUT OF MEETING TO DATABASE TABLE///
    //////////////////////////////////////////////////
    public void addMeeting(Meeting meeting) {

        meetingRepository.save(meeting);

    }

    /////////////////////////////////
    ///DISPLAY LIST OF ALL MEETINGS//
    /////////////////////////////////
    public List<Meeting> getAllMeetings() {

        List<Meeting> meetings = new ArrayList<>();

        meetingRepository.findAll().forEach(meetings::add);

        return meetings;
    }

    /////////////////////////////////////////////////
    ///DISPLAY LIST OF ALL AVAILABLE TIMES TO MEET///
    /////////////////////////////////////////////////




}
