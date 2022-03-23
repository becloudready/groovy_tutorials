class Example {
   static void main(String[] args) {
      File file = new File("/home/kunal/groovy_tutorials/lab14/example.txt")
      println "The file ${file.absolutePath} has ${file.length()} bytes"
   } 
}
