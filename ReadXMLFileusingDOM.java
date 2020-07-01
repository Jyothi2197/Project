import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class ReadXMLFileusingDOM {
	public static void main(String[]args)
	
	{
		try
		{
			File xmlDOC=new File("students.xml");
			DocumentBuilderFactory dbfact=DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuild= dbfact. newDocumentBuilder();
			Document doc=dBuild.parse(xmlDOC);
			//read root element
			//									doc locate root			give me its name
			System.out.println("Root element:"+doc.getDocumentElement().getNodeName());
			
			//read array of elements
			//this array is nodelist
			NodeList nList=doc.getElementsByTagName("student");
			for(int i=0;i<nList.getLength();i++)
			{
				Node nNode = nList.item(i);
				System.out.println("Node name:"+nNode.getNodeName()+" "+(i+1));
				if(nNode.getNodeType()== Node.ELEMENT_NODE)
				{
					Element eElement = (Element) nNode;
					System.out.println("Student ID#:"+eElement.getAttribute("idno"));
					System.out.println("Student Firstname:"
									+eElement.getElementsByTagName("firstname").item(i).getTextContent());
					
					System.out.println("Student LastName:"
							+eElement.getElementsByTagName("lastname").item(i).getTextContent());
					System.out.println("Student Score:"
							+eElement.getElementsByTagName("score").item(i).getTextContent());
					
					
					
					System.out.println("...................................");

					
				}
			}
			
		}
		catch(Exception e) {
			
		}
		
		
	}
	

}
