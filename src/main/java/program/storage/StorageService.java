package program.storage;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;


import java.nio.file.Path;
import java.util.stream.Stream;

public interface StorageService {
    void init(); //ініціалізація
    void store(MultipartFile file);//зберігає мультипартфайли
    Stream<Path> loadAll();//вертає всі файли
    Path load(String filename);//повертає по імені файла шлях до файла
    String store(String base64);//зберігає base64 і повертає імя файла
    Resource loadAsResource(String filename);//загружає ресурси
    void deleteAll();//видаляє всі файли
}