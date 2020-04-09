package com.company;

import java.util.List;

public interface Guard {

    void checkG(Guest guest, List<Guest> names);

    void alarmG();

    void stopG(String name);
}
