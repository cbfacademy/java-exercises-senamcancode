package com.cbfacademy;

import com.cbfacademy.FileExtension;

import com.cbfacademy.nullFileNameException;

import java.lang.Exception;

public class FileExtension {

   public int check(String fileName) throws nullFileNameException {

      var extension = fileName.substring(fileName.lastIndexOf('.') + 1);

      if ((fileName == null) || fileName.equals("")) {
         throw new nullFileNameException("File name is null or empty");
      }
      if (extension.equals("java")) {
         return 1;

      } else {
         return 0;
      }
   }
}