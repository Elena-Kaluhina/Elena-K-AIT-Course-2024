package classwork45.input_output_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteInputAppl {

    public static void main(String[] args) {

        try (FileInputStream fin = new FileInputStream("data.txt")) {

            System.out.println(fin.available());

            int x = 0;


            // 1-st option
//            while ( x != -1 ){
//                System.out.println(x);
//                x = fin.read();
//            }


            // 2-nd option
//            int l = fin.available();
//            // we can read it with fori
//            for (int i = 0; i < l; i++) {
//                int y = fin.read();
//                System.out.println(y);
//            }


            // 3-rd option
            int l = fin.available();
            byte[] arr = new byte[l];

            fin.read(arr);

            for (byte b : arr){
                System.out.print( b + " ");
            }




        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
