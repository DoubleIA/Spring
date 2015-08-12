package springresource;

import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.core.io.UrlResource;

/**
 * 
 * Resource: getInputStream()
 * 			 exits()
 * 			 isOpen()
 * 			 getDescription()
 * 			 getFile()
 * 			 getURL()
 * @author wangyingbo
 * @description UrlResource
 */
public class ResourceTest {
	public static void main(String[] args) throws Exception {
		UrlResource ur = new UrlResource("file:src/main/java/chinesecollection.xml");
		
		System.out.println(ur.getFilename());
		System.out.println(ur.getDescription());
		
		SAXReader reader = new SAXReader();
		Document doc = reader.read(ur.getFile());
		Element e1 = doc.getRootElement();
		List<?> l = e1.elements();
		for (Iterator<?> it = l.iterator(); it.hasNext();) {
			Element collection = (Element)it.next();
			@SuppressWarnings("unchecked")
			List<Element> l1 = collection.elements();
			
			for (Iterator<Element> it1 = l1.iterator(); it1.hasNext(); ) {
				Element e2 = (Element)it1.next();
				System.out.println(e2.getName());
			}
		}
	}
}
