import java.io.File 
class Example { 
   static void main(String[] args) { 
      new File("/home/kunal/groovy_tutorials/lab11/test.txt").eachLine {  
         line -> println "line : $line"; 
      } 
   } 
}