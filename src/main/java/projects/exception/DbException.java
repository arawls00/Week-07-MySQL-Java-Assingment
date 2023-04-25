package projects.exception;

@SuppressWarnings("serial")
public class DbException extends RuntimeException {

//Call DbException as constructor and override the constructors below from the superclass
	public DbException(String message) {
		super(message);
		
	}

	public DbException(Throwable cause) {
		super(cause);
		
	}

	public DbException(String message, Throwable cause) {
		super(message, cause);
		
	}

	
	
}
