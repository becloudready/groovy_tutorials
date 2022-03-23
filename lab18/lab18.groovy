class Example {
   static void main(String[] args) {
      def src = new File("/home/kunal/groovy_tutorials/lab18/example.txt")
      def dst = new File("/home/kunal/groovy_tutorials/lab18/example-1.txt")
      dst << src.text
   } 
}