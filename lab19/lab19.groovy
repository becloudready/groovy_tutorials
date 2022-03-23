class Example {
   static void main(String[] args) {
      new File("/home/kunal/groovy_tutorials/lab19").eachFile() {  
         file->println file.getAbsolutePath()
      }
   } 
}