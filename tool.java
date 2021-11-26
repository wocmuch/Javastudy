package ReadandWrite;

import java.io.*;

public  class tool {
    File file = new File("D:\\new一个对象吧\\java.txt");

public void r() throws IOException {
    InputStream is = new FileInputStream(file);
    byte[] b = new byte[1024];
    int len = is.read(b);
    System.out.println(new String(b,0,len));
    is.close();
    }
    public void w(String s) throws IOException {
        OutputStream fos = new FileOutputStream(file,true);
        String str =s;
        byte a[] = str.getBytes();
        fos.write(a);
        fos.close();
    }


}
