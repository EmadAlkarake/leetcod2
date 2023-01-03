package leetCode;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

public class Main {
	

	public static void main(String[] args) {
		File fileInput= new File("C:/Users/PC/Desktop/New folder (3)/text.txt");
		File outPut= new File("C:/Users/PC/Desktop/New folder (3)/new text.txt");
		//copyFile(fileInput, outPut);
		/////////////////////////////////////////////////////////////////////////////////
		//File sourcePath= new File("C:/Users/PC/Desktop/New folder (3)/text.txt");
		//File destinationPath= new File("C:/Users/PC/Desktop/New folder (3)/new text.txt");
//		 try (FileReader reader = new FileReader(sourcePath);
//		         FileWriter writer = new FileWriter(destinationPath)) {
//		      int c;
//		      while ((c = reader.read()) != -1) {
//		        writer.write(c);
//		      }
//		    } catch (IOException e) {
//		      e.printStackTrace();
//		    }
		 /////////////////////////////////////////////////////////////////////////		 
		 readFile("C:/Users/PC/Desktop/New folder (3)/text.txt");
		///////////////////////////////////////////////////////////////////////
		 List<String> lines = Arrays.asList("line 1", "line 2", "line 3");
		    writeLinesToFile(lines, "C:/Users/PC/Desktop/New folder (3)/text.txt");
		 
	}
	////////////////////////////////////////////////////////////////////////////
	
	

	public static void copyFile(File sourcePath, File destinationPath) {
	    try (FileInputStream in = new FileInputStream(sourcePath);
	         FileOutputStream out = new FileOutputStream(destinationPath)) {
	      // Read a byte from the input stream and write it to the output stream
	      int b;
////////////////////comment with git hub	     
 while ((b = in.read()) != -1) {
	        out.write(b);
	      }
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	  }
	
	/////////////////////////////////////////////////////////////////////////////
	public static void readFile(String filePath) {
	    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	      String line;
	      while ((line = reader.readLine()) != null) {
	        System.out.println(line);
	      }
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	  }
	/////////////////////////////////////////////////////////////////////////////////////
	
	public static void copy(File source,File destination)throws IOException {
		
		try(InputStream in = new BufferedInputStream(new FileInputStream(source));
				OutputStream out= new BufferedOutputStream(new FileOutputStream(destination))){
			
			byte[] buffer= new byte[1024];
			int lengthRead;
			while ((lengthRead= in.read(buffer))>0) {
				out.write(buffer,0,lengthRead);
				out.flush();
			}
		}
		
	}
	////////////////////////////////////
	public static void writeLinesToFile(List<String> lines, String filePath) {
	    try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
	      for (String line : lines) {
	        bw.write(line);
	        bw.newLine();
	      }
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	  }
	
	}

