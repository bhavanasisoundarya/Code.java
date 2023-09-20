package in.soundaryabavanasi.soundbricks.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class TaskEntity implements Comparable<TaskEntity> {
	int id;
	String task_name;
	String due_date;
	boolean is_active;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTaskName() {
		return task_name;
	}
	
	public void setTaskName(String task_name) {
		this.task_name = task_name;
	}
	
	public String getDueDate() {
		return due_date;
	}
	
	public void setDueDate(String due_date) {
		this.due_date = due_date;
	}
	
	public boolean isActive() {
		return is_active;
	}
	
	public void setActive(boolean is_active) {
		this.is_active = is_active;
	}
	
	@Override
	public int compareTo(TaskEntity t) {
		
		if(this.id==t.getId()) {
			return 0;
		}
		else {
			if (this.id>getId()) {
				return 1;
			} else {
				return -1;
			}
			
		}
		
	}
	
	
	@Override
	public String toString() {
		return "Task [id = " + id + ", taskName = " + task_name + ", dueDate = " + due_date + ", isActive = " + is_active + "]";
	}






















}
