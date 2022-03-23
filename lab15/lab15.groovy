class Example { 
   static void main(String[] args) { 
      def file = new File('/home/kunal/groovy_tutorials/lab15/lab15.groovy') 
      println "File? ${file.isFile()}" 
      println "Directory? ${file.isDirectory()}" 
   } 
}