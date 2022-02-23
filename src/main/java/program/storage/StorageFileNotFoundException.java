package program.storage;

public class StorageFileNotFoundException extends StorageException { //для обробки помилок, коли немає файла

    public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

