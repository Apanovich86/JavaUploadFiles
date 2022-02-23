package program.storage;

public class StorageException extends RuntimeException { //клас для обробки помилок

    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
