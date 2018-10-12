package com.vacker.example.file_examples;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;

public class FileOperationsTest {
	
	private static SimpleDateFormat DATEFORMAT = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public static void main(String[] args) throws IOException {
		FileOperationsTest.whenFileLastModified(); //to check when the file is modified
		accessingRemoteServerFiles();
	}
	
	public static void whenFileLastModified() {
		try {
			File file = new File("E:/Documents/Uploaded/143_04112017193554.mp4");//
			if(file.exists()) {
				System.out.println("Before Format : " + file.lastModified());
				System.out.println("After Format : " + DATEFORMAT.format(file.lastModified()));
			}
		} catch (Exception e) {
			System.out.println("Excption message ::: "+e.getMessage().toString());
		}
	}
	
	//accessing remote serevr files
	public static void accessingRemoteServerFiles() throws IOException {
//		URL url = new URL("file://35.176.76.244/usr/local/WowzaStreamingEngine-4.7.0/content/17_Live_20171031_233608.mp4");
//		File file = new 
//		FileUtils.copyURLToFile(url, f);
		
		URL url = new URL("");
		URLConnection uc = url.openConnection();
		String userpass = "ubuntu" + ":" + "";
		String basicAuth = "Basic " + javax.xml.bind.DatatypeConverter.printBase64Binary(userpass.getBytes());
		uc.setRequestProperty ("Authorization", basicAuth);
		String lastModified = uc.getHeaderField("Last-Modified");
		
//		URLConnection connection = new URL("http://35.176.76.244/usr/local/WowzaStreamingEngine-4.7.0/content/17_Live_20171031_233608.mp4").openConnection();
//		String lastModified = connection.getHeaderField("Last-Modified");
		System.out.println(lastModified);
	}
	
	
	

}
