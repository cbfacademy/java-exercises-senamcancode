package com.cbfacademy;

import com.cbfacademy.FileExtension;

//this is the FileExtension class which contains the check method
//this method throws the exception is teh filename is null or an empty string 
//if the extension contains java, the int 1 is returned
//if the extension does not contain java the int 0 is returned

public class FileExtension {

   public int check(String fileName) throws nullFileNameException {

      if ((fileName == null) || fileName.equals("")) {
         throw new nullFileNameException("File name is null or empty");
      }

      // extension was moved to here to prevent the code checking the extension before
      // checking whether the fileName is null or empty
      var extension = fileName.substring(fileName.lastIndexOf('.') + 1);
      if (extension.equals("java")) {
         return 1;

      } else {
         return 0;
      }
   }
}