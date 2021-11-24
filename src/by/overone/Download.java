package by.overone;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Download implements Runnable {
    String link;
    File out;

    public Download(String link, File out) {
        this.link = link;
        this.out = out;
    }

    @Override
    public void run() {

        try {

            URL url = new URL(link);
            HttpURLConnection http = (HttpURLConnection) url.openConnection();
            BufferedInputStream bis = new BufferedInputStream(http.getInputStream());
            FileOutputStream fos = new FileOutputStream(this.out);
            BufferedOutputStream bos = new BufferedOutputStream(fos, 1024);
            byte[] buffer = new byte[1024];
            int read = 0;
            while ((read = bis.read(buffer, 0, 1024)) >= 0) {
                bos.write(buffer, 0, read);
            }
            bos.close();
            bis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
