/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package web_site_copier;

/**
 *
 * @author sumon
 */
import java.net.*;
import java.io.*;
import java.util.Date;
import java.util.StringTokenizer;
public class copy {
 public static void main(String args[])
  {


    URL url;
InputStream is = null;
DataInputStream dis;
String line;

try {
    //url = new URL("http://stackoverflow.com/");
    //url = new URL("http://mbstu.ac.bd/index.html");
    //url = new URL("http://www.prothom-alo.com/");
url = new URL("http://jugantor.us/enews/issue/2012/02/03/index.htm");
    //http://jugantor.us/enews/issue/2012/02/03/index.htm

    is = url.openStream();  // throws an IOException
    dis = new DataInputStream(new BufferedInputStream(is));

    while ((line = dis.readLine()) != null) {
        System.out.println(line);
    }
} catch (MalformedURLException mue) {
     mue.printStackTrace();
} catch (IOException ioe) {
     ioe.printStackTrace();
} finally {
    try {
        is.close();
    } catch (IOException ioe) {
        // nothing to see here
    }
}
 }
}


