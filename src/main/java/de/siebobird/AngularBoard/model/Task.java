package de.siebobird.AngularBoard.model;

import com.sun.xml.bind.v2.model.core.ID;

import java.io.Serializable;
import java.util.Date;

public class Task implements Serializable {
    private int id;
    private String name;
    private String description;
    private Date date;
}
