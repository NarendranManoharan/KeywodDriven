package CoreEngine;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.asynchttpclient.util.HttpConstants.Methods;

import Utilities.Excelutilities;
import keywords.actionKeywords;

public class Engine {
	 
	   static String value;
       static actionKeywords actionKeywords=new actionKeywords();
       static Method[] methods;
       
        
	public void executekeywords() throws Exception {
		//Reflection API
		 methods=actionKeywords.getClass().getMethods();
		 for (int i = 0; i<methods.length; i++) {
			if(methods[i].getName().equalsIgnoreCase(Excelutilities.Keywordvalue)) {
				methods[i].invoke(actionKeywords);
				System.out.println(methods[i]);
				break;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		int locatorsindex=2;
		int Keywordindex=locatorsindex+1;
		int dataindex = locatorsindex+2;
		
		Excelutilities excelutilities=new Excelutilities();
		excelutilities.readexcel("D:\\testing\\Automation\\InputDetails.xlsx");
		 
		for(int i=1; i<=excelutilities.excelrowcount; i++) {
		// value=excelutilities.cellvaluefromEXCEL(i, i,i , i);
			excelutilities.cellvaluefromEXCEL(i, locatorsindex, Keywordindex, dataindex);
			
	     Engine engine=new Engine();
		 engine.executekeywords();
		

			/*
			 * if(value.equalsIgnoreCase("OpenBrowser")) { 
			 * actionKeywords.OpenBrowser(); 
			 * }
			 * else if(value.equalsIgnoreCase("goToURL")) {
			 *  actionKeywords.goToURL(); 
			 *  } 
			 *  else if(value.equalsIgnoreCase("enterUsername")) {
			 *   actionKeywords.enterUsername();
			 * }
			 *  else if(value.equalsIgnoreCase("enterPassword")) {
			 * actionKeywords.enterPassword(); 
			 * } else if(value.equalsIgnoreCase("clickLogin")) {
			 *  actionKeywords.clickLogin(); 
			 *  }
			 */			
			
		}
		
		
	}

}
