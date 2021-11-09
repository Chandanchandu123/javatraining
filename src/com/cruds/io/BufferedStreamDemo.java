package com.cruds.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedStreamDemo {

	public static void main(String[] args) {
		
		try 
			(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("info.txt"));
			BufferedOutputStream bos = new BufferedOutputStream(System.out);)
		{
			byte[] data = new byte[100];
			boolean eof = false;
			
			while(!eof)
			{
				int len = bis.read(data);
				
				if(len == -1)
				{
					eof = true;
				}
				else
				{
					bos.write(data, 0, len);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
