import java.io.*;

public class Speak {

    protected static String fileName = "Speaker.vbs";

    public void Speaker(String stringSpeak) throws IOException{
        if(stringSpeak.length() == 0){
            return;
        }

        FileWriter file = new FileWriter(fileName);

        try{

            file.write("CreateObject(\"SAPI.SpVoice\").Speak(\"" + stringSpeak + "\")");

        }catch (Exception e){
            e.printStackTrace();
        }
        file.close();

        try{
            Runtime.getRuntime().exec("wscript Speaker.vbs");
        }catch (IOException e){
            System.out.println(e);
            System.exit(0);
        }
    }

}
