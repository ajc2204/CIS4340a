R02_EXP00_J Expressions (EXP)
// XP00-J: Don't ignore values retuyrned by methods. 

public void deleteFile(){
 
    File someFile = new File("someFileName.txt");
    // Do something with someFile
    if (!someFile.delete()) {
      // Handle failure to delete the file
    }
   
  }
