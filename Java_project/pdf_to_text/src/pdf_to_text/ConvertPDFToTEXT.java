import java.io.*;
import java.util.*;
import com.lowagie.text.*;
import com.lowagie.text.pdf.*;

public class ConvertPDFToTEXT {
      public static void main(String[] args) throws IOException {
      try {
      Document document = new Document();
      document.open();
      PdfReader reader = new PdfReader("pdfFile.pdf");
      int a=reader.getNumberOfPages();
      System.out.println("pge no="+a);
      PdfDictionary dictionary = reader.getPageN(a);
      PRIndirectReference reference = (PRIndirectReference) 
                dictionary.get(PdfName.CONTENTS);
                        PRStream stream = (PRStream) PdfReader.getPdfObject(reference);
                        byte[] bytes = PdfReader.getStreamBytes(stream);
                        PRTokeniser tokenizer = new PRTokeniser(bytes);
                        FileOutputStream fos=new FileOutputStream("pdf.txt");
                        StringBuffer buffer = new StringBuffer();
                        while (tokenizer.nextToken()) {
                        if (tokenizer.getTokenType() == PRTokeniser.TK_STRING) {
                                        buffer.append(tokenizer.getStringValue());
                                        }
                        }
                String test=buffer.toString();
                StringReader stReader = new StringReader(test);
                int t;
                while((t=stReader.read())>0)
                fos.write(t);
                document.add(new Paragraph(".."));
                document.close();
      }
         catch (Exception e) {}
    }
    }
  