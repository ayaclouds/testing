import java.io.FileWriter;
import java.io.IOException;

public class CopyResult {
	
	
	CopyResult(){
        String name = Window1.dobtxt.getText() +".txt";
//      System.out.println(name);
      try {
      
    	  FileWriter f = new FileWriter(name);
    	  f.write("\tname:"+Window1.nametxt.getText()+"\tlast name:"+Window1.compcodetxt.getText()+"\t id:"+Window1.dobtxt.getText()+"\n");
          f.write(WBC()+Neut()+Lymph()+RBC()+HCT()+Urea()+Hb()+Creatinine()+Iron()+HDL()+Phosphatase());
          //+Lymph()+RBC()+HCT()+Urea()+Hb()+Creatinine()+Iron()+HDL()+Phosphatase()
          f.close();
//          OutputStream.class("asdasdasd");
      } catch (IOException ioException) {
          ioException.printStackTrace();
      }
	}
	
	public String WBC() {
		if (Integer.parseInt(Window2.WBCtxt.getText())>=4500&&Integer.parseInt(Window2.WBCtxt.getText())<=11000 && Integer.parseInt(Window1.cardnumtxt.getText())>=18)
			return "WBC is proper!\n\n";
		else if(Integer.parseInt(Window2.WBCtxt.getText())>11000 && Integer.parseInt(Window1.cardnumtxt.getText())>=18)
			 return "Infection if there is a fever,  high values indicate blood disease, cancer\n Dedicated antibiotics,A combination of cyclophosphamide and corticosteroids,Entrectinib\n\n ";
		 else if (Integer.parseInt(Window2.WBCtxt.getText())<4500 && Integer.parseInt(Window1.cardnumtxt.getText())>=18)
			 return "Viral, immune system failure , cancer\n Rest at home,Entrectinib\n\n";
		
		 else if (Integer.parseInt(Window2.WBCtxt.getText())>=5500&&Integer.parseInt(Window2.WBCtxt.getText())<=15500 && Integer.parseInt(Window1.cardnumtxt.getText())>=4 &&Integer.parseInt(Window1.cardnumtxt.getText())<=17)
			 return "WBC is proper!\n\n";
		 else if (Integer.parseInt(Window2.WBCtxt.getText())>15500 && Integer.parseInt(Window1.cardnumtxt.getText())>=4 &&Integer.parseInt(Window1.cardnumtxt.getText())<=17)
			 return "Infection if there is a fever,  high values indicate blood disease, cancer\n Dedicated antibiotics,A combination of cyclophosphamide and corticosteroids,Entrectinib\n\n";
		 else if (Integer.parseInt(Window2.WBCtxt.getText())<5500 && Integer.parseInt(Window1.cardnumtxt.getText())>=4 &&Integer.parseInt(Window1.cardnumtxt.getText())<=17)
			 return "Viral, immune system failure , cancer\n Rest at home,Entrectinib\n\n";
		
		 else if (Integer.parseInt(Window2.WBCtxt.getText())<=17500 &&Integer.parseInt(Window2.WBCtxt.getText())>=6000  && Integer.parseInt(Window1.cardnumtxt.getText())<=3)
			 return "WBC is proper!\n\n"; 
		 else if (Integer.parseInt(Window2.WBCtxt.getText())>17500 && Integer.parseInt(Window1.cardnumtxt.getText())<=3)
			 return "Infection, if there is a fever,high values indicate blood disease or cancer\n Dedicated antibiotics,A combination of cyclophosphamide and corticosteroids,Entrectinib\n\n";
		 else if (Integer.parseInt(Window2.WBCtxt.getText())<6000 && Integer.parseInt(Window1.cardnumtxt.getText())<=3)
			 return "Viral, immune system failure , cancer\n Rest at home,Entrectinib\n\n";
		return "";
		 
	}
	public String Neut() {
		
		if(Integer.parseInt(Window2.Neuttxt.getText())>54) 
			return "Bacterial infection\n Dedicated antibiotics\n\n";
		if(Integer.parseInt(Window2.Neuttxt.getText())<28) 
			return "Disruption of blood formation, bacterial infections, a process cancerous\n 10 mg pill of B12 a day for a month and 5 mg pill of folic acid a day for a month,Dedicated antibiotics,Entrectinib\n\n";
			
			else if(Integer.parseInt(Window2.Neuttxt.getText())>=28&&Integer.parseInt(Window2.Neuttxt.getText())<=54)
				return "Neut is proper!\n\n";
		return "";
		}
			
		
	
	public String Lymph() {
		
		if(Integer.parseInt(Window2.Lymphtxt.getText())>52) 
			return "Prolonged bacterial infection , lymphoma cancer\n Dedicated antibiotics,Entrectinib \n\n";
		if(Integer.parseInt(Window2.Lymphtxt.getText())<36) 
			return "Indicate a problem in the formation of blood cells \n 10 mg pill of B12 a day for a month\n 5 mg pill of folic acid a day for a month \n\n";
			
		else if (Integer.parseInt(Window2.Lymphtxt.getText())>=36&&Integer.parseInt(Window2.Lymphtxt.getText())<=52)
			return "Lymph is proper\n\n";
		return "";
		}
			
	public String RBC() {
		
		if(Integer.parseInt(Window2.RBCtxt.getText())<4.5&&Window2.smokingtxt.getSelectedItem()=="no")
			return "Anemia, on severe bleeding \n Two 10 mg pills of B12 a day for a month,To be evacuated urgently to the hospital!\n\n";
	
			else if(Integer.parseInt(Window2.RBCtxt.getText())>6 &&Window2.smokingtxt.getSelectedItem()=="yes") 
					return "Disruption of the blood production system,High levels were also observed in smokers ,in patients with In lung diseases \n 10 mg pill of B12 a day for a month\n 5 mg pill of folic acid a day for a month,Stop smoking / refer to X-ray of the lungs \n\n";
			else if (Integer.parseInt(Window2.RBCtxt.getText())>6&&Window2.smokingtxt.getSelectedItem()=="no")
				return "Disruption of the blood production system \n  10 mg pill of B12 a day for a month and 5 mg pill of folic acid a day for a month \n\n";
			
			else if(Integer.parseInt(Window2.RBCtxt.getText())>=4.5&&Integer.parseInt(Window2.RBCtxt.getText())<=6 )
				return "RBC is proper \n\n";
		return "";
			
	}
	public String HCT() {
		
		if(Integer.parseInt(Window2.HCTtxt.getText())<37 &&Window1.gendertxt.getSelectedItem()=="male")
			return "Bleeding or anemia \n To be evacuated urgently to the hospital,Two 10 mg pills of B12 a day for a month\n\n";
		else if(Integer.parseInt(Window2.HCTtxt.getText())>54 &&Window1.gendertxt.getSelectedItem()=="male" &&Window2.smokingtxt.getSelectedItem()=="yes")
			return "Common in smokers so \n to stop smoking\n\n";
		else if(Integer.parseInt(Window2.HCTtxt.getText())>=37&&Integer.parseInt(Window2.HCTtxt.getText())<=54 )
			return "HCT is proper\n\n";
		
		if(Integer.parseInt(Window2.HCTtxt.getText())<33 &&Window1.gendertxt.getSelectedItem()=="female")
			return "Bleeding or anemia \n To be evacuated urgently to the hospital,Two 10 mg pills of B12 a day for a month\n\n";
		else if(Integer.parseInt(Window2.HCTtxt.getText())>47 &&Window1.gendertxt.getSelectedItem()=="female" &&Window2.smokingtxt.getSelectedItem()=="yes")
			return "Common in smokers so \n to stop smoking \n\n";
		else if(Integer.parseInt(Window2.HCTtxt.getText())>=33&&Integer.parseInt(Window2.HCTtxt.getText())<=47 )
			return "HCT is proper\n\n";
		return "";
		
	}
	public String Urea() {
		
		if(Integer.parseInt(Window2.Ureatxt.getText())>43 &&Window2.Orientaltxt.getSelectedItem()=="no")
			return "Kidney disease, dehydration ,a high protein diet\n Balance blood sugar levels,Complete rest lying down, returning fluids in drinking,Schedule an appointment with a nutritionist \n\n";
		else if (Integer.parseInt(Window2.Ureatxt.getText())>47.3 &&Window2.Orientaltxt.getSelectedItem()=="yes")
			return "Kidney disease, dehydration ,a high protein diet\n Balance blood sugar levels,Complete rest lying down, returning fluids in drinking,Schedule an appointment with a nutritionist \n\n";
		else if(Integer.parseInt(Window2.Ureatxt.getText())<18.7 &&Window2.Orientaltxt.getSelectedItem()=="yes"
				&&Window1.gendertxt.getSelectedItem()=="female"||Integer.parseInt(Window2.Ureatxt.getText())<17 &&Window2.Orientaltxt.getSelectedItem()=="no"&&
				Window1.gendertxt.getSelectedItem()=="female")
			return "Malnutrition, low-protein diet or liver disease  if she pregnant During pregnancy the level of urination decreases\n Schedule an appointment with a nutritionist,Schedule an appointment with a nutritionist,Referral to a specific diagnosis for the purpose of determining treatment \n\n";
			
			
		else if (Integer.parseInt(Window2.Ureatxt.getText())<18.7 &&Window2.Orientaltxt.getSelectedItem()=="yes")
			return "Malnutrition, low-protein diet or liver disease \n Schedule an appointment with a nutritionist,Schedule an appointment with a nutritionist,Referral to a specific diagnosis for the purpose of determining treatment \n\n";
		else if (Integer.parseInt(Window2.Ureatxt.getText())<17 &&Window2.Orientaltxt.getSelectedItem()=="no")
			return "Malnutrition, low-protein diet or liver disease \n Schedule an appointment with a nutritionist,Schedule an appointment with a nutritionist,Referral to a specific diagnosis for the purpose of determining treatment \n\n";
		else if (Integer.parseInt(Window2.Ureatxt.getText())>=17&&Integer.parseInt(Window2.Ureatxt.getText())<=43&&Window2.Orientaltxt.getSelectedItem()=="no" )
			return "Urea is proper\n\n";
		else if (Integer.parseInt(Window2.Ureatxt.getText())>=18.7&&Integer.parseInt(Window2.Ureatxt.getText())<=47.3&&Window2.Orientaltxt.getSelectedItem()=="yes" )
			return "Urea is proper\n\n";
		return "";
	

}
	public String Hb() {
		
		if(Integer.parseInt(Window2.Hbtxt.getText())<12 && Integer.parseInt(Window1.cardnumtxt.getText())>=18) 
			return "Anemia, hematologic disorder, iron deficiency,bleeding\n Two 10 mg pills of B12 a day for a month, An injection of a hormone to encourage red blood cell production,Two 10 mg pills of B12 a day for a month,To be evacuated urgently to the hospital\n\n";
		else if(Integer.parseInt(Window2.Hbtxt.getText())<11.5 && Integer.parseInt(Window1.cardnumtxt.getText())<=17)
			return "Anemia, hematologic disorder, iron deficiency,bleeding\n Two 10 mg pills of B12 a day for a month, An injection of a hormone to encourage red blood cell production,Two 10 mg pills of B12 a day for a month,To be evacuated urgently to the hospital\n\n";
		else if(Integer.parseInt(Window2.Hbtxt.getText())<11.5 && Integer.parseInt(Window1.cardnumtxt.getText())<=17)
			return "Anemia, hematologic disorder, iron deficiency,bleeding\n Two 10 mg pills of B12 a day for a month, An injection of a hormone to encourage red blood cell production,Two 10 mg pills of B12 a day for a month,To be evacuated urgently to the hospital\n\n";
		else if(Integer.parseInt(Window2.Hbtxt.getText())>=12 &&Integer.parseInt(Window2.Hbtxt.getText())<=16 && Integer.parseInt(Window1.cardnumtxt.getText())>=18&&Window1.gendertxt.getSelectedItem()=="female")
			return "Urea is proper\n\n";
		else if(Integer.parseInt(Window2.Hbtxt.getText())>=12 &&Integer.parseInt(Window2.Hbtxt.getText())<=18 && Integer.parseInt(Window1.cardnumtxt.getText())>=18&&Window1.gendertxt.getSelectedItem()=="male"&& Integer.parseInt(Window1.cardnumtxt.getText())>=18)
			return "Urea is proper\n\n";
		else if(Integer.parseInt(Window2.Hbtxt.getText())>=11.5 &&Integer.parseInt(Window2.Hbtxt.getText())<=15.5&& Integer.parseInt(Window1.cardnumtxt.getText())<=17)
			return "Urea is proper\n\n";
		return "";
	}
	public String Creatinine() {
		
		if(Integer.parseInt(Window2.Creatininetxt.getText())>0.5&&Integer.parseInt(Window1.cardnumtxt.getText())<=2)
			return "Kidney problem, kidney failure. Diarrhea and vomiting cause increased muscle breakdown and high levels of creatinine, muscle diseases ,increased consumption of meat\n Balance blood sugar levels,Two 5 mg pills of Altman c3 turmeric a day for a month,Schedule an appointment with a nutritionist\n\n";
		
		else if(Integer.parseInt(Window2.Creatininetxt.getText())>1&&Integer.parseInt(Window1.cardnumtxt.getText())>=3 &&Integer.parseInt(Window1.cardnumtxt.getText())<=17)
			return "Kidney problem, kidney failure. Diarrhea and vomiting cause increased muscle breakdown and high levels of creatinine, muscle diseases ,increased consumption of meat\nBalance blood sugar levels,Two 5 mg pills of Altman c3 turmeric a day for a month,Schedule an appointment with a nutritionist\n\n";
		
		else if(Integer.parseInt(Window2.Creatininetxt.getText())>1&&Integer.parseInt(Window1.cardnumtxt.getText())>=18 &&Integer.parseInt(Window1.cardnumtxt.getText())<=59)
			return "Kidney problem, kidney failure. Diarrhea and vomiting cause increased muscle breakdown and high levels of creatinine, muscle diseases ,increased consumption of meat\n Balance blood sugar levels,Two 5 mg pills of Altman c3 turmeric a day for a month,Schedule an appointment with a nutritionist\n\n";
		
		else if(Integer.parseInt(Window2.Creatininetxt.getText())>1.2&&Integer.parseInt(Window1.cardnumtxt.getText())>=60)
			return "Kidney problem, kidney failure. Diarrhea and vomiting cause increased muscle breakdown and high levels of creatinine, muscle diseases ,increased consumption of meat\nBalance blood sugar levels,Two 5 mg pills of Altman c3 turmeric a day for a month,Schedule an appointment with a nutritionist\n\n";
		 else if (Integer.parseInt(Window2.Creatininetxt.getText())<0.2&&Integer.parseInt(Window1.cardnumtxt.getText())<=2)
			 return "In patients with very poor muscle mass and malnourished people who do not consume enough protein\n Two 5 mg pills of Altman c3 turmeric a day for a month,Schedule an appointment with a nutritionist\n\n";
		 else if(Integer.parseInt(Window2.Creatininetxt.getText())<0.5&&Integer.parseInt(Window1.cardnumtxt.getText())>=3 &&Integer.parseInt(Window1.cardnumtxt.getText())<=17)
			 return "In patients with very poor muscle mass and malnourished people who do not consume enough protein\n Two 5 mg pills of Altman c3 turmeric a day for a month,Schedule an appointment with a nutritionist\n\n";
		 else if(Integer.parseInt(Window2.Creatininetxt.getText())<0.6&&Integer.parseInt(Window1.cardnumtxt.getText())>=18 &&Integer.parseInt(Window1.cardnumtxt.getText())<=59)
			 return "In patients with very poor muscle mass and malnourished people who do not consume enough protein\n Two 5 mg pills of Altman c3 turmeric a day for a month,Schedule an appointment with a nutritionist\n\n";
		
		 else if(Integer.parseInt(Window2.Creatininetxt.getText())<0.6&&Integer.parseInt(Window1.cardnumtxt.getText())>=60)
			 return "In patients with very poor muscle mass and malnourished people who do not consume enough protein\n Two 5 mg pills of Altman c3 turmeric a day for a month,Schedule an appointment with a nutritionist\n\n";
		 else if(Integer.parseInt(Window2.Creatininetxt.getText())>=0.2&&Integer.parseInt(Window2.Creatininetxt.getText())<=0.5 &&Integer.parseInt(Window1.cardnumtxt.getText())<=2)
			 return "Creatinine is proper\n\n";
			 
		 else if(Integer.parseInt(Window2.Creatininetxt.getText())>=0.5&&Integer.parseInt(Window2.Creatininetxt.getText())<=1 &&Integer.parseInt(Window1.cardnumtxt.getText())>=3&&Integer.parseInt(Window1.cardnumtxt.getText())<=17)
			 return "Creatinine is proper\n\n";
		 else if(Integer.parseInt(Window2.Creatininetxt.getText())>=0.6&&Integer.parseInt(Window2.Creatininetxt.getText())<=1 &&Integer.parseInt(Window1.cardnumtxt.getText())>=18&&Integer.parseInt(Window1.cardnumtxt.getText())<=59)
			 return "Creatinine is proper\n\n";
		 else if(Integer.parseInt(Window2.Creatininetxt.getText())>=0.6&&Integer.parseInt(Window2.Creatininetxt.getText())<=1.2 &&Integer.parseInt(Window1.cardnumtxt.getText())>=60)
			 return "Creatinine is proper\n\n";
		return "";
	}
	
	public String Iron() {
		
		if(Integer.parseInt(Window2.Irontxt.getText())<60&&Window1.gendertxt.getSelectedItem()=="male")
			return "Inadequate nutrition or an increase in iron intake or blood loss after bleeding\n Schedule an appointment with a nutritionist,To be evacuated urgently to the hospital\n\n";
		else if(Integer.parseInt(Window2.Irontxt.getText())<48&&Window1.gendertxt.getSelectedItem()=="female")
			return "Inadequate nutrition or an increase in iron(like pregnant) intake or blood loss after bleeding\n Schedule an appointment with a nutritionist,To be evacuated urgently to the hospital\n\n";
		else if(Integer.parseInt(Window2.Irontxt.getText())>160&&Window1.gendertxt.getSelectedItem()=="male")
			return "May indicate iron poisoning\n To be evacuated to the hospital\n\n";
		else if(Integer.parseInt(Window2.Irontxt.getText())>128&&Window1.gendertxt.getSelectedItem()=="female")
			return "May indicate iron poisoning\n To be evacuated to the hospital\n\n";
			
		else if(Integer.parseInt(Window2.Irontxt.getText())>60 &&Integer.parseInt(Window2.Irontxt.getText())<160 &&Window1.gendertxt.getSelectedItem()=="male")
			return "Iron is proper\n\n";
		else if(Integer.parseInt(Window2.Irontxt.getText())>48 &&Integer.parseInt(Window2.Irontxt.getText())<128 &&Window1.gendertxt.getSelectedItem()=="female")
			return "Iron is proper\n\n";
		return "";
	
	}
	public String HDL() {
		
		if(Integer.parseInt(Window2.HDLtxt.getText())>74.4 &&Window1.gendertxt.getSelectedItem()=="male"&&Window2.Ethiopianstxt.getSelectedItem()=="yes")
			return "Are usually harmless. Exercise raises good cholesterol levels\n Doing sport ";
		else if(Integer.parseInt(Window2.HDLtxt.getText())>62 &&Window1.gendertxt.getSelectedItem()=="male"&&Window2.Ethiopianstxt.getSelectedItem()=="no")
			return "Are usually harmless. Exercise raises good cholesterol levels\n Doing sport ";
		else if(Integer.parseInt(Window2.HDLtxt.getText())>98.4 &&Window1.gendertxt.getSelectedItem()=="female"&&Window2.Ethiopianstxt.getSelectedItem()=="yes")
			return "Are usually harmless. Exercise raises good cholesterol levels\n Doing sport ";
		else if(Integer.parseInt(Window2.HDLtxt.getText())>82 &&Window1.gendertxt.getSelectedItem()=="female"&&Window2.Ethiopianstxt.getSelectedItem()=="no")
			return "Are usually harmless. Exercise raises good cholesterol levels\n Doing sport ";
		else if(Integer.parseInt(Window2.HDLtxt.getText())<34.4 &&Window1.gendertxt.getSelectedItem()=="male"&&Window2.Ethiopianstxt.getSelectedItem()=="yes")
			return "Risk of heart disease, on hyperlipidemia, diabetes in adults\n Schedule an appointment with a nutritionist,Schedule an appointment with a nutritionist, a 5 mg pill of Simobil daily for a week,Insulin adjustment for the patient\n\n";
		else if(Integer.parseInt(Window2.HDLtxt.getText())<29 &&Window1.gendertxt.getSelectedItem()=="male"&&Window2.Ethiopianstxt.getSelectedItem()=="no")
			return "Risk of heart disease, on hyperlipidemia, diabetes in adults\n Schedule an appointment with a nutritionist,Schedule an appointment with a nutritionist, a 5 mg pill of Simobil daily for a week,Insulin adjustment for the patient\n\n";
		else if(Integer.parseInt(Window2.HDLtxt.getText())<40.8 &&Window1.gendertxt.getSelectedItem()=="female"&&Window2.Ethiopianstxt.getSelectedItem()=="yes")
			
			return "Risk of heart disease, on hyperlipidemia, diabetes in adults\n Schedule an appointment with a nutritionist,Schedule an appointment with a nutritionist, a 5 mg pill of Simobil daily for a week,Insulin adjustment for the patient\n\n";
		
		else if(Integer.parseInt(Window2.HDLtxt.getText())<34 &&Window1.gendertxt.getSelectedItem()=="female"&&Window2.Ethiopianstxt.getSelectedItem()=="no")
			return "Risk of heart disease, on hyperlipidemia, diabetes in adults\n Schedule an appointment with a nutritionist,Schedule an appointment with a nutritionist, a 5 mg pill of Simobil daily for a week,Insulin adjustment for the patient\n\n";
		else if(Integer.parseInt(Window2.HDLtxt.getText())<=74.4&&Integer.parseInt(Window2.HDLtxt.getText())>=34.4  &&Window1.gendertxt.getSelectedItem()=="male"&&Window2.Ethiopianstxt.getSelectedItem()=="yes")
			return "HDL is proper\n\n";
		else if(Integer.parseInt(Window2.HDLtxt.getText())<=62&&Integer.parseInt(Window2.HDLtxt.getText())>=29  &&Window1.gendertxt.getSelectedItem()=="male"&&Window2.Ethiopianstxt.getSelectedItem()=="no")
			return "HDL is proper\n\n";
		else if (Integer.parseInt(Window2.HDLtxt.getText())>=40.8&&Integer.parseInt(Window2.HDLtxt.getText())<=98.4 &&Window1.gendertxt.getSelectedItem()=="female"&&Window2.Ethiopianstxt.getSelectedItem()=="yes")
			return "HDL is proper\n\n";
		else if(Integer.parseInt(Window2.HDLtxt.getText())<=82&&Integer.parseInt(Window2.HDLtxt.getText())>=34  &&Window1.gendertxt.getSelectedItem()=="male"&&Window2.Ethiopianstxt.getSelectedItem()=="no")
			return "HDL is proper\n\n";
		return "";
	}
	public String Phosphatase() {
		
		if (Integer.parseInt(Window2.Phosphatasetxt.getText())>120&&Window2.Orientaltxt.getSelectedItem()=="yes")
			return "Liver disease, biliary tract disease, pregnancy if patient is female, hypothyroidism,Use of various medications\n Referral to a specific diagnosis for the purpose of determining treatment,Referral to surgical treatment,Referral to a family doctor for a match between medications\n\n";
		else if(Integer.parseInt(Window2.Phosphatasetxt.getText())>90&&Window2.Orientaltxt.getSelectedItem()=="no")
			return "Liver disease, biliary tract disease, pregnancy if patient is female, hypothyroidism,Use of various medications\n Referral to a specific diagnosis for the purpose of determining treatment,Referral to surgical treatment,Referral to a family doctor for a match between medications\n\n";
		else if (Integer.parseInt(Window2.Phosphatasetxt.getText())<60 &&Window2.Orientaltxt.getSelectedItem()=="yes")
			return "On poor nutrition that lacks protein. Deficiency in vitamins like vitamin, vitamin B12,Vitamin B6 folic acid\n Schedule an appointment with a nutritionist,Referral for a blood test to identify the missing vitamins\n\n";
	
		else if (Integer.parseInt(Window2.Phosphatasetxt.getText())<30&&Window2.Orientaltxt.getSelectedItem()=="no")
			return "On poor nutrition that lacks protein. Deficiency in vitamins like vitamin, vitamin B12,Vitamin B6 folic acid\n Schedule an appointment with a nutritionist,Referral for a blood test to identify the missing vitamins\n\n";
		else if (Integer.parseInt(Window2.Phosphatasetxt.getText())>=60&&Integer.parseInt(Window2.Phosphatasetxt.getText())<=120&&Window2.Orientaltxt.getSelectedItem()=="yes")
			return "Phosphatase is proper\n\n";
		else if (Integer.parseInt(Window2.Phosphatasetxt.getText())>=30&&Integer.parseInt(Window2.Phosphatasetxt.getText())<=90&&Window2.Orientaltxt.getSelectedItem()=="no")
			return "Phosphatase is proper\n\n";
		return ""; 
	}

}
