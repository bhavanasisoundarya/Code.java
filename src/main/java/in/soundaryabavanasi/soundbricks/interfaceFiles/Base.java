package in.soundaryabavanasi.soundbricks.interfaceFiles;

import java.util.Set;

import in.soundaryabavanasi.soundbricks.model.User;

import java.util.Set;

public interface Base <T> {

	public abstract Set<T> findAll();
	public abstract void create(User newUser);
	public abstract void update();
	public abstract void delete();
	public abstract T findById(int id);

}