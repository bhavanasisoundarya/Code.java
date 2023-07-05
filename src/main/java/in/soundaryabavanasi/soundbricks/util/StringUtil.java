package in.soundaryabavanasi.soundbricks.util;

import java.time.LocalDate;

import in.soundaryabavanasi.soundbricks.exception.ValidateException;
import in.soundaryabavanasi.soundbricks.util.*;

public class StringUtil {

	public static void rejectIfInvalidString(String input, String inputname) throws ValidateException {
		if (input == null || "".equals(input.trim())) {
			throw new ValidateException(inputname.concat(" cannot be null or empty"));
		}

	}

	public static boolean isValid(String input)throws ValidateException {
		if (input == null || "".equals(input.trim())) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean isInValid(String input)throws  ValidateException {
		if (input == null || "".equals(input.trim())) {
			return false;
		} else {
			return true;
		}
	}

public static void rejectIfInvalidDate(LocalDate input, String inputName) throws Exception {
		
		LocalDate date = LocalDate.now();
		
		if(input.isBefore(date)) {
			throw new ValidateException(inputName.concat(" Invalid"));
		}
		
	}

}
