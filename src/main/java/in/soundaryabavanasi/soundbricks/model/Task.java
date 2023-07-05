package in.soundaryabavanasi.soundbricks.model;
import java.time.LocalDate;

public class Task {
     int id;
     String name;
     LocalDate dueDate;
     boolean isActive = true;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    
    public void setActive(boolean isActive) {
		this.isActive = isActive;
		
	}

    @Override
    public String toString() {
        return "Task [id=" + id + ", Name=" + name + ", dueDate=" + dueDate + ", isActive=" + isActive + "]";
    }

	

	
}

	

