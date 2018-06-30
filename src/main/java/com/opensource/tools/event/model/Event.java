package com.opensource.tools.event.model;

import java.util.Date;
import java.util.List;

public class Event {

	private String name;

	private EventType type;

	private Date startDate;

	private Date endDate;

	private Priority priority;

	private List<Contact> contacts;

	private List<Location> locations;

	private String notes;

}
