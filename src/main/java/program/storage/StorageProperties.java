package program.storage;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("storage")
@Data
public class StorageProperties {//відповідає за конфігурацію

    /**
     * Folder location for storing files
     */
    private String location = "uploaded";//папка, в якій будуть зберігатися файли

}