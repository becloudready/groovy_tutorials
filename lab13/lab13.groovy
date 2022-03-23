import java.io.File 
class Example { 
   static void main(String[] args) { 
      new File('/home/kunal/groovy_tutorials/lab13/','example.txt').withWriter('utf-8') { 
         writer -> writer.writeLine 'Hello World' 
      }  
   } 
}