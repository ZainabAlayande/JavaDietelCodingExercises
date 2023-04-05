package ChapterFifteen;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferedWriterSample {
    public static void main(String[] args) {
        String[] word = {"gtyhj", "gyjkdlk", "pæolklk", "qweåp, jyipål"};
        try (OutputStreamWriter writer =
                new OutputStreamWriter(new FileOutputStream(ReusePath.APP_ASSET_LOCATION+"\\output.txt"))) {
             BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(word[2]);
            bufferedWriter.close();
        } catch (IOException exception) {
            exception.getMessage();
        }
    }
}
