import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

import static java.lang.System.out;

public class ExceptionEx {
    public static void main(String[] args) {

        exception1();
        try {
            exception2();
        } catch (Exception e) {
            out.println(e.getMessage());
            out.println(e.getCause());
            out.println(e.getStackTrace());
        }

    }

    private static void exception2() throws Exception {
        try {
            out.println("exception2");
            throw new Exception("My exception");
        } catch (Exception e)
        {
            out.println("exception2 catch block");
           throw e;
        }
        finally {
            out.println("exception2 finally");
        }
    }

    private static void exception1() {
        try(FileReader fileReader = new FileReader(new File(""));) {
            out.println("exception1");
            Class.forName("");
        }catch (IOException | ClassNotFoundException ex){

        }
        finally {

        }
    }


}
