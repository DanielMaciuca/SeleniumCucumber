package concepts.All.apacheLibraries;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileUtilsReadFromFileWithCommonsIO {

    public static void main(String[] args) throws IOException {

        // Apache commons-io provides many utility methods for working with files, directories, and streams.

        File file = new File("src/main/resources/file.txt");

        String content = FileUtils.readFileToString(file, Charset.defaultCharset());

        System.out.println(content);
    }
}
