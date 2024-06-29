package nio_encryption_data_exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BufferManipulationChallengeExercise {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("//home//dci-student//Desktop//source.txt");
             FileOutputStream outputStream = new FileOutputStream("//home//dci-student//Desktop//destination.txt");
             FileChannel inputChannel = inputStream.getChannel();
             FileChannel outputChannel = outputStream.getChannel()) {

            ByteBuffer inputBuffer = ByteBuffer.allocate(1024);
            ByteBuffer outputBuffer = ByteBuffer.allocate(1024);

            byte xorKey = 0x0F;
            int bytesRead = inputChannel.read(inputBuffer);

            while (bytesRead != -1) {
                inputBuffer.flip(); // Switch to read mode
                outputBuffer.clear(); // Switch to write mode

                while (inputBuffer.hasRemaining()) {
                    byte originalByte = inputBuffer.get();
                    byte encryptedByte = (byte) (originalByte ^ xorKey);
                    outputBuffer.put(encryptedByte);
                }

                outputBuffer.flip(); // Switch to read mode
                outputChannel.write(outputBuffer);
                inputBuffer.clear(); // Switch to write mode
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
