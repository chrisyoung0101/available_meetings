package com.gateaux.happen_meeting;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MeetingRepository extends JpaRepository<Meeting, String> {

    @Query(value="SELECT * FROM meetings_list;", nativeQuery=true)
    List<Meeting> getAllMeetings();


}

