import groovy.text.* 
import java.io.* 

def file = new File("/home/kunal/groovy_tutorials/lab43/text.json") 
def binding = ['name' : 'Roger', 'id' : 07, 'subject' : 'Tennis']
				  
def engine = new SimpleTemplateEngine() 
def template = engine.createTemplate(file) 
def writable = template.make(binding) 

println writable