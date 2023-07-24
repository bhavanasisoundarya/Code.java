package in.soundaryabavanasi.soundbricks.interfaceFiles;

import java.time.LocalDate;

import in.soundaryabavanasi.soundbricks.model.Task;

public interface TaskInterface extends Base<Task> {
	public abstract void sortByDate(LocalDate date);
	public abstract int count();
}
